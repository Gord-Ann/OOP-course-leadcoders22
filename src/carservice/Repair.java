package carservice;

public class Repair {

    private String[] repair = new String[100];
    private String cars;
    private String details;
    private int num;
    private int count;

    public String getCars() {
        return cars;
    }

    public String getDetails() {
        return details;
    }

    public int getNum() {
        return num;
    }

    public int getCount() {
        return count;
    }

    public void setRepair(String[] repair) {
        this.repair = repair;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setCount(int count) {
        this.count = count;
    }
        
    public void setRepair() {
        repair[count] = cars + "/" + details + "/" + num;
    }

    public String[] getRepair() {
        return repair;
    }
}
