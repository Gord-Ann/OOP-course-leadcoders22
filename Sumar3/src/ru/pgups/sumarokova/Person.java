package ru.pgups.sumarokova;

abstract class Person {
    public String name;
    public String phone;
    public Person(String name, String phone){
        this.name=name;
        this.phone=phone;
    }
    public Person() {}

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void infoPerson(){
        System.out.println("Name: "+this.name+", phone: "+this.phone);
    }
    public abstract void getInfo();

}
