public class Transmission {
    private String gear_type;
    private int gears;
    private String drive_type;

    public Transmission(String gear_type, int gears, String drive_type){
        this.gear_type = gear_type;
        this.gears = gears;
        this.drive_type = drive_type;
    }

    public Transmission(){
    }

    public String getGear_type() {
        return gear_type;
    }

    public void setGear_type(String gear_type) {
        this.gear_type = gear_type;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        if (gears > 0){
            this.gears = gears;
        }else{
            System.out.println("Gears cannot be less than 0");
        }
    }

    public String getDrive_type() {
        return drive_type;
    }
    public void setDrive_type(String drive_type) {
        this.drive_type = drive_type;
    }
}
