package ru.pgups.kyalina;

public class Order {

    private String orderNumber;

    private int cost;

    private int address;

    public Order(String ordernumber, int cost, int address){
        this.orderNumber = ordernumber;
        this.cost = cost;
        this.address = address;
    }

    public Order() {

    }

    public String getorderNumber(){return this.orderNumber;}
    public void setrderNumber (String orderNumber){
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

