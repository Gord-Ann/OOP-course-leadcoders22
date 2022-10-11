package ru.pgups.nikolaev;

public class Referee {

    private String name;

    private int standing;

    private int rating;

    public Referee (String name, int standing, int  rating ){
        this.name = name;
        this.standing = standing;
        this.rating = rating;
    }
    public String getName() {return this.name;}
    public void setName(String name){
        this.name = name;
    }
    public int getStanding() { return this.standing;}
    public void setStanding(int standing) {
        this.standing = standing;
    }
    public int  getRating() {return this.rating;}
    public void setRating(int rating) {
        this.rating = rating;
    }
}
