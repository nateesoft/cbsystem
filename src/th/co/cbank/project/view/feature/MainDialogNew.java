package th.co.cbank.project.view.feature;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import th.co.cbank.project.log.Log;

public class MainDialogNew extends javax.swing.JFrame {

    public MainDialogNew() {
        initComponents();
    }
    
    public static void main(String args[]) {
        Log.write.info("Start Program");
        File fExit = new File("cbanksystem.running");
        if (fExit.exists()) {
            JOptionPane.showMessageDialog(null, "โปรแกรมกำลังถูกเปิดใช้งานอยู่ หรือมีการออกจากระบบไม่สมบูรณ์ กรุณาเปิดใหม่อีกครั้ง !",
                    "แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
            fExit.delete();
            System.exit(0);
        } else {
            try {
                fExit.createNewFile();
            } catch (IOException ex) {

            }
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainDialogNew dialog = new MainDialogNew();
                dialog.setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel31 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnPrintSliplOpenAcc = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        chkSave1 = new javax.swing.JCheckBox();
        lblSaveEvidence = new javax.swing.JLabel();
        lblSaveAccountNo = new javax.swing.JLabel();
        txtAccountCode = new javax.swing.JTextField();
        chkSave2 = new javax.swing.JCheckBox();
        lblSaveBookNo = new javax.swing.JLabel();
        txtBookNo = new javax.swing.JTextField();
        lblSaveFee = new javax.swing.JLabel();
        txtSaveFee = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        lblSelectSaveAccount = new javax.swing.JLabel();
        cbAccType = new javax.swing.JComboBox();
        btnSaveAccOpen = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        lblSaveOpenTitle = new javax.swing.JLabel();
        btnCancelOpenAccount = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDepCode = new javax.swing.JTextField();
        lbMoneyText = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDepositBaht = new javax.swing.JTextField();
        txtRemark1 = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        txtBalanceInterest = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtBookPage = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        BookPageAt = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        txtAccCodeLoad = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtDepositDate = new javax.swing.JTextField();
        btnSaveMoney = new javax.swing.JButton();
        btnCancelOpenAcc4 = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        lblSaveAccountTitle = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        btnCancelSaveMoney = new javax.swing.JButton();
        btnTransactionSaveDialog = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jPanel18 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        txtBalanceTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        txtWithdrawalCode = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        txtWithdrawalBaht = new javax.swing.JTextField();
        lbMoneyText1 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        txtRemark2 = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        txtWithdrawAccTypeName = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtWithdrawDate = new javax.swing.JTextField();
        btnWithdrawMoney = new javax.swing.JButton();
        btnCancelWithdrawMoney = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        lblWithdrawAccountTitle = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        txtCloseRemark = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txtStartDateOpenSaveAccount = new javax.swing.JTextField();
        txtSaveCloseBalance = new javax.swing.JTextField();
        txtSaveCloseInterest = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        txTotalMoneyClose = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        btnCloseSaveAccount = new javax.swing.JButton();
        btnCancelCloseSaveAccount = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        lblCloseAccountTitle = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTransSave = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtHoonQTY = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDocNo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtValueBaht = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtCashPay = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        btnSaveByHoon = new javax.swing.JButton();
        btnCancelBuyHoon = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        cbHoonType = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        txtHoonTon = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        lblBuyHoonTitle = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jPanel21 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        txtTotalSellHoonAmount = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txtDateSell = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        txtPriceValue = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        btnChooseDateSellHoon = new javax.swing.JButton();
        chkSelectAllSellHoon = new javax.swing.JCheckBox();
        jLabel52 = new javax.swing.JLabel();
        txtDocNo1 = new javax.swing.JTextField();
        btnSellHoon = new javax.swing.JButton();
        btnCancelSellHoon = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        lblSellHoonTitle = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        txtTotaTransferHoonAmt = new javax.swing.JTextField();
        txtDateTransfer = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        txtTransferPerson = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        btnChooseDateTransfer = new javax.swing.JButton();
        jLabel153 = new javax.swing.JLabel();
        txtDocnoTransfer = new javax.swing.JTextField();
        btnFindPersonToTransfer = new javax.swing.JButton();
        jLabel154 = new javax.swing.JLabel();
        txtTransferAppCode = new javax.swing.JPasswordField();
        btnTransferHoon = new javax.swing.JButton();
        btnCancelTransferHoon = new javax.swing.JButton();
        jLabel185 = new javax.swing.JLabel();
        txtProfileCode2 = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        txtAccCode2 = new javax.swing.JTextField();
        btnChooseAccToTranHoon = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        lblTransferHoonTitle = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel180 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel195 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        lblLoanPromiseTitle = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel60 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtAddrProvince1 = new javax.swing.JTextField();
        txtAddrPost1 = new javax.swing.JTextField();
        txtAddrAmphur1 = new javax.swing.JTextField();
        txtAddrTambon1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtAddrMobile1 = new javax.swing.JTextField();
        txtAddrTel1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtAddNo1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtAddrRoad1 = new javax.swing.JTextField();
        txtAddrSoi1 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtAddrMoo1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtAddrMooName1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtLoanName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        LoanCustID = new javax.swing.JTextField();
        txtLoanAge = new javax.swing.JTextField();
        txtLoanCardExpire = new javax.swing.JTextField();
        txtLoanBirthDate = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        txtLoanSex = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        txtLoanOccu = new javax.swing.JTextField();
        jLabel202 = new javax.swing.JLabel();
        txtLoanRegMember = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        cbAddrType = new javax.swing.JComboBox();
        jPanel26 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        txtLoanAmt = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        cbLoanAcc = new javax.swing.JComboBox();
        cbLoanTypePayment = new javax.swing.JComboBox();
        btnApproveMoreMoney = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        txtLoanDocCode = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtLoanFee = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtLoanDateStart = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtLoanDateEnd = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtPayPerMonth = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIntFixedName = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txtFeeRateName = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        txtLoanPenaltyINT = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        txtLoanIntPercent = new javax.swing.JTextField();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        txtLoanPerMonth = new javax.swing.JTextField();
        jLabel209 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        txtStartLoanDate = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        txtIntBadDebt = new javax.swing.JTextField();
        jLabel198 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        txtIntTurnover = new javax.swing.JTextField();
        jLabel201 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        txtIntNormal = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbArGroup1 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        txtB1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtB2 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtB3 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtB4 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtB5 = new javax.swing.JTextField();
        jPanel44 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        txtLoanCustName = new javax.swing.JTextField();
        jLabel190 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        txtLoanCustCode = new javax.swing.JTextField();
        jLabel194 = new javax.swing.JLabel();
        txtLoanCustSurname = new javax.swing.JTextField();
        btnSaveGuarantor = new javax.swing.JButton();
        btnCancelSaveGuarantor = new javax.swing.JButton();
        btnChooseGuarantor = new javax.swing.JButton();
        btnDelSaveGuarantor = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbGuarantor = new javax.swing.JTable();
        jLabel196 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAssetGaruntee1 = new javax.swing.JTextArea();
        btnAssetGaruntee = new javax.swing.JButton();
        txtImg1 = new javax.swing.JTextField();
        jLabel197 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        txtImg2 = new javax.swing.JTextField();
        txtImg3 = new javax.swing.JTextField();
        btn6 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        btnSaveLoanAccountRegister = new javax.swing.JButton();
        btnCancelSaveLoanAccountRegister = new javax.swing.JButton();
        btnPrintLoanPaper = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel45 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        txtPaymentDate = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        txtPaymentPerMonth = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txtPaymentFee = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txtPaymentAmountCash = new javax.swing.JTextField();
        btnConfirmPayment = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        txtIntLost = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txtArIntMgr = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        txtArLoanInt = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        btnCancelPayment = new javax.swing.JButton();
        jLabel155 = new javax.swing.JLabel();
        txtLoanStartDate = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbArGroup2 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        txtArTotalBalance = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtArNetAmt = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbHistoryPayment = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jPanel54 = new javax.swing.JPanel();
        lblPaymentLoanTitle = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        txtProfileCode = new javax.swing.JTextField();
        txtProfileName = new javax.swing.JTextField();
        jLabel186 = new javax.swing.JLabel();
        txtAccCode = new javax.swing.JTextField();
        lbPic = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        txtAccTypeName = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        txtLimitLoanAmt = new javax.swing.JTextField();
        jLabel176 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        txtTotalValue = new javax.swing.JTextField();
        jLabel161 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        txtTotalSave = new javax.swing.JTextField();
        txtARProduct = new javax.swing.JTextField();
        txtStartAcc = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        txtTotalAccount = new javax.swing.JTextField();
        jLabel164 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        txtIndexNo = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txtShowEmpName = new javax.swing.JTextField();
        txtShowEmpCode = new javax.swing.JTextField();
        txtMemQty = new javax.swing.JTextField();
        jPanel43 = new javax.swing.JPanel();
        btnTimeShow = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnProgram = new javax.swing.JMenu();
        mnProgramSaving = new javax.swing.JMenu();
        mnProgramAccOpen = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnProgramAccDeposit = new javax.swing.JMenuItem();
        mnProgramAccLoan = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnProgramAccClose = new javax.swing.JMenuItem();
        mnProgramHoon = new javax.swing.JMenu();
        mnProgramHoonBuy = new javax.swing.JMenuItem();
        mnProgramHoonSell = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnProgramHoonTranf = new javax.swing.JMenuItem();
        mnProgramLoan = new javax.swing.JMenu();
        mnProgramLoanOpen = new javax.swing.JMenuItem();
        mnProgramLoanPayment = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        mnProgramExit = new javax.swing.JMenuItem();
        mnSettings = new javax.swing.JMenu();
        mnConfigSystem = new javax.swing.JMenuItem();
        mnSetupConfig = new javax.swing.JMenuItem();
        mnMaster = new javax.swing.JMenu();
        mnMember = new javax.swing.JMenuItem();
        mnMemberType = new javax.swing.JMenuItem();
        mnExpense = new javax.swing.JMenuItem();
        mnProject = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnPrefix = new javax.swing.JMenuItem();
        mnStatus = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnFee = new javax.swing.JMenuItem();
        mnAccount = new javax.swing.JMenu();
        mnSaveAccount = new javax.swing.JMenuItem();
        mnLoanAccount = new javax.swing.JMenuItem();
        mnLoadExcel = new javax.swing.JMenuItem();
        mnProcess = new javax.swing.JMenu();
        mnSaveExpense = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mnCloseDialoyDay = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        mnPrintHistorySave = new javax.swing.JMenuItem();
        mnSaveHistoryLoan = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mnCancelOpenAccount = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnReport = new javax.swing.JMenu();
        mnRptMember = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mnRptOpenAccount = new javax.swing.JMenuItem();
        mnRptCloseAccount = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnMainRptHoon = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnMainRptLoan = new javax.swing.JMenu();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        mnRptFee = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnRptProfitCompany = new javax.swing.JMenuItem();
        mnRptCheckAudit = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mnRptTransaction = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        mnHelp = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem37 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane1.setRequestFocusEnabled(false);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel165.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(204, 204, 204));
        jLabel165.setText("กรุณาเลือกเมนูเพื่อทำรายการ");
        jPanel31.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 164, 748, 109));

