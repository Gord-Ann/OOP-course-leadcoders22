package com.javarush.test;
public class AddressGuest {
    private String city;
    private static String street;
    private static int houseNumber;

    public AddressGuest(String City, String street, int houseNumber){
        this.city = City;
        this.street = street;
        this.houseNumber = houseNumber;
    }
    public AddressGuest(){
    }
    public String getCity() {
        return city;
    }
    public void setCity(String City) {
        this.city = City;
    }
    public static String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public static int getHouse_number() {
        return houseNumber;
    }
    public void setHouseNumber(int houseNumber) {
        if (houseNumber > 0) {
            this.houseNumber = houseNumber;
        }else{
            System.out.println("House number cannot be less than 0");
        }
    }
}
