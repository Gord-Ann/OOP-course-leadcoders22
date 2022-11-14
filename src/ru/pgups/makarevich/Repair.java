package ru.pgups.makarevich;

public class Repair {
    private String admin;

    private int people;

    private String obor;

    public repair(String admin, int people, String obor){
        this.admin = admin;
        this.people = people;
        this.obor = obor;
    }

    public String getadmin(){ return this.admin; }

    public void setadmin(String admin) {
        this.admin = admin;
    }

    public int getPeople() { return this.people; }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getObor() { return this.obor; }

    public void setObor(String obor) {
        this.obor = obor;
    }
}
