package com.school;

public class NumberOfOffices {
    private int numberOfOffices;

    public NumberOfOffices(){}


    public NumberOfOffices(int NumberOfOffices){
        this.numberOfOffices = NumberOfOffices;
    }
    public int getNumberOfOffices() {
        return numberOfOffices;
    }
    public void setNumberOfOffices(int NumberOfOffices) {
        this.numberOfOffices = NumberOfOffices;
    }
    public void getInfo(){
        System.out.println("Number Of Offices: " + this.numberOfOffices);
    }
}
