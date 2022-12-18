package ru.pgups.sumarokova;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Product product1=new Product("pizza 1", 80, 350);
        System.out.println("     New product added: ");
        product1.infoProduct();

        Admin admin1 = new Admin("dima", "98754764766", 28);
        System.out.println("     New admin added: ");
        admin1.getInfo();

        System.out.println(" ");
        Courier courier1 = new Courier("mama","86642232454",1);
        courier1.inputNumber();
        System.out.println("     Courier information");
        courier1.getInfo();

        System.out.println("     New admin added:");
        Admin admin2 = new Admin("momo", "9865445768", 14) {};
        admin2.getInfo();

        Scanner scanner = new Scanner (System.in);
        Customer customer1=new Customer();
        System.out.println("     Enter the data:");
        System.out.println("Name customer: ");
        customer1.setName(scanner.nextLine());
        System.out.println("Phone: ");
        customer1.setPhone(scanner.nextLine());
        System.out.println("Address customer: ");
        customer1.setBankCard(scanner.nextLine());
        customer1.getInfo();

        Delivery delivery1=new Delivery("hohohlo 2");
        delivery1.address();

        System.out.println("        New Order added");
        Order order1=new Order(1);
        order1.setPrice("450");
        order1.setDate("12.12");
        order1.setTime("10:10");
        delivery1.address();
        order1.infoOrder();
        customer1.getInfo();
        courier1.getInfo();
        product1.infoProduct();}
}
