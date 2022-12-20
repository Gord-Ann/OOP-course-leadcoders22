package com.school;

public class NumberOfClasses {
    private int numberOfClasses;

    public NumberOfClasses() {
    }


    public NumberOfClasses(int NumberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int NumberOfClasses) {
        this.numberOfClasses = NumberOfClasses;
    }

    public void getInfo() {
        System.out.println("Number Of Classes: " + this.numberOfClasses);
    }
}
