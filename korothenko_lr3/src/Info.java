public class Info {
    private int ratingFood;
    private int ratingWifi;
    private int ratingRoom;

    public Info (int ratingFood, int ratingWifi, int ratingRoom) {
        this.ratingFood = ratingFood;
        this.ratingWifi = ratingWifi;
        this.ratingRoom = ratingRoom;
    }
    public int getRatingFood(){
        return ratingFood;
    }
    public int getRatingRoom() {
        return ratingRoom;
    }
    public int getRatingWifi() {
        return ratingWifi;
    }
}
