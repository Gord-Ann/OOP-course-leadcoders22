package ru.pgups.efimova;

public class Teacher {
    private String name;
    private int standing;
    private String subject;

    public Teacher(String name, int standing, String subject){
        this.name = name;
        this.standing = standing;
        this.subject = subject;
    }
    public String getName(){return this.name;}
    public void setName(String name){
        this.name = name;
    }
    public int getStanding(){return this.standing;}
    public void setStanding(int standing){
        this.standing = standing;
}
    public String getSubject(){return this.subject;}
    public void setSubject(String subject){
        this.subject = subject;
}
}