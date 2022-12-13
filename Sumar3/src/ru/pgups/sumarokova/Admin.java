package ru.pgups.sumarokova;

public class Admin extends Person {

    private int numberOfOrders;
    public Admin(String name, String phone, int numberOfOrders) {
        super(name, phone);
        this.numberOfOrders=numberOfOrders;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    @Override
    public void getInfo() {
        System.out.println("Name admin: "+this.name+"\nPhone admin: "+this.phone+"\nThe number of order: "+this.numberOfOrders);
    }}

