package ru.pgups.sumarokova;

public class Admin extends Person {

    public Admin(String name, String phone) {

        super(name, phone);
    }
    @Override
    public void getInfo() {
        System.out.println(" name: "+this.name+" phone: "+this.phone);
    }
}