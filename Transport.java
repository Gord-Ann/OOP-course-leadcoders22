public abstract class Transport {
    private String name;
    private int travelTime;

    public Transport(String name, int travelTime) {
        this.name = name;
        this.travelTime = travelTime;
    }
    public String getName(){
        return name;
    }
    public int getTravelTime(){
        return travelTime;
    }
}
