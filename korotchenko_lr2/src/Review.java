public class Review {
    private int ratingFood;
    private int ratingWifi;

    public Review(int ratingFood, int ratingWifi) {
        this.ratingFood = ratingFood;
        this.ratingWifi = ratingWifi;
    }

    public Review() {
    }

    public int getratingFood() {
        return ratingFood;
    }

    public void setratingFood(int ratingFood) {
        if (ratingFood > 5) {
            this.ratingFood = ratingFood;
        } else {
            System.out.println("Error. Check your rating");
        }
    }

    public int getratingWifi() {
        return ratingWifi;
    }

    public void setratingWifi(int ratingWifi) {
        if (ratingWifi > 5) {
            this.ratingWifi = ratingWifi;
        } else {
            System.out.println("Error. Check your rating");
        }
    }
}