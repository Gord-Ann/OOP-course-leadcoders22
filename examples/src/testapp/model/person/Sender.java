package testapp.model.person;

import testapp.model.address.DepartureAddress;

public class Sender extends Person {

    private DepartureAddress address;

    public Sender(String name, String phoneNumber, String email, DepartureAddress address) {
        super(name, phoneNumber, email);
        this.address = address;
    }

    public Sender() {
    }

    public DepartureAddress getAddress() {
        return address;
    }

    public void setAddress(DepartureAddress address) {
        this.address = address;
    }

    @Override
    public void getDescription() {
        System.out.println("Информация об отправителе");
    }
}
