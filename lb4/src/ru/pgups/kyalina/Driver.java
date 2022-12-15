package ru.pgups.kyalina;

public class Driver extends Person {

    private String salary;

    public Driver(String firstName, String lastName, String address, String salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + this.salary);
    }
}

