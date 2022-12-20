package com.school;

public class SchoolNumber {
    private int number;

     public SchoolNumber(){}


    public SchoolNumber(int number){
        this.number= number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int address) {
        this.number = number;
    }
    public void getInfo(){
        System.out.println("number of School: " + this.number);
    }
}


