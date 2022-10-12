package ru.pgups.efimova;

public class Departament {
    private String name;
    private int housing;
    private int numberOfTeachers;

    public Departament(String name, int housing, int numberOfTeachers){
        this.name = name;
        this.housing = housing;
        this.numberOfTeachers = numberOfTeachers;
    }
    public String getName(){return this.name;}
    public void setName(String name){
        this.name =name;
    }
    public int getHousing(){return this.housing;}
    public void setHousing(int housing){
        this.housing = housing;
}
    public int getNumberOfTeachers(){return this.numberOfTeachers;}
    public void setNumberOfTeachers(int numberOfTeachers){
        this.numberOfTeachers = numberOfTeachers;
    }
}

