package ru.pgups.sumarokova;
public class Order {
    private int numberOrder;
    private String date;
    private String time;
    private String price;
    private Customer address;
    private Customer nameCustomer;
    private Courier numberCourier;
    private Product nameProduct;

    public Order(int numberOrder, String date, String time, String price, Customer address, Customer nameCustomer, Courier numberCourier) {
        this.numberOrder = numberOrder;
        this.date = date;
        this.time = time;
        this.price = price;
        this.address = address;
        this.nameCustomer = nameCustomer;
        this.numberCourier = numberCourier;
    }

    public Order(int number) {
        this.numberOrder = number;
    }
    public void setAddress(Customer address) {
        this.address = address;
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
    public Courier getNameCourier() {
        return numberCourier;
    }
    public int getNumberOrder() {
        return numberOrder;
    }
    public Product getNameProduct() {
        return nameProduct;
    }
    public void setNameCustomer(Customer nameCustomer) {
        this.nameCustomer = nameCustomer;
    }
    public void setNumberCourier(Courier numberCourier) {
        this.numberCourier = numberCourier;
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

    public Customer getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return numberOrder;
    }

    public Customer getNameCustomer() {
        return nameCustomer;
    }
    public String getPrice() {
        return price;
    }

    public Courier getNumberCourier() {
        return numberCourier;
    }
    public Order() {
}}


