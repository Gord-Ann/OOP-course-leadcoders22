package ru.pgups.sumarokova;

public class Product {
    private String name;
    private int weight;
    private int price;

    protected Product(String name, int weight, int price){
        this.name=name;
        this.weight=weight;
        this.price=price;
    }
    public int getPrice() {return price;}

    public String getName() {
        return name;
    }

    public int getWeight() {
         return weight;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Product() {    }
}
