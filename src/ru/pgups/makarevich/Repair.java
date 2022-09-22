package ru.pgups.makarevich;

public class Repair {
    private String Admin;

    private int people;

    private String obor;

    public Repair(String Admin, int people, String obor){
        this.Admin = Admin;
        this.people = people;
        this.obor = obor;
    }

    public String getAdmin(){ return this.Admin; }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
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
