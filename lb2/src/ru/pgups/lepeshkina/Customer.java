package ru.pgups.lepeshkina;

public class Customer {
    private String fio;
    private String productName;
    private int price;

    public Customer(String fio, String productName, int price) {
        this.fio = fio;
        this.productName = productName;
        this.price = price;
    }
    public String getFio() {
        return this.fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
