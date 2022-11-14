package testapp.model.person;

import testapp.model.address.ArrivalAddress;

public class Receiver extends Person {

    private ArrivalAddress address;

    public Receiver(String name, String phoneNumber, String email, ArrivalAddress address) {
        super(name, phoneNumber, email);
        this.address = address;
    }

    public Receiver() {
    }

    public ArrivalAddress getAddress() {
        return address;
    }

    public void setAddress(ArrivalAddress address) {
        this.address = address;
    }

    @Override
    public void getDescription() {
        System.out.println("Информация о получателе");
    }
}
