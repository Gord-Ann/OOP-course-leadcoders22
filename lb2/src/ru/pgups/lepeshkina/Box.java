package ru.pgups.lepeshkina;

public class Box {
    private String address;
    private int rentalPrice;
    private int square;

    public Box(String address, int rentalPrice, int square) {
        this.address = address;
        this.rentalPrice = rentalPrice;
        this.square = square;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRentalPrice() {
        return this.rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getSquare() {
        return this.square;
    }
    public void setSquare(int square) {
        this.square = square;

    }
}

