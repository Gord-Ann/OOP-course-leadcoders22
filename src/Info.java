public class Info {
    private int ratingTicket;
    private int ratingWifi;
    private int ratingCabinet;

    public Info (int ratingTicket, int ratingWifi, int ratingCabinet) {
        this.ratingTicket = ratingTicket;
        this.ratingWifi = ratingWifi;
        this.ratingCabinet = ratingCabinet;
    }
    public int getRatingFood(){
        return ratingTicket;
    }
    public int getRatingRoom() {
        return ratingCabinet;
    }
    public int getRatingWifi() {
        return ratingWifi;
    }
}
