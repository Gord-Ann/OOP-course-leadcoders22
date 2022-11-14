package ru.pgups.makarevich;

public class Advertisement {
    private String admin;

    private int people;

    private String vid;

    public advertisement(String admin, int people, String vid){
        this.admin = admin;
        this.people = people;
        this.vid = vid;
    }

    public String getAdmin(){ return this.admin; }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public int getPeople() { return this.people; }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getVid() { return this.vid; }

    public void setVid(String vid) {
        this.vid = vid;
    }
}
