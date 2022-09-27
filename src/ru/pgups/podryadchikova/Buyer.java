package ru.pgups.podryadchikova;

public class Buyer {
    String name;
    String car;
    boolean buy;

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
    public boolean getBuy() {
        return buy;
    }

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

    static class MainBuyer {
        public static void main(String[] args) {
            Buyer buyer = new Buyer("Victor","bmw", false);
            System.out.println("Owner's name:" + buyer.getName());
            System.out.println("Car's brand:" + buyer.getCar());
            System.out.println("Car's buy:" + buyer.getBuy());

            buyer.setName("audi");
            System.out.println("Car terns:" + buyer.getName());

            buyer.setBuy(true);
            System.out.println("Buy another car:" + buyer.getBuy());

        }
    }
}
