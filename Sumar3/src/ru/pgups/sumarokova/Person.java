package ru.pgups.sumarokova;

abstract class Person {
    private String name;
    private String phone;
    public Person(String name, String phone){
        this.name=name;
        this.phone=phone;
    }
    public Person() {}
    public void person(){
        System.out.println("Name: "+this.name+", phone: "+this.phone);
    }
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

    public abstract void setPerson();
}
