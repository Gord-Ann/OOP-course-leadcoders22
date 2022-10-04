public class Review {
    private int rating_pills;
    private int rating_therapy;

    public Review(int rating_pills, int rating_therapy) {
        this.rating_pills = rating_pills;
        this.rating_therapy = rating_therapy;
    }

    public Review() {
    }

    public int getRating_pills() {
        return rating_pills;
    }

    public void setRating_pills(int rating_pills) {
        if (rating_pills > 5) {
            this.rating_pills = rating_pills;
        } else {
            System.out.println("Error. Check your rating");
        }
    }

    public int getRating_therapy() {
        return rating_therapy;
    }

    public void setRating_therapy(int rating_therapy) {
        if (rating_therapy > 5) {
            this.rating_therapy = rating_therapy;
        } else {
            System.out.println("Error. Check your rating");
        }
    }
}
