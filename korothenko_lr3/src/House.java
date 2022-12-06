public class House {
    private String food;
    private String wifi;
    private String room;

    public House (String food, String wifi, String room) {
        this.food = food;
        this.wifi = wifi;
        this.room = room;
    }

    public String getFood(){
        return food;
    }
    public String getWifi (){
        return wifi;
    }
    public String getRoom(){
        return room;
    }
}
