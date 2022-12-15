package com.javarush.test;

public class Payment {
    static int payment;

    public Payment() {
    }

    public Payment(int payment) {
        this.payment = payment;

    }

    public static int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        while (true) {
            if (payment > 0) {
                this.payment = payment;
                break;
            }
        }
    }

    public void GetInfo() {
        System.out.println(this.payment + "$");
    }
}
