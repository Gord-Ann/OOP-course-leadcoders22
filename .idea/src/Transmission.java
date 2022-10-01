public class Transmission {
    private String gearType;
    private int gearsAmount;
    private String driveType;

    public Transmission(String gearType, int gearsAmount, String driveType){
        this.gearType = gearType;
        this.gearsAmount = gearsAmount;
        this.driveType = driveType;
    }

    public Transmission(){
    }

    public String getgearType() {
        return gearType;
    }

    public void setgearType(String gearType) {
        this.gearType = gearType;
    }

    public int getgearsAmount() {
        return gearsAmount;
    }

    public void setgearsAmount(int gearsAmount) {
        if (gearsAmount > 0){
            this.gearsAmount = gearsAmount;
        }else{
            System.out.println("gearsAmount cannot be less than 0");
        }
    }

    public String getdriveType() {
        return driveType;
    }
    public void setdriveType(String driveType) {
        this.driveType = driveType;
    }
}
