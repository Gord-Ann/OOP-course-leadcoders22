public class Transport {
    private String name;
    private String model;
    private int price;

    public Transport(String name, String model, int price) {
        this.name=name;
        this.model=model;
        this.price=price;
    }

    public String getName() { return this.name;}
    public void setName(String name) {
        this.name=name;
    }
    public String getModel() { return this.model;}
    public void setModel(String model) {
        this.model=model;
    }
    public int getPrice() { return this.price;}
    public void setPrice(int price) {
        this.price=price;}
}
