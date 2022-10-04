public class Providers {
    private String name;
    private String product;
    private int cooperation;

    public Providers(String name, String product, int cooperation) {
        this.name=name;
        this.product=product;
        this.cooperation=cooperation;
    }

    public String getName() { return this.name;}
    public void setName(String name) {
        this.name=name;
    }
    public String getProduct() { return this.product;}
    public void setProduct(String product) {
        this.product=product;
    }
    public int getCooperation() { return this.cooperation;}
    public void setCooperation(int cooperation) {
        this.cooperation=cooperation;}
}
