package com.school;

public class Main {
    public static void main(String[] args) {
        SchoolAddress address = new SchoolAddress("адрес");
        System.out.println(address.getAddress());

        SchoolRating rating = new SchoolRating(7);
        System.out.println(rating.getNumber());
        rating.setNumber(12);
        System.out.println(rating.getNumber());
    }
}
