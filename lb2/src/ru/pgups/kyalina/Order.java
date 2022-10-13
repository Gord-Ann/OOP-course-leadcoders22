package ru.pgups.kyalina;

public class Order {

    private int orderNumber;

    private int cost;

    private int address;

    public Order(int ordernumber, int cost, int address){
        this.orderNumber = orderNumber;
        this.cost = cost;
        this.address = address;
    }

    public Order() {

    }

    public int getorderNumber(){return this.orderNumber;
    }
    public void setrderNumber (int orderNumber){
        this.orderNumber = orderNumber;
    }
    public int getCost(){return this.cost;}
    public void  setCost(int cost){
        this.cost = cost;
    }
    public int getAddress(){return this.address;}
    public void setAddress(int address){
        this.address = address;
    }

}

