package testapp.model.address;

import java.util.Scanner;

public class Address {

    private String city;
    private String country;
    private String streetName;
    private String streetNumber;

    public Address(String city, String country, String streetName, String streetNumber) {
        this.city = city;
        this.country = country;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String changeStreetName() {
        System.out.println("Введите новое название улицы");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void showAddress() {
        System.out.println("Текущий адрес:");
        System.out.println(
                "Страна: " + this.country +
                        "Город: " + this.city +
                        "Улица: " + this.city +
                        "Номер дома: " + this.city);
    }
}
