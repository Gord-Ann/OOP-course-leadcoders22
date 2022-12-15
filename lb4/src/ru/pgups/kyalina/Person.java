package ru.pgups.kyalina;

public  class Person {

    protected String firstName;
    protected String lastName;
    protected String address;

    public Person(String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public void display(){
        System.out.println(this.firstName +" " + this.lastName);
        System.out.println("Address:" + this.address);
    }

}
