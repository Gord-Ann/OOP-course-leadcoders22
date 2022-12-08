package com.javarush.test;

public class Printing {
    //Отель
    private int number; //Номер
    private int numberOfRooms; //Количество копий
    private String room;

    public Printing(int number, int numberOfRooms, String book) {
        this.number = number;
        this.room = room;
        this.numberOfRooms = numberOfRooms;
    }
    public Printing() {
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
        return room;
    }
    public void setRoom(String room) {
        this.room = this.room;
    }
}

