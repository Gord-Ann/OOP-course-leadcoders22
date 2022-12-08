package com.javarush.test;

public class Room {
    private static String name;
    private static String wifi ; //Наличие вайфая
    private static int theDate;  //Дата
    private String hotel;
    static int roomName;//Номер комнаты

    public Room(String wifi, int theDate, String name, String Hotel, int roomName) {
        this.wifi = wifi;
        this.theDate = theDate;
        this.name = name;
        this.hotel = Hotel;
        this.roomName = roomName;
    }
    public Room() {
    }
    public static String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static String getWifi() {
        return wifi;
    }
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public static int getTheDate(){
        return theDate;
    }
    public void setYear(int year){
        if (theDate >= 1990 && theDate <= 2022){
            this.theDate = theDate;
        }else{
            System.out.println("Year cannot be less than 1990 or more than 2022");
        }

    }
    public static int getroomName() {
        return roomName;
    }
    public void setroomName(int roomName) {
        this.roomName = roomName;

    }
    public String getHotel() {
        return hotel;
    }
    public void setAuthor(String hotel) {
        this.hotel = this.hotel;
    }

}

