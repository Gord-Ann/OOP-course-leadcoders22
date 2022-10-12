package ru.pgups.efimova;

import javax.print.DocFlavor;

public class Classroom {

    private String name;
    private int number;
    private int capacity;

    public Classroom(String name, int number, int capacity) {
        this.name = name;
        this.number = number;
        this.capacity = capacity;
    }

    public String getName() {return this.name;}
    public void setName(String name){
        this.name = name;
    }
    public int getNumber(){return this.number;}
    public void setNumber(int number){
        this.number = number;
}
    public int getCapacity(){return this.capacity;}
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    }

