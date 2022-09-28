package ru.pgups.sumarokova;

public class Client {

    private String name;
    private int number;
    private int price;

    public Client(String name, int number, int price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

    class MainClient{
        public static void main(String[] args) {
            Client Kolya = new Client("Kolay", 1, 4300);
            System.out.println("Name: " + Kolya.getName());
            System.out.println("Сontract number: " + Kolya.getNumber());
            System.out.println("Price: " + Kolya.getPrice());

            System.out.println(" ");

            Client Anna = new Client("Anna", 2, 13900);
            System.out.println("Name: " + Anna.getName());
            System.out.println("Сontract number: " + Anna.getNumber());
            System.out.println("Price: " + Anna.getPrice());

            System.out.println(" ");

            Client Min = new Client("Min", 3, 15770);
            System.out.println("Name: " + Min.getName());
            System.out.println("Сontract number: " + Min.getNumber());
            System.out.println("Price: " + Min.getPrice());



        }


    }