        jLabel167.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(204, 204, 204));
        jLabel167.setText("บริษัทสยามคอนวีเนียน จำกัด  Copy Right 2014-2015");
        jPanel31.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 279, -1, -1));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/p1-(5).jpg"))); // NOI18N
        jPanel31.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, 550));

        jTabbedPane1.addTab("", jPanel31);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnPrintSliplOpenAcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintSliplOpenAcc.setText("ออกสลิปใบเสร็จ");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);

        chkSave1.setBackground(new java.awt.Color(255, 255, 255));
        chkSave1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkSave1.setText("สำเนาบัตรประชาชน");

        lblSaveEvidence.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveEvidence.setText("หลักฐาน");

        lblSaveAccountNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveAccountNo.setText("เลขที่บัญชี");

        txtAccountCode.setEditable(false);
        txtAccountCode.setBackground(new java.awt.Color(255, 255, 204));
        txtAccountCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccountCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccountCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        chkSave2.setBackground(new java.awt.Color(255, 255, 255));
        chkSave2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkSave2.setText("สำเนาทะเบียนบ้าน");

        lblSaveBookNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveBookNo.setText("สมุดเล่มที่");

        txtBookNo.setEditable(false);
        txtBookNo.setBackground(new java.awt.Color(255, 255, 204));
        txtBookNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBookNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblSaveFee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveFee.setText("ค่าธรรมเนียม");

        txtSaveFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSaveFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaveFee.setText("0.00");
        txtSaveFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("บาท");

        lblSelectSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSelectSaveAccount.setText("เลือกบัญชี");

        cbAccType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSelectSaveAccount)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSaveFee)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSaveEvidence, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSaveAccountNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSaveBookNo, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtSaveFee, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32))
                    .addComponent(chkSave2)
                    .addComponent(txtBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSave1))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectSaveAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSaveAccountNo)
                    .addComponent(txtAccountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaveBookNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSaveFee)
                    .addComponent(txtSaveFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkSave1)
                        .addComponent(lblSaveEvidence))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(chkSave2)))
                .addContainerGap())
        );

        btnSaveAccOpen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveAccOpen.setText("บันทึกข้อมูล");

        jPanel38.setBackground(new java.awt.Color(204, 255, 204));

        lblSaveOpenTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSaveOpenTitle.setText("เปิดบัญชีเงินฝาก");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveOpenTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveOpenTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelOpenAccount.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelOpenAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelOpenAccount.setText("ยกเลิกรายการ");

        jLayeredPane1.setLayer(btnPrintSliplOpenAcc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnSaveAccOpen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnCancelOpenAccount, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(btnSaveAccOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrintSliplOpenAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelOpenAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(677, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrintSliplOpenAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSaveAccOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelOpenAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><font color=white bgcolor=green>เปิดบัญชีเงินฝาก</font></html>", jPanel7);

        jTabbedPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane8.setRequestFocusEnabled(false);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel19.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("เลขที่ใบฝากเงิน");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("ยอดเงินในบัญชี");

        txtDepCode.setEditable(false);
        txtDepCode.setBackground(new java.awt.Color(255, 255, 204));
        txtDepCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDepCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbMoneyText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMoneyText.setText("(...)");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("บาท");

        txtDepositBaht.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDepositBaht.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDepositBaht.setText("0.00");
        txtDepositBaht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtRemark1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRemark1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtBalance.setEditable(false);
        txtBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBalance.setText("0.00");
        txtBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("บาท");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("หมายเหตุ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ฝากเงินเข้า");

        jLabel146.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel146.setText("ดอกเบี้ยสะสม");

        txtBalanceInterest.setEditable(false);
        txtBalanceInterest.setBackground(new java.awt.Color(255, 255, 204));
        txtBalanceInterest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalanceInterest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalanceInterest.setText("0.00");
        txtBalanceInterest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel148.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel148.setText("บาท");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("บรรทัดที่พิมพ์");

        txtBookPage.setEditable(false);
        txtBookPage.setBackground(new java.awt.Color(255, 255, 255));
        txtBookPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBookPage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setText("หน้าความเคลื่อนไหวที่");

        BookPageAt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BookPageAt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BookPageAt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel168.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel168.setText("ประเภทบัญชี");

        txtAccCodeLoad.setEditable(false);
        txtAccCodeLoad.setBackground(new java.awt.Color(255, 255, 204));
        txtAccCodeLoad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAccCodeLoad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccCodeLoad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("วันที่ฝากเงิน");

        txtDepositDate.setEditable(false);
        txtDepositDate.setBackground(new java.awt.Color(255, 255, 204));
        txtDepositDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDepositDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepositDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDepCode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel146))
                            .addComponent(jLabel168))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBalanceInterest, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtAccCodeLoad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel148)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDepositDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BookPageAt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBookPage, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(txtDepositBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbMoneyText, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                        .addComponent(txtRemark1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDepCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel168)
                    .addComponent(txtAccCodeLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(txtDepositDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBalanceInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel148)
                        .addComponent(jLabel146))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDepositBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(lbMoneyText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemark1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtBookPage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(BookPageAt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSaveMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveMoney.setText("บันทึกข้อมูล");

        btnCancelOpenAcc4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelOpenAcc4.setText("ยกเลิก");

        jPanel41.setBackground(new java.awt.Color(204, 255, 204));

        lblSaveAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSaveAccountTitle.setText("ฝากเงินเข้าบัญชี");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveAccountTitle)
                .addContainerGap(560, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel170.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel170.setText("รายงานการฝากเงินล่าสุด");

        btnCancelSaveMoney.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelSaveMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelSaveMoney.setText("ยกเลิกรายการ");

        btnTransactionSaveDialog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTransactionSaveDialog.setText("แสดงรายละเอียดความเคลื่อนไหว");

        jLayeredPane2.setLayer(jPanel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnSaveMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnCancelOpenAcc4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel170, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnCancelSaveMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnTransactionSaveDialog, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(btnCancelOpenAcc4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveMoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelSaveMoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTransactionSaveDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel170)))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelSaveMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSaveMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelOpenAcc4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTransactionSaveDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel170)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );

        jTabbedPane8.addTab("ฝากเงิน", jPanel8);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.setOpaque(false);

        jLabel135.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel135.setText("จำนวนเงินที่ถอน");

        txtBalanceTotal.setEditable(false);
        txtBalanceTotal.setBackground(new java.awt.Color(255, 255, 204));
        txtBalanceTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalanceTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBalanceTotal.setText("0.00");
        txtBalanceTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("เลขที่ใบแจ้งถอน");

        jLabel141.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel141.setText("หมายเหตุ");

        txtWithdrawalCode.setEditable(false);
        txtWithdrawalCode.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdrawalCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWithdrawalCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdrawalCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel143.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel143.setText("บาท");

        txtWithdrawalBaht.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtWithdrawalBaht.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWithdrawalBaht.setText("0.00");
        txtWithdrawalBaht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbMoneyText1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMoneyText1.setText("(...)");

        jLabel140.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel140.setText("ยอดเงินที่ถอนได้");

        txtRemark2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRemark2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel142.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel142.setText("บาท");

        jLabel169.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel169.setText("ประเภทบัญชี");

        txtWithdrawAccTypeName.setEditable(false);
        txtWithdrawAccTypeName.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdrawAccTypeName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWithdrawAccTypeName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdrawAccTypeName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("วันที่ถอนเงิน");

        txtWithdrawDate.setEditable(false);
        txtWithdrawDate.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdrawDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWithdrawDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdrawDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel135)
                            .addComponent(jLabel140)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel141)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtWithdrawalCode)
                            .addComponent(txtBalanceTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel143)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel169, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtWithdrawDate, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtWithdrawAccTypeName)))
                        .addGap(230, 230, 230))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRemark2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txtWithdrawalBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel142)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMoneyText1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(179, 179, 179))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtWithdrawalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel169)
                    .addComponent(txtWithdrawAccTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel140)
                    .addComponent(txtBalanceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143)
                    .addComponent(jLabel68)
                    .addComponent(txtWithdrawDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(txtWithdrawalBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel142)
                    .addComponent(lbMoneyText1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemark2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel141))
                .addContainerGap())
        );

        btnWithdrawMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnWithdrawMoney.setText("บันทึกข้อมูล");

        btnCancelWithdrawMoney.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelWithdrawMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelWithdrawMoney.setText("ยกเลิกรายการ");

        jPanel42.setBackground(new java.awt.Color(255, 204, 204));

        lblWithdrawAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWithdrawAccountTitle.setText("ถอนเงินออกจากบัญชี");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWithdrawAccountTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWithdrawAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setLayer(jPanel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(btnWithdrawMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(btnCancelWithdrawMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jPanel42, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(btnWithdrawMoney)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelWithdrawMoney)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdrawMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelWithdrawMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3)
        );

        jTabbedPane8.addTab("ถอนเงิน", jPanel40);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtCloseRemark.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCloseRemark.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setText("บาท");

        txtStartDateOpenSaveAccount.setEditable(false);
        txtStartDateOpenSaveAccount.setBackground(new java.awt.Color(255, 255, 204));
        txtStartDateOpenSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStartDateOpenSaveAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartDateOpenSaveAccount.setText("04/05/2558");
        txtStartDateOpenSaveAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtSaveCloseBalance.setEditable(false);
        txtSaveCloseBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtSaveCloseBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveCloseBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSaveCloseBalance.setText("0.00");
        txtSaveCloseBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtSaveCloseInterest.setEditable(false);
        txtSaveCloseInterest.setBackground(new java.awt.Color(255, 255, 204));
        txtSaveCloseInterest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveCloseInterest.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSaveCloseInterest.setText("0.00");
        txtSaveCloseInterest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel73.setText("วันที่เปิดบัญชี");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel74.setText("จำนวนดอกเบี้ย");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel76.setText("ยอดเงินในบัญชี");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel77.setText("สาเหตูการปิดบัญชี");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel101.setText("บาท");

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel128.setText("จำนวนเงินที่รับคืน");

        txTotalMoneyClose.setEditable(false);
        txTotalMoneyClose.setBackground(new java.awt.Color(255, 255, 204));
        txTotalMoneyClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txTotalMoneyClose.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txTotalMoneyClose.setText("0.00");
        txTotalMoneyClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel134.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel134.setText("บาท");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCloseRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartDateOpenSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTotalMoneyClose, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaveCloseInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel134)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(txtSaveCloseBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(txtStartDateOpenSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(txtCloseRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtSaveCloseBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(txtSaveCloseInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(txTotalMoneyClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCloseSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCloseSaveAccount.setText("ยืนยันปิดบัญชี");

        btnCancelCloseSaveAccount.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelCloseSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelCloseSaveAccount.setText("ยกเลิกรายการ");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btnCloseSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelCloseSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCloseSaveAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnCancelCloseSaveAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel46.setBackground(new java.awt.Color(255, 204, 204));

        lblCloseAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCloseAccountTitle.setText("ปิดบัญชีเงินฝาก");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCloseAccountTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCloseAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jTabbedPane8.addTab("ปิดบัญชีเงินฝาก", jPanel15);

        jPanel56.setBackground(new java.awt.Color(255, 204, 153));
        jPanel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));
        jPanel57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel104.setText("รวมทั้งหมด");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel103.setText("------------------------------------");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("บัญชีทั้งหมด");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("เงินฝากทั้งหมด");

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel105.setText("====================");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel102.setText("ดอกเบี้ยสะสม");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 255, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setText("0.00");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 255, 204));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setText("0.00");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 255, 204));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setText("0.00");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel106.setText("บัญชี");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel107.setText("บาท");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel108.setText("บาท");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel109.setText("บาท");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel57Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel102)))
                            .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel106)
                            .addComponent(jLabel107)
                            .addComponent(jLabel108)
                            .addComponent(jLabel109)))
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel105))
        );

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel110.setText("ยอดเคลื่อนไหวรายวัน");

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel111.setText("-------------------------------------");

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel112.setText("เปิดบัญชีวันนี้");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel113.setText("ฝากเงินวันนี้");

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel114.setText("====================");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel115.setText("ถอนเงินวันนี้");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(204, 255, 204));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField7.setText("0");
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(204, 255, 204));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField8.setText("0.00");
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(204, 255, 204));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField9.setText("0.00");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(204, 255, 204));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField10.setText("0.00");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel116.setText("บัญชี");

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel117.setText("บาท");

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel118.setText("บาท");

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel119.setText("บาท");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel122.setText("ปิดบัญชีวันนี้");

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(204, 255, 204));
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField12.setText("0");
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel123.setText("บัญชี");

        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel124.setText("ค่าธรรมเนียม");

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 255, 204));
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField13.setText("0.00");
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel133.setText("บาท");

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel136.setText("====================");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel122, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel110)
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel124)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7)
                            .addComponent(jTextField12)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116)
                    .addComponent(jLabel117)
                    .addComponent(jLabel118)
                    .addComponent(jLabel119)
                    .addComponent(jLabel123)
                    .addComponent(jLabel133))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel136))
        );

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbTransSave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "วันที่", "เวลา", "ฝากเงิน", "ถอนเงิน", "เงินต้นคงเหลือ", "หมายเหตุ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTransSave.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane4.setViewportView(tbTransSave);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane8)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("<html><font color=white bgcolor=green>ฝาก/ถอน</font></html>", jPanel1);

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane5.setRequestFocusEnabled(false);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("จำนวนเงินรวม");

        txtHoonQTY.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHoonQTY.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonQTY.setText("0");
        txtHoonQTY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("บาท");

        txtDocNo.setEditable(false);
        txtDocNo.setBackground(new java.awt.Color(255, 255, 204));
        txtDocNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("จำนวนหุ้นที่ซื้อ");

        txtAmount.setEditable(false);
        txtAmount.setBackground(new java.awt.Color(255, 255, 204));
        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.setText("0.00");
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("เลขที่เอกสาร");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("หุ้น");

        txtValueBaht.setEditable(false);
        txtValueBaht.setBackground(new java.awt.Color(255, 255, 204));
        txtValueBaht.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValueBaht.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValueBaht.setText("0.00");
        txtValueBaht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("บาท/หุ้น");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("ราคาหุ้น");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCashPay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCashPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCashPay.setText("0.00");
        txtCashPay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("บาท");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ชำระเงินสด");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCashPay, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(txtCashPay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSaveByHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveByHoon.setText("บันทึกข้อมูล");

        btnCancelBuyHoon.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelBuyHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelBuyHoon.setText("ยกเลิกรายการ");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("ประเภทหุ้น");

        cbHoonType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("เงินทอน");

        txtHoonTon.setEditable(false);
        txtHoonTon.setBackground(new java.awt.Color(255, 255, 204));
        txtHoonTon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtHoonTon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonTon.setText("0.00");
        txtHoonTon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setText("บาท");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel34)
                        .addGap(12, 12, 12)
                        .addComponent(txtHoonTon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel51))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtValueBaht, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtDocNo, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtHoonQTY))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel21))
                                        .addGap(84, 84, 84))
                                    .addComponent(cbHoonType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnSaveByHoon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelBuyHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel25)
                    .addComponent(txtDocNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHoonType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoonQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(txtValueBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoonTon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveByHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelBuyHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel47.setBackground(new java.awt.Color(255, 255, 204));
        jPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblBuyHoonTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBuyHoonTitle.setText("ซื้อหุ้น");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuyHoonTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuyHoonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane6.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jPanel47, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane6)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane6)
        );

        jTabbedPane5.addTab("ซื้อหุ้น", jPanel10);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel21.setOpaque(false);

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel132.setText("บาท");

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel129.setText("หุ้น");

        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel127.setText("วันที่ขาย");

        txtTotalSellHoonAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalSellHoonAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalSellHoonAmount.setText("0");
        txtTotalSellHoonAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel126.setText("บาท/หุ้น");

        txtTotalAmount.setEditable(false);
        txtTotalAmount.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalAmount.setText("0.00");
        txtTotalAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel131.setText("จำนวนเงิน");

        txtDateSell.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDateSell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDateSell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel130.setText("จำนวนหุ้นที่ขาย");

        txtPriceValue.setEditable(false);
        txtPriceValue.setBackground(new java.awt.Color(255, 255, 204));
        txtPriceValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPriceValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPriceValue.setText("0.00");
        txtPriceValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel125.setText("ราคาขาย");

        btnChooseDateSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseDateSellHoon.setText("...");

        chkSelectAllSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkSelectAllSellHoon.setText("ขายหุ้นทั้งหมด");
        chkSelectAllSellHoon.setOpaque(false);

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel52.setText("เลขที่เอกสาร");

        txtDocNo1.setEditable(false);
        txtDocNo1.setBackground(new java.awt.Color(255, 255, 204));
        txtDocNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocNo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocNo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel130, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel131, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalSellHoonAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateSell, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChooseDateSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkSelectAllSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel126)
                    .addComponent(jLabel132))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel52)
                    .addComponent(txtDocNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(txtDateSell, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseDateSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel130)
                        .addComponent(txtTotalSellHoonAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel129))
                    .addComponent(chkSelectAllSellHoon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(txtPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132))
                .addContainerGap())
        );

        btnSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSellHoon.setText("บันทึกข้อมูล");

        btnCancelSellHoon.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelSellHoon.setText("ยกเลิกรายการ");

        jPanel48.setBackground(new java.awt.Color(255, 204, 204));
        jPanel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblSellHoonTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSellHoonTitle.setText("ขายหุ้น");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSellHoonTitle)
                .addContainerGap(677, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSellHoonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane7.setLayer(jPanel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(btnSellHoon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(btnCancelSellHoon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jPanel48, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                        .addComponent(btnSellHoon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane7)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane7)
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("ขายหุ้น", jPanel36);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel138.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel138.setText("หุ้น");

        jLabel139.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel139.setText("วันที่โอนหุ้น");

        txtTotaTransferHoonAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotaTransferHoonAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotaTransferHoonAmt.setText("0");
        txtTotaTransferHoonAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtDateTransfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDateTransfer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDateTransfer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel147.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel147.setText("จำนวนหุ้นที่โอน");

        txtTransferPerson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTransferPerson.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTransferPerson.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel152.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel152.setText("โอนให้กับ");

        btnChooseDateTransfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseDateTransfer.setText("...");

        jLabel153.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel153.setText("เลขที่เอกสาร");

        txtDocnoTransfer.setEditable(false);
        txtDocnoTransfer.setBackground(new java.awt.Color(255, 255, 204));
        txtDocnoTransfer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocnoTransfer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocnoTransfer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnFindPersonToTransfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFindPersonToTransfer.setText("ค้นหา");

        jLabel154.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel154.setText("รหัสอนุมัติ");

        txtTransferAppCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTransferAppCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel139)
                    .addComponent(jLabel147)
                    .addComponent(jLabel152)
                    .addComponent(jLabel153)
                    .addComponent(jLabel154))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTransferPerson)
                    .addComponent(txtTotaTransferHoonAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtDateTransfer)
                    .addComponent(txtDocnoTransfer)
                    .addComponent(txtTransferAppCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChooseDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138)
                    .addComponent(btnFindPersonToTransfer))
                .addGap(133, 133, 133))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel153)
                    .addComponent(txtDocnoTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(txtDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel147)
                    .addComponent(txtTotaTransferHoonAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnFindPersonToTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTransferPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel154)
                    .addComponent(txtTransferAppCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        btnTransferHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTransferHoon.setText("บันทึกข้อมูล");

        btnCancelTransferHoon.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelTransferHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelTransferHoon.setText("ยกเลิกรายการ");

        jLabel185.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel185.setText("รหัสสมาชิก");

        txtProfileCode2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfileCode2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfileCode2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel189.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel189.setText("บัญชีเงินฝาก");

        txtAccCode2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAccCode2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccCode2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnChooseAccToTranHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseAccToTranHoon.setText("เลือกบัญชี");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel185)
                    .addComponent(jLabel189))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(btnTransferHoon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelTransferHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProfileCode2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccCode2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChooseAccToTranHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel185)
                    .addComponent(txtProfileCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel189)
                    .addComponent(btnChooseAccToTranHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransferHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelTransferHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel49.setBackground(new java.awt.Color(255, 204, 204));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblTransferHoonTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTransferHoonTitle.setText("โอนหุ้น");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTransferHoonTitle)
                .addContainerGap(680, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTransferHoonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        jTabbedPane5.addTab("โอนหุ้น", jPanel14);

        jPanel59.setBackground(new java.awt.Color(255, 204, 153));
        jPanel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel59.setText("ผู้ถือหุ้นทั้งหมด");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel84.setText("จำนวนหุ้นทั้งหมด");

        jLabel145.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel145.setText("====================");

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(204, 255, 204));
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField14.setText("0");
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(204, 255, 204));
        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField16.setText("0");
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel149.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel149.setText("คน");

        jLabel150.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel150.setText("หุ้น");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel63Layout.createSequentialGroup()
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel59))
                            .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel149)
                    .addComponent(jLabel150))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel149))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel145)
                .addGap(95, 95, 95))
        );

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel171.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel171.setText("หุ้นที่ซื้อวันนี้");

        jLabel175.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel175.setText("จำนวนหุ้นคงเหลือ");

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(204, 255, 204));
        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField24.setText("0");
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(204, 255, 204));
        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField25.setText("0");
        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel180.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel180.setText("หุ้น");

        jLabel182.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel182.setText("หุ้น");

        jLabel188.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel188.setText("หุ้นที่ขายวันนี้");

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(204, 255, 204));
        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField29.setText("0");
        jTextField29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel195.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel195.setText("หุ้น");

        jLabel199.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel199.setText("หุ้นที่โอนวันนี้");

        jTextField33.setEditable(false);
        jTextField33.setBackground(new java.awt.Color(204, 255, 204));
        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField33.setText("0");
        jTextField33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel200.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel200.setText("หุ้น");

        jLabel203.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel203.setText("====================");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel171)
                            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel199, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel188, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel175))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel180)
                    .addComponent(jLabel182)
                    .addComponent(jLabel195)
                    .addComponent(jLabel200))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel171)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel180))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel188)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel195))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel199)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel200))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel175)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel182))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel203))
        );

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><font bgcolor=yellow>ซื้อขายหุ้น</font></html>", jPanel3);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jPanel52.setBackground(new java.awt.Color(255, 204, 204));

        lblLoanPromiseTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLoanPromiseTitle.setText("ทำสัญญาเงินกู้");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoanPromiseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoanPromiseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ที่อยู่ติดต่อ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("ตำบล/แขวง");

        txtAddrProvince1.setEditable(false);
        txtAddrProvince1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrProvince1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrProvince1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrProvince1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtAddrPost1.setEditable(false);
        txtAddrPost1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrPost1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrPost1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrPost1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtAddrAmphur1.setEditable(false);
        txtAddrAmphur1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrAmphur1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrAmphur1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrAmphur1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtAddrTambon1.setEditable(false);
        txtAddrTambon1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrTambon1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTambon1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrTambon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("อำเภอ/เขต");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("รหัสไปรษณีย์");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("จังหวัด");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("เบอร์โทรศัพท์");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("เบอร์บ้าน");

        txtAddrMobile1.setEditable(false);
        txtAddrMobile1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrMobile1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrMobile1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrMobile1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtAddrTel1.setEditable(false);
        txtAddrTel1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrTel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrTel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("บ้านเลขที่");

        txtAddNo1.setEditable(false);
        txtAddNo1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddNo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddNo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setText("ถนน");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("ซอย");

        txtAddrRoad1.setEditable(false);
        txtAddrRoad1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrRoad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrRoad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtAddrSoi1.setEditable(false);
        txtAddrSoi1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrSoi1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrSoi1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("หมู่ที่");

        txtAddrMoo1.setEditable(false);
        txtAddrMoo1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrMoo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrMoo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrMoo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("ชื่อหมู่บ้าน");

        txtAddrMooName1.setEditable(false);
        txtAddrMooName1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrMooName1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddrMooName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddrProvince1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrTambon1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrRoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(txtAddNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddrMoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel56)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel61)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddrMooName1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtAddrSoi1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(txtAddrPost1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAddrTel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAddrAmphur1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46)
                        .addComponent(txtAddNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(txtAddrMoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddrMooName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtAddrRoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(txtAddrSoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtAddrTambon1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrAmphur1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtAddrProvince1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrPost1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtAddrMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txtAddrTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("ชื่อ-นามสกุล");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel83.setText("ปี");

        txtLoanName.setEditable(false);
        txtLoanName.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("วันหมดอายุบัตร");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("รหัสบัตรประชาชน");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel93.setText("วันเกิด");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel72.setText("อายุ");

        LoanCustID.setEditable(false);
        LoanCustID.setBackground(new java.awt.Color(255, 255, 204));
        LoanCustID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoanCustID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanAge.setEditable(false);
        txtLoanAge.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanCardExpire.setEditable(false);
        txtLoanCardExpire.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanCardExpire.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanCardExpire.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanCardExpire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanBirthDate.setEditable(false);
        txtLoanBirthDate.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanBirthDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanBirthDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanBirthDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel137.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel137.setText("เพศ");

        txtLoanSex.setEditable(false);
        txtLoanSex.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanSex.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLoanSex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel144.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel144.setText("อาชีพ");

        txtLoanOccu.setEditable(false);
        txtLoanOccu.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanOccu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanOccu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel202.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel202.setText("วันที่สมัครสมาชิก");

        txtLoanRegMember.setEditable(false);
        txtLoanRegMember.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanRegMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanRegMember.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanRegMember.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel205.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel205.setText("เลือกที่อยู่ในการทำสัญญากู้เงิน");

        cbAddrType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbAddrType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ที่อยู่ปัจจุบัน", "ที่อยู่ตามบัตรประชาชน", "ที่อยู่ที่ทำงาน" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel62)
                    .addComponent(jLabel72)
                    .addComponent(jLabel93)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel137)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLoanSex, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel202))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                                        .addComponent(jLabel144)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLoanOccu, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoanRegMember, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(255, 255, 255))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtLoanBirthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(LoanCustID, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLoanAge, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtLoanCardExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel205)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAddrType, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLoanName, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(405, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LoanCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel137)
                    .addComponent(txtLoanSex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtLoanName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(txtLoanAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel144)
                    .addComponent(txtLoanOccu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(txtLoanBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel202)
                    .addComponent(txtLoanRegMember, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel205)
                    .addComponent(cbAddrType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoanCardExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("รายละเอียดผู้กู้", jPanel60);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.setOpaque(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("เลือกบัญชี");

        jLabel172.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel172.setText("วงเงินที่ขอกู้");

        txtLoanAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanAmt.setText("0.00");
        txtLoanAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel179.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel179.setText("บาท");

        cbLoanAcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cbLoanTypePayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbLoanTypePayment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "รายวัน", "รายเดือน", "รายปี" }));
        cbLoanTypePayment.setSelectedIndex(1);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(cbLoanTypePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoanAmt))
                    .addComponent(cbLoanAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel179)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(cbLoanAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel172)
                    .addComponent(txtLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel179)
                    .addComponent(cbLoanTypePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnApproveMoreMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnApproveMoreMoney.setText("ให้วงเงินเพิ่ม");

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("เลขที่สัญญา");

        txtLoanDocCode.setEditable(false);
        txtLoanDocCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDocCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDocCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("ค่าธรรมเนียม");

        txtLoanFee.setEditable(false);
        txtLoanFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanFee.setText("0.00");
        txtLoanFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel63.setText("กำหนดเริ่มชำระ");

        txtLoanDateStart.setEditable(false);
        txtLoanDateStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDateStart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDateStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setText("...");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("งวดสุดท้าย");

        txtLoanDateEnd.setEditable(false);
        txtLoanDateEnd.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanDateEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDateEnd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDateEnd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("ผ่อนชำระงวดล่ะ");

        txtPayPerMonth.setEditable(false);
        txtPayPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPayPerMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPayPerMonth.setText("0.00");
        txtPayPerMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel82.setText("บาท");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("ประเภทดอกเบี้ย");

        txtIntFixedName.setEditable(false);
        txtIntFixedName.setBackground(new java.awt.Color(255, 255, 204));
        txtIntFixedName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIntFixedName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel97.setText("การคิดค่าปรับ");

        txtFeeRateName.setEditable(false);
        txtFeeRateName.setBackground(new java.awt.Color(255, 255, 204));
        txtFeeRateName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFeeRateName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel120.setText("ดอกเบี้ยค่าปรับ");

        txtLoanPenaltyINT.setEditable(false);
        txtLoanPenaltyINT.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanPenaltyINT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanPenaltyINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanPenaltyINT.setText("0.00");
        txtLoanPenaltyINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel121.setText("%");

        jLabel206.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel206.setText("ดอกเบี้ย");

        txtLoanIntPercent.setEditable(false);
        txtLoanIntPercent.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanIntPercent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanIntPercent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanIntPercent.setText("0.00");
        txtLoanIntPercent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel207.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel207.setText("%");

        jLabel208.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel208.setText("จำนวนงวด");

        txtLoanPerMonth.setEditable(false);
        txtLoanPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanPerMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanPerMonth.setText("1");
        txtLoanPerMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel209.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel209.setText("งวด");

        jLabel211.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel211.setText("วันที่ออกสัญญา");

        txtStartLoanDate.setEditable(false);
        txtStartLoanDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtStartLoanDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setText("...");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel208, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel211, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoanFee, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(txtPayPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel82))
                            .addComponent(txtLoanDateEnd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(txtLoanPenaltyINT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel121)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel206)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLoanIntPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFeeRateName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIntFixedName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoanDocCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(txtStartLoanDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(txtLoanPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel209))
                                    .addComponent(txtLoanDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel207))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel211)
                    .addComponent(txtStartLoanDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIntFixedName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFeeRateName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(txtLoanPenaltyINT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121)
                    .addComponent(jLabel206)
                    .addComponent(txtLoanIntPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel207))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanDocCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtLoanFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel208)
                    .addComponent(txtLoanPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel209))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLoanDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtPayPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addContainerGap())
        );

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("สำรองหนี้สูญ");

        txtIntBadDebt.setEditable(false);
        txtIntBadDebt.setBackground(new java.awt.Color(255, 255, 204));
        txtIntBadDebt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntBadDebt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntBadDebt.setText("0.00");
        txtIntBadDebt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntBadDebt.setEnabled(false);

        jLabel198.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel198.setText("%");

        jLabel187.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel187.setText("ค่าจัดการ");

        txtIntTurnover.setEditable(false);
        txtIntTurnover.setBackground(new java.awt.Color(255, 255, 204));
        txtIntTurnover.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntTurnover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntTurnover.setText("0.00");
        txtIntTurnover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntTurnover.setEnabled(false);

        jLabel201.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel201.setText("%");

        jLabel184.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel184.setText("ดอกเบี้ยเงินกู้");

        txtIntNormal.setEditable(false);
        txtIntNormal.setBackground(new java.awt.Color(255, 255, 204));
        txtIntNormal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntNormal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntNormal.setText("0.00");
        txtIntNormal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntNormal.setEnabled(false);

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel99.setText("%");

        tbArGroup1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbArGroup1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "งวดที่", "เงินต้น", "สำรองหนี้สูญ", "ค่าจัดการ", "ดอกเบี้ยกู้", "รวมยอดชำระ", "คงเหลือ", "วันที่รับชำระ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbArGroup1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane5.setViewportView(tbArGroup1);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("เงินต้น");

        txtB1.setEditable(false);
        txtB1.setBackground(new java.awt.Color(255, 255, 255));
        txtB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB1.setText("0.00");
        txtB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("สำรองหนี้");

        txtB2.setEditable(false);
        txtB2.setBackground(new java.awt.Color(255, 255, 255));
        txtB2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB2.setText("0.00");
        txtB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel54.setText("ค่าจัดการ");

        txtB3.setEditable(false);
        txtB3.setBackground(new java.awt.Color(255, 255, 255));
        txtB3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB3.setText("0.00");
        txtB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel60.setText("ดอกเบี้ยกู้");

        txtB4.setEditable(false);
        txtB4.setBackground(new java.awt.Color(255, 255, 255));
        txtB4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB4.setText("0.00");
        txtB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("ยอดชำระ");

        txtB5.setEditable(false);
        txtB5.setBackground(new java.awt.Color(255, 255, 255));
        txtB5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB5.setText("0.00");
        txtB5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addGap(19, 19, 19))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApproveMoreMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIntBadDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel198)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel187)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIntTurnover, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel201)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel184)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIntNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel99)))
                .addGap(0, 118, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(btnApproveMoreMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(txtIntBadDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel198)
                            .addComponent(jLabel187)
                            .addComponent(txtIntTurnover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel201)
                            .addComponent(jLabel184)
                            .addComponent(txtIntNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99))
                        .addGap(21, 21, 21)))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)
                            .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54)
                            .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66)
                            .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addGap(20, 20, 20))))
        );

        jTabbedPane3.addTab("รายละเอียดสัญญา", jPanel26);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));

        jPanel50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel50.setOpaque(false);

        txtLoanCustName.setEditable(false);
        txtLoanCustName.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanCustName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanCustName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel190.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel190.setText("นามสกุล");

        jLabel193.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel193.setText("ชื่อ");

        txtLoanCustCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanCustCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel194.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel194.setText("รหัสผู้ค้ำประกัน");

        txtLoanCustSurname.setEditable(false);
        txtLoanCustSurname.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanCustSurname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanCustSurname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnSaveGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveGuarantor.setText("บันทึกข้อมูลผู้ค้ำ");

        btnCancelSaveGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelSaveGuarantor.setText("ยกเลิกรายการ");

        btnChooseGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseGuarantor.setText("...");

        btnDelSaveGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelSaveGuarantor.setText("ลบรายการ");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel194)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLoanCustCode)
                    .addComponent(btnSaveGuarantor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(btnChooseGuarantor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel193)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoanCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel190)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoanCustSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(btnCancelSaveGuarantor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelSaveGuarantor)))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel194)
                    .addComponent(txtLoanCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel193)
                    .addComponent(txtLoanCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel190)
                    .addComponent(txtLoanCustSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaveGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelSaveGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelSaveGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tbGuarantor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสบัตร", "ชื่อ", "นามสกุล", "ความสัมพันธ์"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGuarantor.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane6.setViewportView(tbGuarantor);

        jLabel196.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel196.setText("โฉนดที่ดิน");

        txtAssetGaruntee1.setColumns(20);
        txtAssetGaruntee1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAssetGaruntee1.setRows(5);
        jScrollPane7.setViewportView(txtAssetGaruntee1);

        btnAssetGaruntee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAssetGaruntee.setText("บันทึกข้อมูล");

        txtImg1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel197.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel197.setText("เอกสารรูปภาพ");

        btn4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn4.setText("เลือกภาพ");

        btn5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn5.setText("เลือกภาพ");

        txtImg2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtImg3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btn6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn6.setText("เลือกภาพ");

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton30.setText("ยกเลิกข้อมูล");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel196)
                    .addComponent(jLabel197)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(txtImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(txtImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane7)
                            .addComponent(txtImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn4)
                            .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAssetGaruntee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel196)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(btnAssetGaruntee, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel197)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane3.addTab("บุคคลค้ำประกัน", jPanel44);

        btnSaveLoanAccountRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveLoanAccountRegister.setText("บันทึกข้อมูลสัญญากู้เงิน");

        btnCancelSaveLoanAccountRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelSaveLoanAccountRegister.setText("ยกเลิกรายการ");

        btnPrintLoanPaper.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintLoanPaper.setText("พิมพ์สัญญาเงินกู้");
        btnPrintLoanPaper.setEnabled(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(btnSaveLoanAccountRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelSaveLoanAccountRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrintLoanPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane3)
            .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveLoanAccountRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelSaveLoanAccountRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrintLoanPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("<html><font bgcolor=red color=white>เปิดบัญชีเงินกู้</font></html>", jPanel20);

        jTabbedPane7.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane7.setRequestFocusEnabled(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPaymentDate.setEditable(false);
        txtPaymentDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaymentDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPaymentDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("ชำระ");

        jLabel151.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel151.setText("วันที่กู้");

        txtPaymentPerMonth.setEditable(false);
        txtPaymentPerMonth.setBackground(new java.awt.Color(255, 255, 204));
        txtPaymentPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPaymentPerMonth.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaymentPerMonth.setText("0.00");
        txtPaymentPerMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setText("ค่าปรับ");

        txtPaymentFee.setEditable(false);
        txtPaymentFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPaymentFee.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaymentFee.setText("0.00");
        txtPaymentFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("รับชำระ");

        txtPaymentAmountCash.setEditable(false);
        txtPaymentAmountCash.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtPaymentAmountCash.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaymentAmountCash.setText("0.00");
        txtPaymentAmountCash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnConfirmPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirmPayment.setText("ยืนยันการรับชำระ");

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel89.setText("กันหนี้สูญ");

        txtIntLost.setEditable(false);
        txtIntLost.setBackground(new java.awt.Color(255, 255, 204));
        txtIntLost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntLost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIntLost.setText("0.00");
        txtIntLost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel92.setText("ค่าดำเนินการ");

        txtArIntMgr.setEditable(false);
        txtArIntMgr.setBackground(new java.awt.Color(255, 255, 204));
        txtArIntMgr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtArIntMgr.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArIntMgr.setText("0.00");
        txtArIntMgr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel100.setText("ดอกเบี้ยกู้");

        txtArLoanInt.setEditable(false);
        txtArLoanInt.setBackground(new java.awt.Color(255, 255, 204));
        txtArLoanInt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtArLoanInt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArLoanInt.setText("0.00");
        txtArLoanInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton20.setText("...");
        jButton20.setEnabled(false);

        btnCancelPayment.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelPayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelPayment.setText("ยกเลิกรายการ");

        jLabel155.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel155.setText("วันที่ชำระ");

        txtLoanStartDate.setEditable(false);
        txtLoanStartDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanStartDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanStartDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel155))
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel34Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPaymentAmountCash, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirmPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(txtPaymentFee)
                    .addComponent(txtIntLost)
                    .addComponent(txtArIntMgr)
                    .addComponent(txtPaymentPerMonth)
                    .addComponent(btnCancelPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaymentDate)
                            .addComponent(txtLoanStartDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtArLoanInt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel151))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(txtPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel75))
                    .addComponent(txtPaymentFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIntLost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel89)))
                .addGap(7, 7, 7)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArIntMgr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel92)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtArLoanInt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(txtPaymentPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPaymentAmountCash, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel69)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("ตารางรับชำระ");

        tbArGroup2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbArGroup2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่ปรับดอก", "ค่าปรับ", "สำรองหนี้สูญ", "ค่าจัดการ", "ดอกเบี้ยกู้", "เงินต้น", "ชำระรวม", "ชำระแล้ว", "คงเหลือ", "index"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbArGroup2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane8.setViewportView(tbArGroup2);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("ยอดหนี้คงเหลือ/ปิดบัญชี");

        txtArTotalBalance.setEditable(false);
        txtArTotalBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtArTotalBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArTotalBalance.setText("0.00");
        txtArTotalBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("ยอดหนี้เต็มจำนวน");

        txtArNetAmt.setEditable(false);
        txtArNetAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtArNetAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArNetAmt.setText("0.00");
        txtArNetAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addContainerGap(677, Short.MAX_VALUE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArNetAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(txtArTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(txtArNetAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("รายละเอียดการรับชำระ", jPanel45);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane7.addTab("รับชำระเงินกู้", jPanel4);

        tbHistoryPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่", "เลขที่บัญชี", "สำรองหนี้สูญ", "ค่าจัดการ", "ดอกเบี้ย", "ค่าปรับ", "รวมรับชำระ", "คงหลือ", "พนักงาน", "สาขา"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbHistoryPayment);

        jButton15.setBackground(new java.awt.Color(255, 51, 51));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton15.setText("กลับหน้าหลัก");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("ประวัติการรับชำระ", jPanel13);

        jPanel54.setBackground(new java.awt.Color(255, 204, 204));

        lblPaymentLoanTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPaymentLoanTitle.setText("รับชำระเงินกู้");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPaymentLoanTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPaymentLoanTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
            .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane7)
                .addContainerGap())
        );

        jTabbedPane1.addTab("<html><font bgcolor=red color=white>กู้เงิน/รับชำระ</font></html>", jPanel17);

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel177.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel177.setText("รหัสสมาชิก");

        jLabel178.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel178.setText("ชื่อ-สกุล");

        txtProfileCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfileCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfileCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtProfileName.setEditable(false);
        txtProfileName.setBackground(new java.awt.Color(255, 255, 204));
        txtProfileName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfileName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfileName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel186.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel186.setText("สมุดบัญชี");

        txtAccCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAccCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        lbPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel183.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel183.setText("ประเภทบัญชี");

        txtAccTypeName.setEditable(false);
        txtAccTypeName.setBackground(new java.awt.Color(255, 255, 204));
        txtAccTypeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccTypeName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccTypeName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLimitLoanAmt.setEditable(false);
        txtLimitLoanAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLimitLoanAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLimitLoanAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLimitLoanAmt.setText("0.00");
        txtLimitLoanAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel176.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel176.setText("หุ้น");

        jLabel174.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel174.setText("บาท");

        jLabel157.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel157.setText("เงินฝาก");

        jLabel162.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel162.setText("วันที่ลงทะเบียน");

        jLabel163.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel163.setText("บาท");

        txtTotalValue.setEditable(false);
        txtTotalValue.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValue.setText("0.00");
        txtTotalValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel161.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel161.setText("หนี้ค้างชำระ");

        jLabel158.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel158.setText("หุ้น");

        jLabel173.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel173.setText("บาท");

        txtTotalSave.setEditable(false);
        txtTotalSave.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalSave.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalSave.setText("0.00");
        txtTotalSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtARProduct.setEditable(false);
        txtARProduct.setBackground(new java.awt.Color(255, 255, 204));
        txtARProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtARProduct.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtARProduct.setText("0.00");
        txtARProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtStartAcc.setEditable(false);
        txtStartAcc.setBackground(new java.awt.Color(255, 255, 204));
        txtStartAcc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStartAcc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartAcc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel166.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel166.setText("วงเงินกู้");

        jLabel159.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel159.setText("จำนวนบัญชี");

        txtTotalAccount.setEditable(false);
        txtTotalAccount.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalAccount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalAccount.setText("0");
        txtTotalAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel164.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel164.setText("บัญชี");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel166)
                    .addComponent(jLabel161)
                    .addComponent(jLabel158)
                    .addComponent(jLabel162)
                    .addComponent(jLabel157)
                    .addComponent(jLabel159))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(txtARProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel173))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(txtLimitLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel174))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTotalSave)
                            .addComponent(txtTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalAccount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel163)
                            .addComponent(jLabel176)
                            .addComponent(jLabel164)))
                    .addComponent(txtStartAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel162))
                .addGap(7, 7, 7)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel157)
                    .addComponent(jLabel163))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel159)
                    .addComponent(jLabel164))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel158)
                    .addComponent(txtTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel176))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtARProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel173)
                    .addComponent(jLabel161))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel166)
                    .addComponent(txtLimitLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel174))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setText("ลำดับที่");

        txtIndexNo.setEditable(false);
        txtIndexNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIndexNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIndexNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel177)
                            .addComponent(jLabel178)
                            .addComponent(jLabel186)
                            .addComponent(jLabel64))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccCode)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtProfileCode, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtIndexNo)))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel183)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(lbPic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addComponent(lbPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel64)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel186))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel177)
                    .addComponent(txtProfileCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel178)
                    .addComponent(txtProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel183))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        btnRegister.setBackground(new java.awt.Color(0, 102, 0));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("ลงทะเบียน");
        btnRegister.setRequestFocusEnabled(false);
        jPanel12.add(btnRegister);

        btnEdit.setBackground(new java.awt.Color(0, 102, 0));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("แก้ไขข้อมูล");
        btnEdit.setRequestFocusEnabled(false);
        jPanel12.add(btnEdit);

        btnFind.setBackground(new java.awt.Color(0, 102, 0));
        btnFind.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setText("ค้นหาข้อมูล");
        btnFind.setRequestFocusEnabled(false);
        jPanel12.add(btnFind);

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("บริษัทสยามคอนวีเนียน จำกัด เลขที่ 9/39 หมู่3 ซอยวัดศรีประวัติ ถ.จงกลถนอม ต.ศาลากลาง อ.บางกรวย จ.นนทบุรี 11130");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("โทร. 0-2497-8608, 096-989-4159 แฟกซ์. 0-2497-8608");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("รหัสพนักงาน");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel85.setText("ชื่อพนักงาน");

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel87.setText("จำนวนสมาชิก");

        txtBranchName.setEditable(false);
        txtBranchName.setBackground(new java.awt.Color(255, 255, 204));
        txtBranchName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBranchName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBranchName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel86.setText("สถาบัน");

        txtShowEmpName.setEditable(false);
        txtShowEmpName.setBackground(new java.awt.Color(255, 255, 204));
        txtShowEmpName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtShowEmpName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtShowEmpName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtShowEmpCode.setEditable(false);
        txtShowEmpCode.setBackground(new java.awt.Color(255, 255, 204));
        txtShowEmpCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtShowEmpCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtShowEmpCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtMemQty.setEditable(false);
        txtMemQty.setBackground(new java.awt.Color(255, 255, 204));
        txtMemQty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtMemQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemQty.setText("0");
        txtMemQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel43.setOpaque(false);
        jPanel43.setLayout(new java.awt.GridLayout(1, 0));

        btnTimeShow.setBackground(new java.awt.Color(255, 255, 255));
        btnTimeShow.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btnTimeShow.setForeground(new java.awt.Color(0, 0, 255));
        btnTimeShow.setText("00:00:00");
        jPanel43.add(btnTimeShow);

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(txtShowEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShowEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemQty, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel41)
                            .addComponent(txtShowEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85)
                            .addComponent(txtShowEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMemQty, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );

        mnProgram.setText("โปรแกรม");
        mnProgram.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnProgramSaving.setText("บัญชีเงินฝาก");
        mnProgramSaving.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        mnProgramAccOpen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProgramAccOpen.setText("เปิดบัญชี");
        mnProgramSaving.add(mnProgramAccOpen);
        mnProgramSaving.add(jSeparator5);

        mnProgramAccDeposit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProgramAccDeposit.setText("ฝากเงิน");
        mnProgramSaving.add(mnProgramAccDeposit);

        mnProgramAccLoan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProgramAccLoan.setText("ถอนเงิน");
        mnProgramSaving.add(mnProgramAccLoan);
        mnProgramSaving.add(jSeparator6);

        mnProgramAccClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProgramAccClose.setText("ปิดบัญชีเงินฝาก");
        mnProgramSaving.add(mnProgramAccClose);

        mnProgram.add(mnProgramSaving);

        mnProgramHoon.setText("บัญชีหุ้น");
        mnProgramHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        mnProgramHoonBuy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProgramHoonBuy.setText("ซื้อหุ้น");
        mnProgramHoon.add(mnProgramHoonBuy);

        mnProgramHoonSell.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProgramHoonSell.setText("ขายหุ้น");
        mnProgramHoon.add(mnProgramHoonSell);
        mnProgramHoon.add(jSeparator3);

        mnProgramHoonTranf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProgramHoonTranf.setText("โอนหุ้น");
        mnProgramHoon.add(mnProgramHoonTranf);

        mnProgram.add(mnProgramHoon);

        mnProgramLoan.setText("บัญชีเงินกู้");
        mnProgramLoan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        mnProgramLoanOpen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProgramLoanOpen.setText("เปิดบัญชีเงินกู้");
        mnProgramLoan.add(mnProgramLoanOpen);

        mnProgramLoanPayment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProgramLoanPayment.setText("รับชำระเงินกู้");
        mnProgramLoan.add(mnProgramLoanPayment);

        mnProgram.add(mnProgramLoan);
        mnProgram.add(jSeparator15);

        mnProgramExit.setBackground(new java.awt.Color(204, 0, 0));
        mnProgramExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProgramExit.setText("ออกจากระบบ (Exit)");
        mnProgram.add(mnProgramExit);

        jMenuBar1.add(mnProgram);

        mnSettings.setText("ตั้งค่าการใช้งาน");
        mnSettings.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnConfigSystem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnConfigSystem.setText("ตั้งค่าระบบ");
        mnSettings.add(mnConfigSystem);

        mnSetupConfig.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSetupConfig.setText("ตั้งค่าข้อมูลบัญชี/ลูกหนี้/หุ้น");
        mnSettings.add(mnSetupConfig);

        jMenuBar1.add(mnSettings);

        mnMaster.setText("แฟ้มข้อมูล");
        mnMaster.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnMember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnMember.setText("ข้อมูลสมาชิก");
        mnMaster.add(mnMember);

        mnMemberType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnMemberType.setText("ข้อมูลประเภทสมาชิก");
        mnMaster.add(mnMemberType);

        mnExpense.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnExpense.setText("ข้อมูลค่าใช้จ่าย");
        mnMaster.add(mnExpense);

        mnProject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProject.setText("ข้อมูลโครงการ");
        mnMaster.add(mnProject);
        mnMaster.add(jSeparator1);

        mnPrefix.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnPrefix.setText("ข้อมูลคำนำหน้า");
        mnMaster.add(mnPrefix);

        mnStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnStatus.setText("ข้อมูลสถานะ");
        mnMaster.add(mnStatus);
        mnMaster.add(jSeparator8);

        mnFee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnFee.setText("ข้อมูลค่าธรรมเนียม");
        mnMaster.add(mnFee);

        jMenuBar1.add(mnMaster);

        mnAccount.setText("บัญชีใช้งาน");
        mnAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSaveAccount.setText("บัญชีเงินฝาก");
        mnAccount.add(mnSaveAccount);

        mnLoanAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnLoanAccount.setText("บัญชีเงินกู้");
        mnAccount.add(mnLoanAccount);

        mnLoadExcel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnLoadExcel.setText("บันทึกข้อมูลเงินกู้จาก Excel");
        mnAccount.add(mnLoadExcel);

        jMenuBar1.add(mnAccount);

        mnProcess.setText("การดำเนินการ");
        mnProcess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnSaveExpense.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSaveExpense.setText("บันทึกค่าใช้จ่าย");
        mnProcess.add(mnSaveExpense);
        mnProcess.add(jSeparator9);

        mnCloseDialoyDay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnCloseDialoyDay.setText("รายการปิดสิ้นวัน");
        mnProcess.add(mnCloseDialoyDay);
        mnProcess.add(jSeparator13);

        mnPrintHistorySave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnPrintHistorySave.setText("พิมพ์รายการฝากถอนย้อนหลัง");
        mnProcess.add(mnPrintHistorySave);

        mnSaveHistoryLoan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSaveHistoryLoan.setText("พิมพ์รายการเงินกู้ย้อนหลัง");
        mnProcess.add(mnSaveHistoryLoan);
        mnProcess.add(jSeparator12);

        mnCancelOpenAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnCancelOpenAccount.setText("ยกเลิกการเปิดบัญชี");
        mnProcess.add(mnCancelOpenAccount);
        mnProcess.add(jSeparator4);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setText("สรุปรายวันเงินสด");
        mnProcess.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem6.setText("สรุปรายวันทั่วไป");
        mnProcess.add(jMenuItem6);

        jMenuBar1.add(mnProcess);

        mnReport.setText("รายงาน");
        mnReport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnRptMember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptMember.setText("รายงานทะเบียนสมาชิก");
        mnReport.add(mnRptMember);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("รายงานสรุปการดำเนินงาน");
        mnReport.add(jMenuItem1);
        mnReport.add(jSeparator10);

        mnRptOpenAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptOpenAccount.setText("รายงานการเปิดบัญชี");
        mnReport.add(mnRptOpenAccount);

        mnRptCloseAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptCloseAccount.setText("รายงานการปิดบัญชี");
        mnReport.add(mnRptCloseAccount);

        jMenu5.setText("รายงานเงินฝาก/ถอน");
        jMenu5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setText("รายงานความเคลื่อนไหวเงินฝาก/ถอน");
        jMenu5.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem3.setText("แสดงรายละเอียด การจ่ายดอกเบี้ยเงินฝาก");
        jMenu5.add(jMenuItem3);

        mnReport.add(jMenu5);

        mnMainRptHoon.setText("รายงานหุ้น");
        mnMainRptHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem7.setText("รายงานความเคลื่อนไหวหุ้น");
        mnMainRptHoon.add(jMenuItem7);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem5.setText("การปันผลหุ้น");
        mnMainRptHoon.add(jMenuItem5);

        mnReport.add(mnMainRptHoon);

        mnMainRptLoan.setText("รายงานเงินกู้");
        mnMainRptLoan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem43.setText("รายงานการกู้เงิน");
        mnMainRptLoan.add(jMenuItem43);

        jMenuItem44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem44.setText("รายงานการรับชำระ");
        mnMainRptLoan.add(jMenuItem44);
        mnMainRptLoan.add(jSeparator11);

        jMenuItem46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem46.setText("รายงานลูกหนี้ค้างชำระ และดอกเบี้ย");
        mnMainRptLoan.add(jMenuItem46);

        jMenuItem45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem45.setText("รายงานลูกหนี้ค้างชำระ และดอกเบี้ยสรุป");
        mnMainRptLoan.add(jMenuItem45);

        mnReport.add(mnMainRptLoan);

        mnRptFee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptFee.setText("รายงานค่าธรรมเนียมต่าง ๆ");
        mnReport.add(mnRptFee);
        mnReport.add(jSeparator2);

        mnRptProfitCompany.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptProfitCompany.setText("รายงานผลประกอบการ");
        mnReport.add(mnRptProfitCompany);

        mnRptCheckAudit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnRptCheckAudit.setForeground(new java.awt.Color(0, 153, 153));
        mnRptCheckAudit.setText("รายงานความเคลื่อนไหวรายบุคคล");
        mnReport.add(mnRptCheckAudit);
        mnReport.add(jSeparator14);

        mnRptTransaction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptTransaction.setText("รายงานสรุปความเคลื่อนไหว");
        mnReport.add(mnRptTransaction);

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem8.setText("หนังสือแจ้งเงินกู้และค่าหุ้น");
        mnReport.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem9.setText("รายละเอียดสมาชิกทุกรายการ");
        mnReport.add(jMenuItem9);

        jMenuBar1.add(mnReport);

        mnHelp.setText("ช่วยเหลือ (Help)");
        mnHelp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem11.setText("สำรองข้อมูล");
        mnHelp.add(jMenuItem11);

        jMenuItem38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem38.setText("Reset Data");
        mnHelp.add(jMenuItem38);

        jMenuItem47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem47.setText("อัพเดตความเคลื่อนไหว");
        mnHelp.add(jMenuItem47);
        mnHelp.add(jSeparator7);

        jMenuItem37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem37.setText("อัพเดตโปรแกรม");
        mnHelp.add(jMenuItem37);

        jMenuBar1.add(mnHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookPageAt;
    private javax.swing.JTextField LoanCustID;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btnApproveMoreMoney;
    private javax.swing.JButton btnAssetGaruntee;
    private javax.swing.JButton btnCancelBuyHoon;
    private javax.swing.JButton btnCancelCloseSaveAccount;
    private javax.swing.JButton btnCancelOpenAcc4;
    private javax.swing.JButton btnCancelOpenAccount;
    private javax.swing.JButton btnCancelPayment;
    private javax.swing.JButton btnCancelSaveGuarantor;
    private javax.swing.JButton btnCancelSaveLoanAccountRegister;
    private javax.swing.JButton btnCancelSaveMoney;
    private javax.swing.JButton btnCancelSellHoon;
    private javax.swing.JButton btnCancelTransferHoon;
    private javax.swing.JButton btnCancelWithdrawMoney;
    private javax.swing.JButton btnChooseAccToTranHoon;
    private javax.swing.JButton btnChooseDateSellHoon;
    private javax.swing.JButton btnChooseDateTransfer;
    private javax.swing.JButton btnChooseGuarantor;
    private javax.swing.JButton btnCloseSaveAccount;
    private javax.swing.JButton btnConfirmPayment;
    private javax.swing.JButton btnDelSaveGuarantor;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFindPersonToTransfer;
    private javax.swing.JButton btnPrintLoanPaper;
    private javax.swing.JButton btnPrintSliplOpenAcc;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSaveAccOpen;
    private javax.swing.JButton btnSaveByHoon;
    private javax.swing.JButton btnSaveGuarantor;
    private javax.swing.JButton btnSaveLoanAccountRegister;
    private javax.swing.JButton btnSaveMoney;
    private javax.swing.JButton btnSellHoon;
    private javax.swing.JButton btnTimeShow;
    private javax.swing.JButton btnTransactionSaveDialog;
    private javax.swing.JButton btnTransferHoon;
    private javax.swing.JButton btnWithdrawMoney;
    private javax.swing.JComboBox cbAccType;
    private javax.swing.JComboBox cbAddrType;
    private javax.swing.JComboBox cbHoonType;
    private javax.swing.JComboBox cbLoanAcc;
    private javax.swing.JComboBox cbLoanTypePayment;
    private javax.swing.JCheckBox chkSave1;
    private javax.swing.JCheckBox chkSave2;
    private javax.swing.JCheckBox chkSelectAllSellHoon;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbMoneyText;
    private javax.swing.JLabel lbMoneyText1;
    private javax.swing.JLabel lbPic;
    private javax.swing.JLabel lblBuyHoonTitle;
    private javax.swing.JLabel lblCloseAccountTitle;
    private javax.swing.JLabel lblLoanPromiseTitle;
    private javax.swing.JLabel lblPaymentLoanTitle;
    private javax.swing.JLabel lblSaveAccountNo;
    private javax.swing.JLabel lblSaveAccountTitle;
    private javax.swing.JLabel lblSaveBookNo;
    private javax.swing.JLabel lblSaveEvidence;
    private javax.swing.JLabel lblSaveFee;
    private javax.swing.JLabel lblSaveOpenTitle;
    private javax.swing.JLabel lblSelectSaveAccount;
    private javax.swing.JLabel lblSellHoonTitle;
    private javax.swing.JLabel lblTransferHoonTitle;
    private javax.swing.JLabel lblWithdrawAccountTitle;
    private javax.swing.JMenu mnAccount;
    private javax.swing.JMenuItem mnCancelOpenAccount;
    private javax.swing.JMenuItem mnCloseDialoyDay;
    private javax.swing.JMenuItem mnConfigSystem;
    private javax.swing.JMenuItem mnExpense;
    private javax.swing.JMenuItem mnFee;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenuItem mnLoadExcel;
    private javax.swing.JMenuItem mnLoanAccount;
    private javax.swing.JMenu mnMainRptHoon;
    private javax.swing.JMenu mnMainRptLoan;
    private javax.swing.JMenu mnMaster;
    private javax.swing.JMenuItem mnMember;
    private javax.swing.JMenuItem mnMemberType;
    private javax.swing.JMenuItem mnPrefix;
    private javax.swing.JMenuItem mnPrintHistorySave;
    private javax.swing.JMenu mnProcess;
    private javax.swing.JMenu mnProgram;
    private javax.swing.JMenuItem mnProgramAccClose;
    private javax.swing.JMenuItem mnProgramAccDeposit;
    private javax.swing.JMenuItem mnProgramAccLoan;
    private javax.swing.JMenuItem mnProgramAccOpen;
    private javax.swing.JMenuItem mnProgramExit;
    private javax.swing.JMenu mnProgramHoon;
    private javax.swing.JMenuItem mnProgramHoonBuy;
    private javax.swing.JMenuItem mnProgramHoonSell;
    private javax.swing.JMenuItem mnProgramHoonTranf;
    private javax.swing.JMenu mnProgramLoan;
    private javax.swing.JMenuItem mnProgramLoanOpen;
    private javax.swing.JMenuItem mnProgramLoanPayment;
    private javax.swing.JMenu mnProgramSaving;
    private javax.swing.JMenuItem mnProject;
    private javax.swing.JMenu mnReport;
    private javax.swing.JMenuItem mnRptCheckAudit;
    private javax.swing.JMenuItem mnRptCloseAccount;
    private javax.swing.JMenuItem mnRptFee;
    private javax.swing.JMenuItem mnRptMember;
    private javax.swing.JMenuItem mnRptOpenAccount;
    private javax.swing.JMenuItem mnRptProfitCompany;
    private javax.swing.JMenuItem mnRptTransaction;
    private javax.swing.JMenuItem mnSaveAccount;
    private javax.swing.JMenuItem mnSaveExpense;
    private javax.swing.JMenuItem mnSaveHistoryLoan;
    private javax.swing.JMenu mnSettings;
    private javax.swing.JMenuItem mnSetupConfig;
    private javax.swing.JMenuItem mnStatus;
    private javax.swing.JTable tbArGroup1;
    private javax.swing.JTable tbArGroup2;
    private javax.swing.JTable tbGuarantor;
    private javax.swing.JTable tbHistoryPayment;
    private javax.swing.JTable tbTransSave;
    private javax.swing.JTextField txTotalMoneyClose;
    private javax.swing.JTextField txtARProduct;
    private javax.swing.JTextField txtAccCode;
    private javax.swing.JTextField txtAccCode2;
    private javax.swing.JTextField txtAccCodeLoad;
    private javax.swing.JTextField txtAccTypeName;
    private javax.swing.JTextField txtAccountCode;
    private javax.swing.JTextField txtAddNo1;
    private javax.swing.JTextField txtAddrAmphur1;
    private javax.swing.JTextField txtAddrMobile1;
    private javax.swing.JTextField txtAddrMoo1;
    private javax.swing.JTextField txtAddrMooName1;
    private javax.swing.JTextField txtAddrPost1;
    private javax.swing.JTextField txtAddrProvince1;
    private javax.swing.JTextField txtAddrRoad1;
    private javax.swing.JTextField txtAddrSoi1;
    private javax.swing.JTextField txtAddrTambon1;
    private javax.swing.JTextField txtAddrTel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtArIntMgr;
    private javax.swing.JTextField txtArLoanInt;
    private javax.swing.JTextField txtArNetAmt;
    private javax.swing.JTextField txtArTotalBalance;
    private javax.swing.JTextArea txtAssetGaruntee1;
    private javax.swing.JTextField txtB1;
    private javax.swing.JTextField txtB2;
    private javax.swing.JTextField txtB3;
    private javax.swing.JTextField txtB4;
    private javax.swing.JTextField txtB5;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBalanceInterest;
    private javax.swing.JTextField txtBalanceTotal;
    private javax.swing.JTextField txtBookNo;
    private javax.swing.JTextField txtBookPage;
    private javax.swing.JTextField txtBranchName;
    private javax.swing.JTextField txtCashPay;
    private javax.swing.JTextField txtCloseRemark;
    private javax.swing.JTextField txtDateSell;
    private javax.swing.JTextField txtDateTransfer;
    private javax.swing.JTextField txtDepCode;
    private javax.swing.JTextField txtDepositBaht;
    private javax.swing.JTextField txtDepositDate;
    private javax.swing.JTextField txtDocNo;
    private javax.swing.JTextField txtDocNo1;
    private javax.swing.JTextField txtDocnoTransfer;
    private javax.swing.JTextField txtFeeRateName;
    private javax.swing.JTextField txtHoonQTY;
    private javax.swing.JTextField txtHoonTon;
    private javax.swing.JTextField txtImg1;
    private javax.swing.JTextField txtImg2;
    private javax.swing.JTextField txtImg3;
    private javax.swing.JTextField txtIndexNo;
    private javax.swing.JTextField txtIntBadDebt;
    private javax.swing.JTextField txtIntFixedName;
    private javax.swing.JTextField txtIntLost;
    private javax.swing.JTextField txtIntNormal;
    private javax.swing.JTextField txtIntTurnover;
    private javax.swing.JTextField txtLimitLoanAmt;
    private javax.swing.JTextField txtLoanAge;
    private javax.swing.JTextField txtLoanAmt;
    private javax.swing.JTextField txtLoanBirthDate;
    private javax.swing.JTextField txtLoanCardExpire;
    private javax.swing.JTextField txtLoanCustCode;
    private javax.swing.JTextField txtLoanCustName;
    private javax.swing.JTextField txtLoanCustSurname;
    private javax.swing.JTextField txtLoanDateEnd;
    private javax.swing.JTextField txtLoanDateStart;
    private javax.swing.JTextField txtLoanDocCode;
    private javax.swing.JTextField txtLoanFee;
    private javax.swing.JTextField txtLoanIntPercent;
    private javax.swing.JTextField txtLoanName;
    private javax.swing.JTextField txtLoanOccu;
    private javax.swing.JTextField txtLoanPenaltyINT;
    private javax.swing.JTextField txtLoanPerMonth;
    private javax.swing.JTextField txtLoanRegMember;
    private javax.swing.JTextField txtLoanSex;
    private javax.swing.JTextField txtLoanStartDate;
    private javax.swing.JTextField txtMemQty;
    private javax.swing.JTextField txtPayPerMonth;
    private javax.swing.JTextField txtPaymentAmountCash;
    private javax.swing.JTextField txtPaymentDate;
    private javax.swing.JTextField txtPaymentFee;
    private javax.swing.JTextField txtPaymentPerMonth;
    private javax.swing.JTextField txtPriceValue;
    private javax.swing.JTextField txtProfileCode;
    private javax.swing.JTextField txtProfileCode2;
    private javax.swing.JTextField txtProfileName;
    private javax.swing.JTextField txtRemark1;
    private javax.swing.JTextField txtRemark2;
    private javax.swing.JTextField txtSaveCloseBalance;
    private javax.swing.JTextField txtSaveCloseInterest;
    private javax.swing.JTextField txtSaveFee;
    private javax.swing.JTextField txtShowEmpCode;
    private javax.swing.JTextField txtShowEmpName;
    private javax.swing.JTextField txtStartAcc;
    private javax.swing.JTextField txtStartDateOpenSaveAccount;
    private javax.swing.JTextField txtStartLoanDate;
    private javax.swing.JTextField txtTotaTransferHoonAmt;
    private javax.swing.JTextField txtTotalAccount;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtTotalSave;
    private javax.swing.JTextField txtTotalSellHoonAmount;
    private javax.swing.JTextField txtTotalValue;
    private javax.swing.JPasswordField txtTransferAppCode;
    private javax.swing.JTextField txtTransferPerson;
    private javax.swing.JTextField txtValueBaht;
    private javax.swing.JTextField txtWithdrawAccTypeName;
    private javax.swing.JTextField txtWithdrawDate;
    private javax.swing.JTextField txtWithdrawalBaht;
    private javax.swing.JTextField txtWithdrawalCode;
    // End of variables declaration//GEN-END:variables
}
