public class Body {

    private String body_type;
    private String body_color;
    private int body_condition_rating;

    public Body(String body_type, String body_color, int body_condition_rating) {
        this.body_type = body_type;
        this.body_color = body_color;
        this.body_condition_rating = body_condition_rating;
    }

    public Body(){
    }

    public String getBody_type() {
        return body_type;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public String getBody_color() {
        return body_color;
    }

    public void setBody_color(String body_color) {
        this.body_color = body_color;
    }

    public int getBody_condition_rating() {
        return body_condition_rating;
    }

    public void setBody_condition_rating(int body_condition_rating) {
        if(body_condition_rating >= 0 && body_condition_rating <= 5){
            this.body_condition_rating = body_condition_rating;
        }else{
            System.out.println("Body condition rating cannot be less than 0 or more than 5");
        }
    }
}
