package ru.pgups.kyalina;

public class Distinathion {

    private String country;

    private int city;

    private int address;

    public void destinathion(String country, int city, int address){
        this.country = country;
        this.city = city;
        this.address = address;
    }
    public String getCountry(){return this.country;}
    public void setCountry(String country){
        this.country = country;
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
