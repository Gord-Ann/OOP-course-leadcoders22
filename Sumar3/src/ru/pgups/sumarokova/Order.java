package ru.pgups.sumarokova;

public class Order {
    private int numberOrder;
    private String date;
    private String time;
    private String price;
    private Delivery delivery;
    private Customer customer;
    private Courier courier;
    private Product nameProduct;

    public Order(int numberOrder, String date, String time, String price,Delivery delivery, Customer customer, Courier courier, Product nameProduct) {
        this.numberOrder = numberOrder;
        this.date = date;
        this.time = time;
        this.price = price;
        this.delivery=delivery;
        this.customer = customer;
        this.courier = courier;
        this.nameProduct = nameProduct;

    }

    public Order(int numberOrder, String date, String time) {
        this.numberOrder = numberOrder;
        this.date = date;
        this.time = time;
    }

    public Order() {
    }

    public Order(int number) {
        this.numberOrder = number;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Courier getCourier() {
        return courier;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public Product getNameProduct() {
        return nameProduct;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public void setNameProduct(Product nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public void setNumber(int number) {
        this.numberOrder = number;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return numberOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getPrice() {
        return price;
    }

    public void infoOrder() {
        System.out.println("Number order: " + this.numberOrder + "\nDate: " + this.date + "\nTime: " + this.time);

    }
}


