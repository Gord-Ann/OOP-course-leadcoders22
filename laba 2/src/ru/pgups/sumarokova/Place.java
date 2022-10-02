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
        Place moscow = new Place("Moscow", 50, 40,30);
        System.out.println("Building name: " + moscow.getName());
        System.out.println("Building has " + moscow.getOfSmall() + " Box small");
        System.out.println("Building has " + moscow.getOfMedium() + " Box medium");
        System.out.println("Building has " + moscow.getOfBig() + " Box big");

        moscow.setName("Moscow1");
        System.out.println("Building has another name: " + moscow.getName());

        moscow.setOfSmall(48);
        System.out.println(moscow.getName() + " now has " + moscow.getOfSmall() + " Box small");

        moscow.setOfMedium(30);
        System.out.println(moscow.getName() + " now has " + moscow.getOfMedium() + " Box medium");

        moscow.setOfBig(10);
        System.out.println(moscow.getName() + " now has " + moscow.getOfBig() + " Box big");
    }


}