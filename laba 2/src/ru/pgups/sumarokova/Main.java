package ru.pgups.sumarokova;

public class Main {

    public static void main(String[] args){

        Place SPb = new Place("SPb", 12, 23, 3);
        Place Kirov = new Place("Kirov", 2, 3, 12);

        System.out.println("Building name: " + SPb.getName());
        System.out.println("Building has " + SPb.getOfSmall() + " Box small");
        System.out.println("Building has " + SPb.getOfMedium() + " Box medium");
        System.out.println("Building has " + SPb.getOfBig() + " Box big");

        System.out.println(" ");

        System.out.println("Building name: " + Kirov.getName());
        System.out.println("Building has " + Kirov.getOfSmall() + " Box small");
        System.out.println("Building has " + Kirov.getOfMedium() + " Box medium");
        System.out.println("Building has " + Kirov.getOfBig() + " Box bog");
    }


}
