package com.javarush.test;

public class Room  {
    private static String name;
    private static String wifi ; //Наличие вайфая
    private static int theDate;  //Дата
    private String hotel;
    static int roomName;//Номер комнаты
    private String roomID;
    private String bed;
    private boolean booked;
    public String getBed() {
        return bed;
    }
    public void setBed(String bed) {
        this.bed = bed;
    }

    public Room(String bed)
    {
        this.bed = bed;
    }
    public Room(String bed, String roomID)
    {
        this.roomID= roomID;
        this.bed = bed;
    }

    public Room(String hotel, String roomID, String bed, boolean booked) {
        this.hotel = hotel;
        this.roomID = roomID;
        this.bed = bed;
        this.booked = booked;
    }

    public String getRoomID()
    {
        return roomID;
    }

    void cancel()
    {
        booked = false;
    }


    public boolean isBooked()
    {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public Room(String wifi, int theDate, String name, String Hotel, int roomName) {
        this();
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
    public void setRoomName(int roomName) {
        this.roomName = roomName;

    }
    public String getHotel() {
        return hotel;
    }
    public void setAuthor(String hotel) {
        this.hotel = this.hotel;
    }

}


