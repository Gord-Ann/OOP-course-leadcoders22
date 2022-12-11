package ru.pgups.sumarokova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Admin admin1 = new Admin("dima", "987547647676");
        System.out.println("name admin: "+ admin1.getName());
        System.out.println("phone admin: "+ admin1.getPhone());

        System.out.println(" ");
        Courier courier1 = new Courier();
        courier1.inputNumber();
        courier1.setPerson();
        Person person1 = new Person("momo", "9865445768") {
            @Override
            public void setPerson(Person person) {
            }};
        person1.infoPerson();
        Scanner scanner = new Scanner (System.in);
        Customer customer1=new Customer();
        System.out.println("enter the data");
        System.out.println("Name customer: ");
        customer1.setName(scanner.nextLine());
        System.out.println("Phone: ");
        customer1.setPhone(scanner.nextLine());
        System.out.println("address customer: ");
        customer1.setAddress(scanner.nextLine());
        }
}
