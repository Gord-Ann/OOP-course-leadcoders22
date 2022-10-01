package ru.pgups.sumarokova;


public class Place {

    private String name;
    private int ofSmall;
    private int ofMedium;
    private int ofBig;

    public Place (String name, int ofSmall, int ofMedium, int ofBig){
        this.name = name;
        this.ofSmall = ofSmall;
        this.ofMedium = ofMedium;
        this.ofBig = ofBig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOfSmall() {
        return ofSmall;
    }

    public void setOfSmall(int ofSmall) {
        this.ofSmall = ofSmall;
    }

    public int getOfMedium() {
        return ofMedium;
    }

    public void setOfMedium(int ofMedium) {
        this.ofMedium = ofMedium;
    }

    public int getOfBig() {
        return ofBig;
    }

    public void setOfBig(int ofBig) {
        this.ofBig = ofBig;
    }
}

class MainPlace {
    public static void main(String[] args){
        Place Moscow = new Place("Moscow", 50, 40,30);
        System.out.println("Building name: " + Moscow.getName());
        System.out.println("Building has " + Moscow.getOfSmall() + " Box small");
        System.out.println("Building has " + Moscow.getOfMedium() + " Box medium");
        System.out.println("Building has " + Moscow.getOfBig() + " Box big");

        Moscow.setName("Moscow1");
        System.out.println("Building has another name: " + Moscow.getName());

        Moscow.setOfSmall(48);
        System.out.println(Moscow.getName() + " now has " + Moscow.getOfSmall() + " Box small");

        Moscow.setOfMedium(30);
        System.out.println(Moscow.getName() + " now has " + Moscow.getOfMedium() + " Box medium");

        Moscow.setOfBig(10);
        System.out.println(Moscow.getName() + " now has " + Moscow.getOfBig() + " Box big");
    }


}