package ru.pgups.makarevich;

public class Security {
    private String admin;

    private int people;

    private int look;

    public security(String admin, int people, int look){
        this.admin = admin;
        this.people = people;
        this.look = look;
    }

    public String getadmin(){ return this.admin; }

    public void setadmin(String admin) {
        this.admin = admin;
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

