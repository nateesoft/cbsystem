package th.co.cbank.project.view;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import th.co.cbank.project.control.CbSaveConfigControl;
import th.co.cbank.project.control.CbTransactionLoanControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.CbSaveConfigBean;
import th.co.cbank.project.model.CbTransactionSaveBean;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.ThaiUtil;

public class TransactionAdvanceMethod {

    private static final CbSaveConfigControl saveConfigControl = new CbSaveConfigControl();
    private static final CbTransactionLoanControl cbTransactionLoanControl = new CbTransactionLoanControl();
    private static final CbTransactionSaveControl cbTransactionSaveControl = new CbTransactionSaveControl();
    
    public static double balanceAmount = 0;
    public static double interestAmount = 0;

    public static void updateSaveAccountAndProfile(String custCode, String accCode, double netBalance, double textInt) {
        //update cb_save_account
        try {
            String sql = "update cb_save_account set "
                    + "b_balance='" + netBalance + "',"
                    + "b_interest='" + textInt + "' "
                    + "where b_cust_code='" + custCode + "' "
                    + "and account_code='" + accCode + "'";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //update cb_profile
        try {
            String sql1 = "update cb_profile p set p.save_balance=("
                + "select sum(s.b_balance) from cb_save_account s "
                + "where s.b_cust_code=p.p_custcode "
                + "and s.account_code='" + accCode + "'"
                + ") where p.p_custcode='" + custCode + "';";
            MySQLConnect.exeUpdate(sql1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static List findData(String custCode, String accCode, boolean addModel) {
        double show1 = 0.00;//?????????
        double show2 = 0.00;//?????????
        double show3 = 0.00;//?????????????????????
        double show4 = 0.00;//???????????????????????????
        double show5 = 0.00;//????????????????????????????????????

        balanceAmount = 0;
        interestAmount = 0;

        List modelList = new ArrayList<>();
        String date = "";
        try {
            String sql = "select t_date from cb_transaction_save "
                    + "where t_status in('2','3','8') "
                    + "and t_custcode='" + custCode + "' "
                    + "and t_acccode='" + accCode + "' "
                    + "group by t_date "
                    + "order by t_date";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                date += DateFormat.getLocale_ddMMyyyy(rs.getDate("t_date")) + ",";
            }
            date += DateFormat.getLocale_ddMMyyyy(new Date());
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //add to model
        String[] dates = date.split(",");
        Date dateStart = DateFormat.getLocal_ddMMyyyy(dates[0]);
        Date dateEnd = DateFormat.getLocal_ddMMyyyy(dates[dates.length - 1]);

        Calendar c = Calendar.getInstance();
        c.setTime(dateStart);

        boolean isLoop = false;
        CbSaveConfigBean cfBean = saveConfigControl.listSaveConfig(accCode);
        int dayCount = 0;
        String temp_date = "";

        double all_balance = 0.00;//????????????????????????????????? balance
        double all_interest = 0.00;//??????????????????????????????????????????????????????????????????
        double all_money = 0.00;//?????????????????????
        int LineNo = 0;

        while (!isLoop) {
            String dateStr = DateFormat.getLocale_ddMMyyyy(c.getTime());
            if (temp_date.equals("")) {
                temp_date = dateStr;
            }
            if (!temp_date.equals(dateStr)) {
                dayCount++;
            }

            ItemRows data = new ItemRows();
            data.setT_date(c.getTime());
            data.setT_time("");
            data.setT_docno("");
            data.setRemark("");
            data.setInterest_rate(cfBean.getTypeINT());
            data.setT_day(dayCount);
            data.setBalance(all_balance);
            data.setT_interest((data.getT_day() * data.getInterest_rate() * all_balance) / (36500));
            data.setT_interest_balance(all_interest);
            data.setPrinciple(all_money);

            boolean isDateIn = false;
            for (int i = 0; i < dates.length; i++) {
                if (dates[i].equals(DateFormat.getLocale_ddMMyyyy(c.getTime()))) {
                    List<CbTransactionSaveBean> listBean = cbTransactionSaveControl.getTransaction(custCode, accCode, c.getTime());
                    double temp_all_interest = all_interest;

                    for (int j = 0; j < listBean.size(); j++) {
                        CbTransactionSaveBean bean1 = (CbTransactionSaveBean) listBean.get(j);

                        ItemRows data2 = new ItemRows();
                        data2.setT_date(bean1.getT_date());
                        data2.setT_time(bean1.getT_time());
                        data2.setT_docno(bean1.getT_docno());
                        all_balance += bean1.getT_amount();
                        if (all_balance < 1) {
                            all_balance = 0;
                        }

                        //????????????????????????????????????????????????
                        all_money += bean1.getT_amount();
                        data2.setPrinciple(all_money);
                        data2.setBalance(all_balance);
                        data2.setT_interest((data2.getT_day() * data2.getInterest_rate() * all_balance) / (36500));
                        data2.setT_day(0);

                        all_interest = data.getT_interest() + temp_all_interest;
                        //temp_all_interest = 0;

                        if (bean1.getT_amount() >= 0) {
                            data2.setDeposit(bean1.getT_amount());
                            data2.setRemark("<html><font color=blue><b>?????????????????????</b></font></html>");
                            show1 += bean1.getT_amount();
                            data2.setT_interest_balance(all_interest);
                        } else {
                            data2.setWithdraw(bean1.getT_amount());
                            data2.setRemark("<html><font color=red><b>?????????????????????</b></font></html>");
                            show2 += bean1.getT_amount() * -1;
                            data2.setT_interest_balance(all_interest);
                        }

                        data2.setInterest_rate(cfBean.getTypeINT());
                        data2.setIsPrint("Y");
                        LineNo++;

                        data2.setLineNo("" + LineNo);
                        data2.setProfit(data2.getBalance() - data2.getPrinciple());
                        if (addModel) {
                            modelList.add(data2.toObject());
                        }

                        //update recode
                        try {
                            String sql = "update cb_transaction_save set "
                                    + "t_balance='" + data2.getBalance() + "' "
                                    + "where t_custcode='" + custCode + "' "
                                    + "and t_acccode='" + accCode + "' "
                                    + "and t_docno='" + data2.getT_docno() + "' "
                                    + "and t_time='" + data2.getT_time() + "' "
                                    + "and t_status in('2','3','8')";
                            MySQLConnect.exeUpdate(sql);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());

                        }
                    }

                    isDateIn = true;
                    dayCount = 0;
                    break;
                }
            }

            boolean isUpdate = false;
            //check ????????????????????????????????????????????????????????????????????????????????????
            if (cfBean.getPayType().equals("2")) {
                int dd_db1 = cfBean.getCbPayType1();
                int mm_db1 = cfBean.getCbPayType2();
                Calendar c1 = Calendar.getInstance(Locale.ENGLISH);
                c1.setTime(c.getTime());//?????????????????????????????????????????????????????????????????????????????????????????? ???????????????????????????????????????????????????????????????
                c1.set(Calendar.DATE, dd_db1);
                c1.set(Calendar.MONTH, mm_db1 - 1);
                if (c1.getTime().compareTo(c.getTime()) == 0) {
                    data.setT_time("00:00:00");
                    data.setRemark("<html><font color=green><b>???????????????????????????????????????????????????</b></font></html>");
                    data.setIsPrint("Y");
                    LineNo++;
                    data.setLineNo("" + LineNo);

                    data.setBalance(all_balance + data.getT_interest() + data.getT_interest_balance());
                    data.setDeposit_interest(data.getT_interest() + data.getT_interest_balance());
                    show4 += data.getDeposit_interest();
                    data.setT_interest_balance(0);
                    all_interest = 0;//clear ????????????????????????????????????????????????
                    data.setT_interest(0);
                    dayCount = 0;
                    all_balance = data.getBalance();
                    isUpdate = true;

                    //insert ?????????????????????????????????
                    int lineNo = cbTransactionLoanControl.getLineByAccount(accCode);
                    int tIndex = lineNo;
                    if (tIndex > 24) {
                        tIndex = tIndex % 24;
                    }
                    CbTransactionSaveBean bean = new CbTransactionSaveBean();
                    bean.setT_date(data.getT_date());
                    bean.setT_time(data.getT_time());
                    bean.setT_acccode(accCode);
                    bean.setT_custcode(custCode);
                    bean.setT_description(ThaiUtil.Unicode2ASCII("?????????????????????(????????????????????????)"));
                    bean.setT_amount(data.getDeposit_interest());
                    bean.setT_empcode("system");
                    bean.setT_docno("");
                    bean.setT_booktype("INT");
                    bean.setLineNo(lineNo);
                    bean.setPrintChk("N");
                    bean.setT_balance(data.getBalance());
                    bean.setT_index(tIndex);
                    bean.setMoney_in(data.getDeposit_interest());
                    bean.setMoney_out(0);
                    bean.setBranchCode(Value.BRANCH_CODE);
                    bean.setT_interest(0);
                    bean.setT_fee(0);
                    bean.setT_status("11");

                    if (bean.getT_amount() > 0) {
                        cbTransactionSaveControl.saveCbTransactionSave(bean);
                    }
                }
            } else if (cfBean.getPayType().equals("3")) {
                //????????????????????? 1
                int dd_db1 = cfBean.getCbPayType3();
                int mm_db1 = cfBean.getCbPayType4();
                Calendar c1 = Calendar.getInstance(Locale.ENGLISH);
                c1.setTime(c.getTime());//?????????????????????????????????????????????????????????????????????????????????????????? ???????????????????????????????????????????????????????????????
                c1.set(Calendar.DATE, dd_db1);
                c1.set(Calendar.MONTH, mm_db1 - 1);
                //??????????????????????????? 1

                //????????????????????? 2
                int dd_db2 = cfBean.getCbPayType5();
                int mm_db2 = cfBean.getCbPayType6();
                Calendar c2 = Calendar.getInstance(Locale.ENGLISH);
                c2.setTime(c.getTime());//?????????????????????????????????????????????????????????????????????????????????????????? ???????????????????????????????????????????????????????????????
                c2.set(Calendar.DATE, dd_db2);
                c2.set(Calendar.MONTH, mm_db2 - 1);
                //??????????????????????????? 2

                if (c1.getTime().compareTo(c.getTime()) == 0 || c2.getTime().compareTo(c.getTime()) == 0) {
                    data.setT_time("00:00:00");
                    data.setRemark("<html><font color=green><b>???????????????????????????????????????????????????</b></font></html>");
                    data.setIsPrint("Y");
                    LineNo++;
                    data.setLineNo("" + LineNo);
                    if (all_balance < 1) {
                        data.setBalance(0);
                        data.setT_interest(0);
                        data.setT_interest_balance(0);
                    } else {
                        data.setBalance(all_balance + data.getT_interest() + data.getT_interest_balance());
                    }
                    data.setDeposit_interest(data.getT_interest() + data.getT_interest_balance());
                    show4 += data.getDeposit_interest();
                    data.setT_interest_balance(0);
                    all_interest = 0;//clear ????????????????????????????????????????????????
                    data.setT_interest(0);
                    dayCount = 0;
                    all_balance = data.getBalance();
                    isUpdate = true;

                    //insert ?????????????????????????????????
//                    int lineNo = cbTransactionSaveControl.getLineByAccount(accCode);
//                    int tIndex = lineNo;
//                    if (tIndex > 24) {
//                        tIndex = tIndex % 24;
//                    }
                    //insert ?????????????????????????????????
                    CbTransactionSaveBean bean = new CbTransactionSaveBean();
                    bean.setT_date(data.getT_date());
                    bean.setT_time(data.getT_time());
                    bean.setT_acccode(accCode);
                    bean.setT_custcode(custCode);
                    bean.setT_description(ThaiUtil.Unicode2ASCII("?????????????????????(????????????????????????)"));
                    bean.setT_amount(data.getDeposit_interest());
                    bean.setT_empcode("system");
                    bean.setT_docno("");
                    bean.setT_booktype("INT");
                    bean.setLineNo(0);
                    bean.setPrintChk("N");
                    bean.setT_balance(data.getBalance());
                    bean.setT_index(0);
                    bean.setMoney_in(data.getDeposit_interest());
                    bean.setMoney_out(0);
                    bean.setBranchCode(Value.BRANCH_CODE);
                    bean.setT_interest(0);
                    bean.setT_fee(0);
                    bean.setT_status("11");
                    if (bean.getT_amount() > 0) {
                        cbTransactionSaveControl.saveCbTransactionSave(bean);
                    }
                }
            }//end paytype 3

            if (!isDateIn) {
                data.setProfit(data.getBalance() - data.getPrinciple());
                if (addModel) {
                    modelList.add(data.toObject());
                }
            }

            if (isDateIn && isUpdate) {
                data.setProfit(data.getBalance() - data.getPrinciple());
                if (addModel) {
                    modelList.add(data.toObject());
                }
            }

            if (c.getTime().compareTo(dateEnd) == 0) {
                data.setProfit(data.getBalance() - data.getPrinciple());
                if (addModel) {
                    modelList.add(data.toObject());
                }
                isLoop = true;
            } else {
                c.add(Calendar.DATE, 1);
            }
        }//end while loop

        show3 = show1 - show2;
        show5 = show3 + show4;

        balanceAmount = all_balance;
        interestAmount = all_interest;

        return modelList;
    }

    static void updateTransactionSaveRunning(String custCode, String accCode) {
        try {
            String sql = "select t_docno,t_date,t_time from cb_transaction_save "
                    + "where t_acccode='" + accCode + "' "
                    + "and t_status in('2','3','8', '11') "
                    + "order by t_date, t_time";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            int t_index = 1;
            int line_no = 1;
            while (rs.next()) {
                String t_date = DateFormat.getMySQL_DateTime(rs.getDate("t_date"));
                if (line_no > 24) {
                    line_no = line_no % 24;
                }
                MySQLConnect.exeUpdate("update cb_transaction_save "
                        + "set LineNo=" + line_no + ", t_index='" + t_index + "' "
                        + "where t_acccode='" + accCode + "' "
                        + "and t_date='" + t_date + "' "
                        + "and t_time='" + rs.getString("t_time") + "' "
                        + "and t_status in('2','3','8', '11') "
                        + "order by t_date, t_time");
                t_index++;
                line_no++;
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
