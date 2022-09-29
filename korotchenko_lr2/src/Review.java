public class Review {
    private int rating_food;
    private int rating_wifi;

    public Review(int rating_food, int rating_wifi) {
        this.rating_food = rating_food;
        this.rating_wifi = rating_wifi;
    }

    public Review() {
    }

    public int getRating_food() {
        return rating_food;
    }

    public void setRating_food(int rating_food) {
        if (rating_food > 5) {
            this.rating_food = rating_food;
        } else {
            System.out.println("Error. Check your rating");
        }
    }

    public int getRating_wifi() {
        return rating_wifi;
    }

    public void setRating_wifi(int rating_wifi) {
        if (rating_wifi > 5) {
            this.rating_wifi = rating_wifi;
        } else {
            System.out.println("Error. Check your rating");
        }
    }
}