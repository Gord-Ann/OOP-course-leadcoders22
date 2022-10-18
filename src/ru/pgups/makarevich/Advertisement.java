package ru.pgups.makarevich;

public class advertisement {
    private String Admin;

    private int people;

    private String vid;

    public advertisement(String Admin, int people, String vid){
        this.Admin = Admin;
        this.people = people;
        this.vid = vid;
    }

    public String getAdmin(){ return this.Admin; }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
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
