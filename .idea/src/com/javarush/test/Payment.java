package com.javarush.test;

public class Payment {
    static int Payment;

    public Payment() {
    }

    public Payment(int Payment) {
        this.Payment = Payment;

    }

    public static int getPayment() {
        return Payment;
    }

    public void setPayment(int Payment) {
        while (true) {
            if (Payment > 0) {
                this.Payment = Payment;
                break;
            }
        }
    }

    public void GetInfo() {
        System.out.println(this.Payment + "$");
    }
}
