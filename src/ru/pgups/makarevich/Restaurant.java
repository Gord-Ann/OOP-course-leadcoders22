package ru.pgups.makarevich;

public class Restaurant {

    private String timeEat;

    private int stol;

    private int cash;

    public restaurant(String timeEat, int stol, int cash){
        this.timeEat = timeEat;
        this.stol = stol;
        this.cash = cash;
    }

    public String getTimeEat() {return this.timeEat;}

    public void setTimeEat(String timeEat) {
        this.timeEat = timeEat;
    }

    public int getStol() {return this.stol;}

    public void setStol(int stol) {
        this.stol = stol;
    }

    public int getCash() {
        return this.cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}

