package com.javarush.test;

public class printing {
    //Отель
    private int number; //Номер
    private int numberOfRooms; //Количество копий
    private String Room;

    public printing(int Number, int NumberOfRooms, String Book) {
        this.number = Number;
        this.Room = Room;
        this.numberOfRooms = NumberOfRooms;
    }
    public printing() {
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int Number) {
        this.number = Number;
    }

    public int getNumberOfrooms() {
        return numberOfRooms;
    }
    public void setNumber_of_copies(int NumberOfrooms){
        if (NumberOfrooms >= 0 && NumberOfrooms <= 1000){
            this.numberOfRooms = NumberOfrooms;
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

