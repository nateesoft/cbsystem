package th.co.cbank.project.view.feature;

import java.math.BigDecimal;

public class OpenSavingAccountModel {

    private String profileCode;
    private String accountType;
    private String accountCode;
    private String accountBookNo;
    private BigDecimal saveFee;
    private String evidenPersonalId;
    private String evidenHomeAt;

    public OpenSavingAccountModel() {
    }

    public OpenSavingAccountModel(String profileCode, String accountType, String accountCode, String accountBookNo, BigDecimal saveFee, String evidenPersonalId, String evidenHomeAt) {
        this.profileCode = profileCode;
        this.accountType = accountType;
        this.accountCode = accountCode;
        this.accountBookNo = accountBookNo;
        this.saveFee = saveFee;
        this.evidenPersonalId = evidenPersonalId;
        this.evidenHomeAt = evidenHomeAt;
    }

    public String getProfileCode() {
        return profileCode;
    }

    public void setProfileCode(String profileCode) {
        this.profileCode = profileCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountBookNo() {
        return accountBookNo;
    }

    public void setAccountBookNo(String accountBookNo) {
        this.accountBookNo = accountBookNo;
    }

    public BigDecimal getSaveFee() {
        return saveFee;
    }

    public void setSaveFee(BigDecimal saveFee) {
        this.saveFee = saveFee;
    }

    public String getEvidenPersonalId() {
        return evidenPersonalId;
    }

    public void setEvidenPersonalId(String evidenPersonalId) {
        this.evidenPersonalId = evidenPersonalId;
    }

    public String getEvidenHomeAt() {
        return evidenHomeAt;
    }

    public void setEvidenHomeAt(String evidenHomeAt) {
        this.evidenHomeAt = evidenHomeAt;
    }

    public boolean validateProfileCode() {
        if (this.getProfileCode() == null) {
            return false;
        }
        if ("".equals(this.getProfileCode().trim())) {
            return false;
        }
        String tmp = "";
        for (int i = 0; i < this.getProfileCode().length(); i++) {
            String tmpChar = "" + this.getProfileCode().charAt(i);
            if ("".equals(tmpChar.trim())) {
                return false;
            }
            tmp += this.getProfileCode().charAt(i);
        }
        return !"".equals(tmp);
    }

    public boolean validateAccountType() {
        if (this.getAccountType() == null) {
            return false;
        }
        if ("".equals(this.getAccountType().trim())) {
            return false;
        }
        String tmp = "";
        for (int i = 0; i < this.getAccountType().length(); i++) {
            String tmpChar = "" + this.getAccountType().charAt(i);
            if ("".equals(tmpChar.trim())) {
                return false;
            }
            tmp += this.getAccountType().charAt(i);
        }

        return !"".equals(tmp);
    }

}
