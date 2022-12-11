package ru.pgups.sumarokova;

import java.util.Scanner;

public class Courier extends Person{
    private int number;
    public Courier(String name, String phone, int number){
        super(name, phone);
        this.number=number;
    }

    public Courier() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int inputNumber(){
        System.out.println("number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number courier: " + number);
        return number;
    }



}