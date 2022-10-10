public class Body {

    private String bodyType;
    private String bodyColor;
    private int bodyConditionRating;

    public Body(String bodyType, String bodyColor, int bodyConditionRating) {
        this.bodyType = bodyType;
        this.bodyColor = bodyColor;
        this.bodyConditionRating = bodyConditionRating;
    }

    public Body(){
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getBodyConditionRating() {
        return bodyConditionRating;
    }

    public void setBodyConditionRating(int bodyConditionRating) {
        if(bodyConditionRating >= 0 && bodyConditionRating <= 5){
            this.bodyConditionRating = bodyConditionRating;
        }else{
            System.out.println("Body condition rating cannot be less than 0 or more than 5");
        }
    }
}
