package lab2;

public class Workers {
    private String sles;
    private String mont;
    private String admin;

    public Workers(String sles, String mont, String admin) {
        this.sles = sles;
        this.mont = mont;
        this.admin = admin;
    }

    public String getSles() {
        return sles;
    }
    public void setSles(String sles) {
        this.sles = sles;
    }

    public String getMont() {
        return mont;
    }
    public void setMont(String mont) {
        this.mont = mont;
    }

    public String getAdmin() {
        return admin;
    }
    public void setAdmin(String admin) {
        this.admin = admin;
    }

}
