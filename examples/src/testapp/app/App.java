package testapp.app;

import testapp.model.FreightItem;
import testapp.model.Order;
import testapp.model.address.ArrivalAddress;
import testapp.model.address.DepartureAddress;
import testapp.model.person.Receiver;
import testapp.model.person.Sender;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Выберите действие: " +
                        "1. Создать новый заказ" +
                        "2. Вывести информацию по номеру заказа" +
                        "3. Получить информацию по всем заказам" +
                        "0. Завершение программы");

        Integer choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    orders.add(createOrder());
                    break;
                case 2:
                    System.out.println("Введите номер заказа");
                    Integer orderNumber = scanner.nextInt();
                    getOrderDetailsByNumber(orderNumber, orders);
                case 3:
                    getAllOrdersDetails(orders);
            }
        } while (!choice.equals(0));
    }

    public static Order createOrder() {
        Scanner scanner = new Scanner(System.in);

        Order order = new Order();
        Integer orderNumber = scanner.nextInt();
        order.setNumber(orderNumber);
        order.setSender(createSender());
        order.setReceiver(createReceiver());

        List<FreightItem> freights = new ArrayList<>();
        FreightItem freightItem1 = createFreightItem();
        FreightItem freightItem2 = createFreightItem();
        freights.add(freightItem1);
        freights.add(freightItem2);
        order.setFreights(freights);

        return order;
    }

    public static ArrivalAddress createArrivalAddress() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите страну");
        String country = scanner.nextLine();
        System.out.println("Введите город");
        String city = scanner.nextLine();
        System.out.println("Введите улицу");
        String streetName = scanner.nextLine();
        System.out.println("Введите номер дома");
        String streetNumber = scanner.nextLine();
        System.out.println("Введите время прибытия");
        String time = scanner.nextLine();

        return new ArrivalAddress(city, country, streetName, streetNumber, time);
    }

    public static DepartureAddress createDepartureAddress() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите страну");
        String country = scanner.nextLine();
        System.out.println("Введите город");
        String city = scanner.nextLine();
        System.out.println("Введите улицу");
        String streetName = scanner.nextLine();
        System.out.println("Введите номер дома");
        String streetNumber = scanner.nextLine();

        return new DepartureAddress(city, country, streetName, streetNumber);
    }

    public static Sender createSender() {
        Scanner scanner = new Scanner(System.in);

        Sender sender = new Sender();
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        sender.setName(name);
        System.out.println("Введите номер телефона");
        String phoneNumber = scanner.nextLine();
        sender.setPhoneNumber(phoneNumber);
        System.out.println("Введите email");
        String email = scanner.nextLine();
        sender.setEmail(email);
        System.out.println("Введите адрес отправки");
        sender.setAddress(createDepartureAddress());

        return sender;
    }

    public static Receiver createReceiver() {
        Scanner scanner = new Scanner(System.in);

        Receiver receiver = new Receiver();
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        receiver.setName(name);
        System.out.println("Введите номер телефона");
        String phoneNumber = scanner.nextLine();
        receiver.setPhoneNumber(phoneNumber);
        System.out.println("Введите email");
        String email = scanner.nextLine();
        receiver.setEmail(email);
        System.out.println("Введите адрес доставки");
        receiver.setAddress(createArrivalAddress());

        return receiver;
    }

    public static FreightItem createFreightItem() {
        Scanner scanner = new Scanner(System.in);

        FreightItem freightItem = new FreightItem();
        System.out.println("Введите название товара");
        String name = scanner.nextLine();
        freightItem.setName(name);
        System.out.println("Введите количество");
        Integer quantity = scanner.nextInt();
        freightItem.setQuantity(quantity);
        System.out.println("Введите вес товара");
        Double weight = scanner.nextDouble();
        freightItem.setWeight(weight);

        return freightItem;
    }

    public static void getOrderDetailsByNumber(Integer num, List<Order> orders) {
        if (orders != null) {
            System.out.println(orders.get(num));
        }
    }

    public static void getAllOrdersDetails(List<Order> orders) {
        if (orders != null) {
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }
}
