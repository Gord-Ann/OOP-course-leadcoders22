package ru.pgups.kyalina;

public class Customer {


    private String name;

    private int rating ;

    private int address;

    public Customer(String name, int rating, int address){
        this.name = name;
        this.rating = rating;
        this.address = address;
    }

    public Customer(){

    }

    public String getName() {return  this.name;}
    public void setName (String name){
        this.name = name;
    }
    public int getRating(){return this.rating;}
    public void setRating(int rating){
        this.rating = rating;
    }
    public int getAddress(){return this.address;}
    public void setAddress(int address){
        this.address = address;
    }
}
