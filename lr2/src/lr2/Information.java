package lr2;

public class Information {
    private String food;
    private String wifi;

    public Information (String food, String wifi) {
        this.food = food;
        this.wifi = wifi;
    }
    public Information () {
    }
    public String getFood(){
        return food;
    }
    public void setFood(String food){
        this.food = food;
    }
    public String getWifi(){
        return wifi;
    }
    public void setWifi(String wifi){
        this.wifi = wifi;
    }
}