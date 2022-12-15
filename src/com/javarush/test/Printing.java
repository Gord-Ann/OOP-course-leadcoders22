package com.javarush.test;

public class Printing {
    //Отель
    private int number; //Номер
    private int numberOfRooms; //Количество копий
    private String room;

    public Printing(int number, int numberOfRooms, String room) {
        this.number = number;
        this.room = room;
        this.numberOfRooms = numberOfRooms;
    }
    public Printing() {
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfCopies(int numberOfrooms){
        if (numberOfrooms >= 0 && numberOfrooms <= 1000){
            this.numberOfRooms = numberOfrooms;
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

    public String getnumberOfrooms() {
        return null;
    }
}

