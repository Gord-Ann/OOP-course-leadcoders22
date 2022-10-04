public class Equipment {
    private String name;
    private int lifetime;
    private int price;

    public Equipment(String name, int lifetime, int price) {
        this.name=name;
        this.lifetime=lifetime;
        this.price=price;
    }

    public String getName() { return this.name;}
    public void setName(String name) {
        this.name=name;
    }
    public int getPrice() { return this.price;}
    public void setPrice(int price) {
        this.price=price;
    }
    public int getLifetime() { return this.lifetime;}
    public void setLifetime(int lifetime) {
        this.lifetime=lifetime;}
}
