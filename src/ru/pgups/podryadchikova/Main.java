package ru.pgups.podryadchikova;

public class Main {
    public static void main(String[] args) {
        Buyer slava = new Buyer("Vladimir","audi",true);
        System.out.println("Owner's name:" + slava.getName());
        System.out.println("Car's brand:" + slava.getCar());
        System.out.println("Car's buy:" + slava.getBuy());
        System.out.println();

        Cabriolet cabriolet = new Cabriolet("porshe", "white", 2022,20000000,324.34,1);
        System.out.println("Brand:"+ cabriolet.getBrand());
        System.out.println("Color:"+ cabriolet.getColor());
        System.out.println("Release:"+ cabriolet.getRelease() + " year");
        System.out.println("Price:"+ cabriolet.getPrice()+ " rub");
        System.out.println("Run:"+ cabriolet.getRun()+ " km");
        System.out.println("Owner:"+ cabriolet.getOwner());
        System.out.println();

        Auto auto1 = new Auto("bmw", "red", "automatic",2020,2000000,234.45, 1);
        System.out.println("Brand:"+ auto1.getBrand());
        System.out.println("Color:"+ auto1.getColor());
        System.out.println("Transmission:"+ auto1.getTrans());
        System.out.println("Release:"+ auto1.getRelease() + " year");
        System.out.println("Price:"+ auto1.getPrice()+ " rub");
        System.out.println("Run:"+ auto1.getRun()+ " km");
        System.out.println("Owner:"+ auto1.getOwner());
        System.out.println();

        Suv suv = new Suv("kia", "white", 2014,200000,1322.11,4);
        System.out.println("Brand:"+ suv.getBrand());
        System.out.println("Color:"+ suv.getColor());
        System.out.println("Release:"+ suv.getRelease() + " year");
        System.out.println("Price:"+ suv.getPrice()+ " rub");
        System.out.println("Run:"+ suv.getRun()+ " km");
        System.out.println("Owner:"+ suv.getOwner());
        System.out.println();

        Automatic autom = new Automatic("skoda", "sedan", 2018, 645.24);
        System.out.println("Brand:"+ autom.getBrand());
        System.out.println("Body:"+ autom.getBody());
        System.out.println("Release:"+ autom.getRelease() + " year");
        System.out.println("Run:"+ autom.getRun()+ " km");
        System.out.println();

        Mechanics mechan = new Mechanics("ford", "uneversal", 2015, 345.24);
        System.out.println("Brand:"+ mechan.getBrand());
        System.out.println("Body:"+ mechan.getBody());
        System.out.println("Release:"+ mechan.getRelease() + " year");
        System.out.println("Run:"+ mechan.getRun()+ " km");
        System.out.println();

        Coupe coupe = new Coupe("mazda", "purple", 2012,200000,7234.34,5);
        System.out.println("Brand:"+ coupe.getBrand());
        System.out.println("Color:"+ coupe.getColor());
        System.out.println("Release:"+ coupe.getRelease() + " year");
        System.out.println("Price:"+ coupe.getPrice()+ " rub");
        System.out.println("Run:"+ coupe.getRun()+ " km");
        System.out.println("Owner:"+ coupe.getOwner());
        System.out.println();

        Pickup pickup = new Pickup("volvo", "black", 2021,3000000,7234.34,1);
        System.out.println("Brand:"+ pickup.getBrand());
        System.out.println("Color:"+ pickup.getColor());
        System.out.println("Release:"+ pickup.getRelease() + " year");
        System.out.println("Price:"+ pickup.getPrice()+ " rub");
        System.out.println("Run:"+ pickup.getRun()+ " km");
        System.out.println("Owner:"+ pickup.getOwner());
        System.out.println();

        Sedan sedan = new Sedan("nonda", "grey", 2017,250000,70234.34,2);
        System.out.println("Brand:"+ sedan.getBrand());
        System.out.println("Color:"+ sedan.getColor());
        System.out.println("Release:"+ sedan.getRelease() + " year");
        System.out.println("Price:"+ sedan.getPrice()+ " rub");
        System.out.println("Run:"+ sedan.getRun()+ " km");
        System.out.println("Owner:"+ sedan.getOwner());
        System.out.println();

        Universal universal = new Universal("kia", "red", 2018,500000,30234.34,1);
        System.out.println("Brand:"+ universal.getBrand());
        System.out.println("Color:"+ universal.getColor());
        System.out.println("Release:"+ universal.getRelease() + " year");
        System.out.println("Price:"+ universal.getPrice()+ " rub");
        System.out.println("Run:"+ universal.getRun()+ " km");
        System.out.println("Owner:"+ universal.getOwner());
        System.out.println();


    }

}
