package ru.pgups.makarevich;

public class Security {
    private String Admin;

    private int people;

    private int look;

    public Security(String Admin, int people, int look){
        this.Admin = Admin;
        this.people = people;
        this.look = look;
    }

    public String getAdmin(){ return this.Admin; }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }

    public int getPeople() { return this.people; }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getLook() { return this.look; }

    public void setLook(int look) {
        this.look = look;
    }
}

