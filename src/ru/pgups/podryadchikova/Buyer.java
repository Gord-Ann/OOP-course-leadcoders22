package ru.pgups.podryadchikova;

public class Buyer {
    private String name;
    private String car;
   private boolean buy;

    public Buyer(String name, String car, boolean buy) {
        this.name = name;
        this.car = car;
        this.buy = buy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCar() {
        return car;
    }
    public void setCar(String car) {
        this.car = car;
    }
    public boolean getBuy() {
        return buy;
    }

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

}
