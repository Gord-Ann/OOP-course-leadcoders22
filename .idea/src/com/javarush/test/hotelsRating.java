package com.javarush.test;

public class hotelsRating {
    private int reviews; //отзывы
    private int popularity;//популярность
    private int price; //Цена
    private int service; //Удобства

    public hotelsRating(int reviews, int popularity, int price, int service){
        this.reviews = reviews;
        this.popularity = popularity;
        this.price = price;
        this.service = service;

    }
    public hotelsRating(){
    }
    public int getReviews() {
        return reviews;
    }
    public void setReviews(int Reviews){
        if (reviews >= 0 && reviews <= 5){
            this.reviews = Reviews;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }
    public int getPopularity() {
        return popularity;
    }
    public void setPopularity(int Popularity){
        if (popularity >= 0 && popularity <= 5){
            this.popularity = popularity;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int Price){
        if (price >= 0 && price <= 5){
            this.price = Price;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getService() {
        return service;
    }
    public void setService(int Service){
        if (Service >= 0 && Service <= 20){
            this.service = service;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 20");
        }

    }

}
