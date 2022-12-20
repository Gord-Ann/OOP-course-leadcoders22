package com.school;

public class NumberOfTeachers {

    private int numberOfTeachers;

    public NumberOfTeachers(){}


    public NumberOfTeachers(int NumberOfTeachers){
        this.numberOfTeachers = NumberOfTeachers;
    }
    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }
    public void setNumberOfTeachers(int NumberOfTeachers) {
        this.numberOfTeachers = NumberOfTeachers;
    }
    public void getInfo(){
        System.out.println("Number Of Teachers: " + this.numberOfTeachers);
    }
}
