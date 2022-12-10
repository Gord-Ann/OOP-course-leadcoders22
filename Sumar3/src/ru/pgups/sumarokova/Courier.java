package ru.pgups.sumarokova;

import java.util.Scanner;

public class Courier extends Person{
    private int numberCourier;
    public Courier(String name, String phone, int numberCourier){
        super(name, phone);
        this.numberCourier=numberCourier;
    }

    public Courier() {}

    @Override
    public void setPerson() {

    }

    public void setNumberCourier() {
        System.out.println("number: ");
        Scanner scanner = new Scanner(System.in);
        int numberCourier = scanner.nextInt();
        System.out.println("number courier: " + numberCourier);

    }

    public int getNumberCourier() {
        return numberCourier;
    }

}