package com.javarush.test;
public class addressGuest {
    private String City;
    private static String street;
    private static int houseNumber;

    public addressGuest(String City, String street, int houseNumber){
        this.City = City;
        this.street = street;
        this.houseNumber = houseNumber;
    }
    public addressGuest(){
    }
    public String getCity() {
        return City;
    }
    public void setCity(String City) {
        this.City = City;
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
