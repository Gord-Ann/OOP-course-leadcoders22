package ru.pgups.efimova;

public class Speciality {
    private int code;
    private String name;
    private int numberOfStudents;

    public Speciality (int code, String name, int numberOfStudents){
        this.code = code;
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }
    public int getCode(){return this.code;}
    public void settCode(int code){
        this.code = code;
    }
    public String getName(){return this.name;}
    public void setName(String name){
        this.name = name;
}
    public int getNumberOfStudents(){return this.numberOfStudents;}
    public void setCode(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
        }
    }