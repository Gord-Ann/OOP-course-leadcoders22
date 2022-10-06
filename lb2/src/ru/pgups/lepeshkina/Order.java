package ru.pgups.lepeshkina;

public class Order {
    String name;
    String productType;
    int price;

    public Order(String name, String productType, int price) {
        this.name = name;
        this.productType = productType;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
