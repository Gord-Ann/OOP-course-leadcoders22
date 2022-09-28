package ru.pgups.sumarokova;


public class Place {

    private String name;
    private int number_ofA;
    private int number_ofB;
    private int number_ofC;

    public Place (String name, int number_ofA, int number_ofB, int number_ofC){
        this.name = name;
        this.number_ofA = number_ofA;
        this.number_ofB = number_ofB;
        this.number_ofC = number_ofC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_ofA() {
        return number_ofA;
    }

    public void setNumber_ofA(int number_ofA) {
        this.number_ofA = number_ofA;
    }

    public int getNumber_ofB() {
        return number_ofB;
    }

    public void setNumber_ofB(int number_ofB) {
        this.number_ofB = number_ofB;
    }

    public int getNumber_ofC() {
        return number_ofC;
    }

    public void setNumber_ofC(int number_ofC) {
        this.number_ofC = number_ofC;
    }
}

class MainPlace {
    public static void main(String[] args){
        Place ABC = new Place("ABC", 50, 40,30);
        System.out.println("Building name: " + ABC.getName());
        System.out.println("Building has " + ABC.getNumber_ofA() + " Box A");
        System.out.println("Building has " + ABC.getNumber_ofB() + " Box B");
        System.out.println("Building has " + ABC.getNumber_ofC() + " Box C");

        ABC.setName("CBA");
        System.out.println("Building has another name: " + ABC.getName());

        ABC.setNumber_ofA(48);
        System.out.println(ABC.getName() + " now has " + ABC.getNumber_ofA() + " Box A");

        ABC.setNumber_ofB(30);
        System.out.println(ABC.getName() + " now has " + ABC.getNumber_ofB() + " Box B");

        ABC.setNumber_ofC(10);
        System.out.println(ABC.getName() + " now has " + ABC.getNumber_ofC() + " Box C");
    }


}