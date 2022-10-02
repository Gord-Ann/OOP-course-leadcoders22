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
            Client kolya = new Client("Kolay", 1, 4300);
            System.out.println("Name: " + kolya.getName());
            System.out.println("Сontract number: " + kolya.getNumber());
            System.out.println("Price: " + kolya.getPrice());

            System.out.println(" ");

            Client anna = new Client("Anna", 2, 13900);
            System.out.println("Name: " + anna.getName());
            System.out.println("Сontract number: " + anna.getNumber());
            System.out.println("Price: " + anna.getPrice());

            System.out.println(" ");

            Client min = new Client("Min", 3, 15770);
            System.out.println("Name: " + min.getName());
            System.out.println("Сontract number: " + min.getNumber());
            System.out.println("Price: " + min.getPrice());



        }


    }


