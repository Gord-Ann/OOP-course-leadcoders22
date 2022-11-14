package ru.pgups.makarevich;

public class Administration {

    private String admin;

    private int people;

    private int high;

    public administration(String admin, int people, int high){
        this.admin = admin;
        this.people = people;
        this.high = high;
    }

    public String getAdmin(){ return this.admin; }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public int getPeople() { return this.people; }

    public void setpeople(int people) {
        this.people = people;
    }

    public int getHigh() { return this.high; }

    public void setHigh(int high) {
        this.high = high;
    }
}
