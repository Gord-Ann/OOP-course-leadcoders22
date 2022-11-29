package l3;

public class Work {
    private String view;
    private int cost;

    public Work (String view, int cost){
        this.view= view;
        this.cost=cost;
    }

    public Work() {

    }

    public String getView() {
        return view;
    }

    public void setView() {
        this.view = view;
    }

    public int getCost() {
        return cost;
    }

    public void setCost() {
        this.cost = cost;
    }
}
