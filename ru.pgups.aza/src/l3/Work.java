package l3;

  public class Work {
    private final String view;
    private final int cost;

    public Work (String view, int cost){
        this.view= view;
        this.cost=cost;
    }
    public void display(){
        System.out.println("Type of work:"+this.view+"") ;
        System.out.println("Cost:"+ this.cost+" ");
      }

    public String getView() {
        return view;
    }

    public int getCost() {
        return cost;
    }

}

