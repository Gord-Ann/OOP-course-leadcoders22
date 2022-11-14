package testapp.model;

public class FreightItem {

    private String name;
    private String description;

    private Integer quantity;

    private Double weight;
    private Double price;
    private Double totalPriceWithDiscount;

    private boolean hasDiscount;

    public FreightItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalPriceWithDiscount() {
        return totalPriceWithDiscount;
    }

    public void setTotalPriceWithDiscount(Double totalPriceWithDiscount) {
        this.totalPriceWithDiscount = totalPriceWithDiscount;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public void getPriceWithDiscount(Double price, Integer discount, boolean hasDiscount) {
        if (hasDiscount) {
            this.price = price - (price * discount / 100);
        } else {
            System.out.println("Товар продается без скидки");
        }
    }

}
