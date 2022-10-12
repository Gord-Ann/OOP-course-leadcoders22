package ru.pgups.kyalina;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Address Address = new Address();
        System.out.println(Address.getCity());
        System.out.println(Address.getStreet());
        System.out.println(Address.gethouseNumber());
        System.out.println();

        Car Car = new Car();
        System.out.println(Car.getNumber());
        System.out.println(Car.getModel());
        System.out.println(Car.getcarBrand());
        System.out.println();

        Distinathion Destinathion = new Distinathion();
        System.out.println(Destinathion.getCountry());
        System.out.println(Destinathion.getCity());
        System.out.println(Destinathion.getAddress());
        System.out.println();

        Driver Driver = new Driver();
        System.out.println(Driver.getExperience());
        System.out.println(Driver.getAge());
        System.out.println(Driver.getName());
        System.out.println();

        Medicalexemination Medicalexemination = new Medicalexemination();
        System.out.println(Medicalexemination.getConclusion());
        System.out.println(Medicalexemination.getnegativeAnswer());
        System.out.println(Medicalexemination.getpositiveAnswer());
        System.out.println();

        Order Order = new Order();
        System.out.println(Order.getorderNumber());
        System.out.println(Order.getCost());
        System.out.println(Order.getAddress());
        System.out.println();

        Passenger Passenger = new Passenger();
        System.out.println(Passenger.getName());
        System.out.println(Passenger.getRating());
        System.out.println(Passenger.getAddress());
        System.out.println();

        Paymentmethod Paymentmethod = new Paymentmethod();
        System.out.println(Paymentmethod.getCash());
        System.out.println(Paymentmethod.getCard());
        System.out.println(Paymentmethod.getAccount());
        System.out.println();

        Serviceclass Serviceclass = new Serviceclass();
        System.out.println(Serviceclass.getEconomy());
        System.out.println(Serviceclass.getEconomy());
        System.out.println(Serviceclass.getBusiness());
        System.out.println();















    }
}
