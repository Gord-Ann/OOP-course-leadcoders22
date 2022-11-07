package ru.pgups.makarevich;

public class Cleaning {

    private String Admin;

    private int people;

    private String time;

    public cleaning(String admin, int people, String time){
        this.Admin = admin;
        this.people = people;
        this.time = time;
    }

    public String getAdmin(){ return this.Admin; }

    public void setAdmin(String admin) {
        this.Admin = admin;
    }

    public int getPeople() { return this.people; }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getTime() { return this.time; }

    public void setTime(String time) {
        this.time = time;
    }
}
