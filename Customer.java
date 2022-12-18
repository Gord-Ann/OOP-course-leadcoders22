package com.javarush.test;
//Заказчик
public class Customer extends Person {
    private String city;
    private String street;
    private int house_number;
    public Customer(String name, String phone, String city, String street, int house_number){
        super(name,phone);
        this.city = city;
        this.street = street;
        this.house_number = house_number;

    }
    public String getCity() {
        return city;
    }
    public void setCity(String City) {
        this.city = city;
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
    @Override
    public  void showData(){
        System.out.println("Name:"+getName() +","+" "+"Phone:"+ getPhone()+ "\n" + "City:"+getCity()+"," + " "+"Street:"+getStreet()+","+" "+"House_number:"+getHouse_number());
    }
}
