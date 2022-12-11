public class Hospital {
    private String ticket;
    private String wifi;
    private String cabinet;

    public Hospital (String ticket, String wifi, String cabinet) {
        this.ticket = ticket;
        this.wifi = wifi;
        this.cabinet = cabinet;
    }

    public String getFood(){
        return ticket;
    }
    public String getWifi (){
        return wifi;
    }
    public String getcabinet(){
        return cabinet;
    }
}
