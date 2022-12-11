package ru.pgups.sumarokova;

public class Customer extends Person{
    private String address;
    public Customer(String name, String phone, String address){
        super(name, phone);
        this.address=address;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Customer() {
    }

    @Override
    public void setPerson(Person person) {

    }
}

