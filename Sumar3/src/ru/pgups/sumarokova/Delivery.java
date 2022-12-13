package ru.pgups.sumarokova;

public class Delivery {
    private String address;
    public Delivery(String address){
        this.address=address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public void address(){
        System.out.println("Address: " + this.address);
    }
}
