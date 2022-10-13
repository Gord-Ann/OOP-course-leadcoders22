package ru.pgups.khalanskaya;

public class Technique {
    private String bus;
    private int escort;
    private int ladder;

    public Technique() {
        this.bus = bus;
        this.escort = escort;
        this.ladder = ladder;
    }
    public String getBus() {return this.bus;}
    public void setBus (String bus) {
        this.bus = bus;
    }
    public int getEscort() {return this.escort;}
    public void setEscort(int escort) {
        this.escort = escort;
    }
    public int getLadder(){return this.ladder;}
    public void setLadder(int ladder) {
        this.ladder = ladder;
    }
}