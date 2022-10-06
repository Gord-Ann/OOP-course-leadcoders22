package ru.pgups.kyalina;

public class order {

    private String ordernumber;

    private int cost;

    private int address;

    public order(String ordernumber, int cost, int address){
        this.ordernumber = ordernumber;
        this.cost = cost;
        this.address = address;
    }
    public String getOrdernumber(){return this.ordernumber;}
    public void setOrdernumber (String ordernumber){
        this.ordernumber = ordernumber;
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

