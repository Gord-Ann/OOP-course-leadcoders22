package ru.pgups.khalanskaya;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Airport airport = new Airport();
        System.out.println(airport.getName());
        System.out.println(airport.getCity());
        System.out.println(airport.getAddress());
        System.out.println();

        Employees employees = new Employees();
        System.out.println(employees.getPilot());
        System.out.println(employees.getStewardess());
        System.out.println(employees.getDispetcher());
        System.out.println();

        Flights flights = new Flights();
        System.out.println(flights.getCharter());
        System.out.println(flights.getDirect());
        System.out.println(flights.getTransit());
        System.out.println();

        Passenger passenger = new Passenger();
        System.out.println(passenger.getName());
        System.out.println(passenger.getRating());
        System.out.println(passenger.getAddress());
        System.out.println();

        Plane plane = new Plane();
        System.out.println(plane.getNumber());
        System.out.println(plane.getModel());
        System.out.println(plane.getWeight());
        System.out.println();

        SafetySystem safetysystem = new SafetySystem();
        System.out.println(safetysystem.getSignaling());
        System.out.println(safetysystem.getCameras());
        System.out.println(safetysystem.getInspection());
        System.out.println();

        ServiceClass serviceclass = new ServiceClass();
        System.out.println(serviceclass.getEconomy());
        System.out.println(serviceclass.getComfort());
        System.out.println(serviceclass.getBusiness());
        System.out.println();

        Technique technique = new Technique();
        System.out.println(technique.getBus());
        System.out.println(technique.getEscort());
        System.out.println(technique.getLadder());
        System.out.println();

        Tickets tickets = new Tickets();
        System.out.println(tickets.getNumber());
        System.out.println(tickets.getDate());
        System.out.println(tickets.getTime());
        System.out.println();
    }
}
