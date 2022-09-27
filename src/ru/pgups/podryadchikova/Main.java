package ru.pgups.podryadchikova;

public class Main {
    public static void main(String[] args) {
        Buyer Slava = new Buyer("Vladimir","audi",true);
        Buyer Pavel = new Buyer("Pavel","bmw",false );

        System.out.println("Owner's name:" + Slava.getName());
        System.out.println("Car's brand:" + Slava.getCar());
        System.out.println("Car's buy:" + Slava.getBuy());

        System.out.println();

        System.out.println("Owner's name:" + Pavel.getName());
        System.out.println("Car's brand:" + Pavel.getCar());
        System.out.println("Car's buy:" + Pavel.getBuy());
    }
}
