package ru.pgups.kyalina;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Booking booking = new Booking();
        System.out.println(booking.getbookId());
        System.out.println(booking.getName());
        System.out.println(booking.getSource());
        System.out.println();

        Customer customer = new Customer();
        System.out.println(customer.getName());
        System.out.println(customer.getRating());
        System.out.println(customer.getAddress());
        System.out.println();

        Database database = new Database();
        System.out.println(database.getCell());
        System.out.println(database.getColumn());
        System.out.println(database.getInformation());
        System.out.println();

        Dispatcher dispatcher = new Dispatcher();
        System.out.println(dispatcher.getExperience());
        System.out.println(dispatcher.getSalary());
        System.out.println(dispatcher.getName());
        System.out.println();

        Drive drive = new Drive();
        System.out.println(drive.getExperience());
        System.out.println(drive.getSalary());
        System.out.println(drive.getName());
        System.out.println();

        Feedback feedback = new Feedback();
        System.out.println(feedback.getcarContent());
        System.out.println(feedback.getuserId());
        System.out.println(feedback.getfeedbackId());
        System.out.println();

        Orders orders = new Orders();
        System.out.println(orders.getNumber());
        System.out.println(orders.getDate());
        System.out.println(orders.getTime());
        System.out.println();

        Payment payment = new Payment();
        System.out.println(payment.getcarAmount());
        System.out.println(payment.getDate());
        System.out.println(payment.getpaymentId()) ;
        System.out.println();

        Ticket ticket = new Ticket();
        System.out.println(ticket.getNumber());
        System.out.println(ticket.getDate());
        System.out.println(ticket.getTime());
        System.out.println();
    }
}





