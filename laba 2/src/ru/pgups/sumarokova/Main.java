package ru.pgups.sumarokova;

public class Main {

    public static void main(String[] args){

        Place AAA = new Place("AAA", 12, 23, 3);
        Place BBB = new Place("BBB", 2, 3, 12);

        System.out.println("Building name: " + AAA.getName());
        System.out.println("Building has " + AAA.getNumber_ofA() + " Box A");
        System.out.println("Building has " + AAA.getNumber_ofB() + " Box B");
        System.out.println("Building has " + AAA.getNumber_ofC() + " Box C");

        System.out.println(" ");

        System.out.println("Building name: " + BBB.getName());
        System.out.println("Building has " + BBB.getNumber_ofA() + " Box A");
        System.out.println("Building has " + BBB.getNumber_ofB() + " Box B");
        System.out.println("Building has " + BBB.getNumber_ofC() + " Box C");
    }


}
