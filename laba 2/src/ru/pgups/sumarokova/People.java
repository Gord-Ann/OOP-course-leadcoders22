package ru.pgups.sumarokova;

public class People {

    private String name;
    private int age;
    private String department;
    private String position;

    public People(String name, int age, String department, String position){
        this.name = name;
        this.age = age;
        this.department = department;
        this.position  = position;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error. Insert the correct value");
        }

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

