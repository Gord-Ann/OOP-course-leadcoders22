package ru.pgups.sumarokova;


public class Place {

    private String nameBuilding;
    private int ofSmall;
    private int ofMedium;
    private int ofBig;

    public Place (String nameBuilding, int ofSmall, int ofMedium, int ofBig){
        this.nameBuilding = nameBuilding;
        this.ofSmall = ofSmall;
        this.ofMedium = ofMedium;
        this.ofBig = ofBig;
    }

    public String getName() {
        return nameBuilding;
    }

    public void setName(String nameBuilding) {
        this.nameBuilding = nameBuilding;
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

