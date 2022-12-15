package ru.pgups.kyalina;

public class Dispatcher extends Person {

    private String experience;
    public Dispatcher(String firstName, String lastName, String address, String experience) {
        super(firstName, lastName, address);
        this.experience = experience;
    }
    public void display() {
        super.display();
        System.out.println("Experience: " + this.experience);
    }

}

