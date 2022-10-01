public class Body {

    private String bodyType;
    private String bodyColor;
    private int bodyconditionRating;

    public Body(String bodyType, String bodyColor, int bodyconditionRating) {
        this.bodyType = bodyType;
        this.bodyColor = bodyColor;
        this.bodyconditionRating = bodyconditionRating;
    }

    public Body(){
    }

    public String getbodyType() {
        return bodyType;
    }

    public void setbodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getbodyColor() {
        return bodyColor;
    }

    public void setbodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getbodyconditionRating() {
        return bodyconditionRating;
    }

    public void setbodyconditionRating(int bodyconditionRating) {
        if(bodyconditionRating >= 0 && bodyconditionRating <= 5){
            this.bodyconditionRating = bodyconditionRating;
        }else{
            System.out.println("Body condition rating cannot be less than 0 or more than 5");
        }
    }
}
