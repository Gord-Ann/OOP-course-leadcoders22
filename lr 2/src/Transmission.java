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

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public int getGearsAmount() {
        return gearsAmount;
    }

    public void setGearsAmount(int gearsAmount) {
        if (gearsAmount > 0){
            this.gearsAmount = gearsAmount;
        }else{
            System.out.println("gearsAmount cannot be less than 0");
        }
    }

    public String getDriveType() {
        return driveType;
    }
    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }
}
