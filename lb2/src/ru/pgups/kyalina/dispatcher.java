package ru.pgups.kyalina;

public class dispatcher {

    private String experience;
    private int salary;
    private int name;

    public dispatcher(String experience, int salary, int name) {
        this.experience = experience;
        this.salary = salary;
        this.name = name;
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
