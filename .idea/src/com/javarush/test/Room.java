package com.javarush.test;

public class Room {
    private String name;
    private String wifi ; //Наличие вайфая
    private int theDate;  //Дата
    private String Hotel;
    int roomName;//Номер комнаты

    public Room(String wifi, int theDate, String name, String Hotel, int roomName) {
        this.wifi = wifi;
        this.theDate = theDate;
        this.name = name;
        this.Hotel = Hotel;
        this.roomName = roomName;
    }
    public Room() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getWifi() {
        return wifi;
    }
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public int getTheDate(){
        return theDate;
    }
    public void setYear(int year){
        if (theDate >= 1990 && theDate <= 2022){
            this.theDate = theDate;
        }else{
            System.out.println("Year cannot be less than 1990 or more than 2022");
        }

    }
    public int getroomName() {
        return roomName;
    }
    public void setroomName(int roomName) {
        this.roomName = roomName;

    }
    public String getHotel() {
        return Hotel;
    }
    public void setAuthor(String Hotel) {
        this.Hotel = Hotel;
    }

}


