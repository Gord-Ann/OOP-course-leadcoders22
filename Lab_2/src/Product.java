public class Product {
    private String name;
    private int amount;
    private String provider;

    public Product(String name, int amount, String provider) {
        this.name=name;
        this.amount=amount;
        this.provider=provider;
    }

    public String getName() { return this.name;}
    public void setName(String name) {
        this.name=name;
    }
    public int getAmount() { return this.amount;}
    public void setAmount(int amount) {
        this.amount=amount;
    }
    public String getProvider() { return this.provider;}
    public void setProvider(String provider) {
        this.provider=provider;}
}
