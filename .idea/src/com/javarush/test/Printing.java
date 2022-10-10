package com.javarush.test;

public class Printing {
    //Отель
    private int Number; //Номер
    private int Number_of_rooms; //Количество копий
    private String Room;

    public Printing(int Number,  int Number_of_rooms, String Book) {
        this.Number = Number;
        this.Room = Room;
        this.Number_of_rooms = Number_of_rooms;
    }
    public Printing() {
    }
    public int getNumber() {
        return Number;
    }
    public void setNumber(int Number) {
        this.Number = Number;
    }

    public int getNumber_of_rooms() {
        return Number_of_rooms;
    }
    public void setNumber_of_copies(int Number_of_rooms){
        if (Number_of_rooms >= 0 && Number_of_rooms <= 1000){
            this.Number_of_rooms = Number_of_rooms;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 1000");
        }
    }

    public String getRoom() {
        return Room;
    }
    public void setRoom(String room) {
        this.Room = Room;
    }
}

