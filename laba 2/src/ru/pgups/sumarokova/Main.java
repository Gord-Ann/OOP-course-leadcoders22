package ru.pgups.sumarokova;

public class Main {

    public static void main(String[] args){

        Place spb = new Place("SPb", 12, 23, 3);
        Place kirov = new Place("Kirov", 2, 3, 12);

        System.out.println("Building name: " + spb.getName());
        System.out.println("Building has " + spb.getOfSmall() + " Box small");
        System.out.println("Building has " + spb.getOfMedium() + " Box medium");
        System.out.println("Building has " + spb.getOfBig() + " Box big");

        System.out.println(" ");

        System.out.println("Building name: " + kirov.getName());
        System.out.println("Building has " + kirov.getOfSmall() + " Box small");
        System.out.println("Building has " + kirov.getOfMedium() + " Box medium");
        System.out.println("Building has " + kirov.getOfBig() + " Box bog");
    }


}
