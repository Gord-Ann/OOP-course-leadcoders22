package lab2;

public class Food {
    private String includedInThePrice;


    public Food(String includedInThePrice) {
        this.includedInThePrice = includedInThePrice;
    }

    public String getIncludedInThePrice() {
        return includedInThePrice;
    }

    public void setIncludedInThePrice(String includedInThePrice) {
        this.includedInThePrice = includedInThePrice;
    }
}