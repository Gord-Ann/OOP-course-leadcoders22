package ru.pgups.kyalina;

public class driver {

    private String experience;
    private int age;
    private int name;

    public driver(String experience, int age, int name) {
        this.experience = experience;
        this.age = age;
        this.name = name;
    }
    public String getExperience() {return this.experience;}

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getAge() {return this.age;}

    public void setAge(int age) { this.age = age;}
    public int getName(){return  this.name;}
    public void setName(int name) {
        this.name = name;


    }
}


