package ru.pgups.kyalina;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Address address = new Address();
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
        System.out.println(address.gethouseNumber());
        System.out.println();

        Car car = new Car();
        System.out.println(car.getNumber());
        System.out.println(car.getModel());
        System.out.println(car.getcarBrand());
        System.out.println();

        Distinathion destinathion = new Distinathion();
        System.out.println(destinathion.getCountry());
        System.out.println(destinathion.getCity());
        System.out.println(destinathion.getAddress());
        System.out.println();

        Driver driver = new Driver();
        System.out.println(driver.getExperience());
        System.out.println(driver.getAge());
        System.out.println(driver.getName());
        System.out.println();

        Medicalexamination medicalexemination = new Medicalexamination();
        System.out.println(medicalexemination.getConclusion());
        System.out.println(medicalexemination.getNegativeanswer());
        System.out.println(medicalexemination.getPositiveanswer());
        System.out.println();

        Order order = new Order();
        System.out.println(order.getorderNumber());
        System.out.println(order.getCost());
        System.out.println(order.getAddress());
        System.out.println();

        Passenger passenger = new Passenger();
        System.out.println(passenger.getName());
        System.out.println(passenger.getRating());
        System.out.println(passenger.getAddress());
        System.out.println();

        Paymentmethod paymentmethod = new Paymentmethod();
        System.out.println(paymentmethod.getCash());
        System.out.println(paymentmethod.getCard());
        System.out.println(paymentmethod.getAccount());
        System.out.println();

        Serviceclass serviceclass = new Serviceclass();
        System.out.println(serviceclass.getEconomy());
        System.out.println(serviceclass.getEconomy());
        System.out.println(serviceclass.getBusiness());
        System.out.println();
    }
}
