package ru.pgups.sumarokova;

public class Payment {
    private int number;
    private boolean paid;

    public Payment(int number, boolean paid) {
        this.number = number;
        this.paid = paid;
    }

    public int getNumber() {
        return number;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}


