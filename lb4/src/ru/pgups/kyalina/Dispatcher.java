package ru.pgups.kyalina;

public class Dispatcher {


private String experience ;
    private int salary;
    private int name;

    public Dispatcher(String experience, int salary, int name) {
        this.experience = experience;
        this.salary = salary;
        this.name = name;
    }

    public Dispatcher() {

    }

    public String getExperience() {return this.experience;}
    public void setExperience (String experience) {
        this.experience = experience;
    }
    public int getSalary() {return this.salary;}
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getName(){return this.name;}
    public void setName(int name) {
        this.name = name;
    }
}

