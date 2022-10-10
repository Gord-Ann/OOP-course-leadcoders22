package com.javarush.test;
public class Address_Guest {
    private String City;
    private String street;
    private int house_number;

    public Address_Guest(String City, String street, int house_number){
        this.City = City;
        this.street = street;
        this.house_number = house_number;
    }
    public Address_Guest(){
    }
    public String getCity() {
        return City;
    }
    public void setCity(String City) {
        this.City = City;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getHouse_number() {
        return house_number;
    }
    public void setHouse_number(int house_number) {
        if (house_number > 0) {
            this.house_number = house_number;
        }else{
            System.out.println("House number cannot be less than 0");
        }
    }
}
