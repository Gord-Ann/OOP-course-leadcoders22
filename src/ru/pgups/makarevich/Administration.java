package ru.pgups.makarevich;

public class Administration {

    private String Admin;

    private int people;

    private int high;

    public Administration(String Admin, int people, int high){
        this.Admin = Admin;
        this.people = people;
        this.high = high;
    }

    public String getAdmin(){ return this.Admin; }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
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
