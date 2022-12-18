package com.javarush.test;

public abstract class Product {
    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Error. Price must be greater than zero");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Error. Price must be greater than zero");
        }
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public abstract void showData();

}
