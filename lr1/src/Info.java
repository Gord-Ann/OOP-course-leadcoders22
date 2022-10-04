public class Info {
    private String pills;
    private String therapy;

    public Info (String pills, String therapy) {
        this.pills = pills;
        this.therapy = therapy;
    }
    public Info () {
    }
    public String getPills(){
        return pills;
    }
    public void setPills(String pills){
        this.pills = pills;
    }
    public String getTherapy(){
        return therapy;
    }
    public void setTherapy(String therapy){
        this.therapy = therapy;
    }
}

