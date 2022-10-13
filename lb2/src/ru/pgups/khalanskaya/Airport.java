package ru.pgups.khalanskaya;

public class Airport {
    private String name;

    private int city;

    private int address;

    public Airport(){
        this.name = name;
        this.city = city;
        this.address = address;
    }
    public String getName(){return this.name;}
    public void setName (String name){
        this.name = name;
    }
    public int getCity(){return this.city;}
    public void  setCity(int city){
        this.city = city;
    }
    public int getAddress(){return this.address;}
    public void setAddress(int address){
        this.address = address;
    }
}
