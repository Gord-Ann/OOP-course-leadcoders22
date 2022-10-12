package ru.pgups.kyalina;

public class Address {

    private String city;
    private String street;
    private int houseNumber;

    public void Address(String city, String street, int house_number){
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public void Address(){
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int gethouseNumber() {
        return houseNumber;
    }

    public void setHouse_number(int houseNumber) {
        if (houseNumber > 0) {
            this.houseNumber = houseNumber;
        }else{
            System.out.println("House number cannot be less than 0");
        }

    }

}

