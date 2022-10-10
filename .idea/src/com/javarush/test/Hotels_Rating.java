package com.javarush.test;

public class Hotels_Rating {
    private int Reviews; //отзывы
    private int Popularity;//популярность
    private int Price; //Цена
    private int Service; //Удобства

    public Hotels_Rating(int Reviews, int Popularity, int Price, int Service){
        this.Reviews = Reviews;
        this.Popularity = Popularity;
        this.Price = Price;
        this.Service = Service;

    }
    public Hotels_Rating(){
    }
    public int getReviews() {
        return Reviews;
    }
    public void setReviews(int Reviews){
        if (Reviews >= 0 && Reviews <= 5){
            this.Reviews = Reviews;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }
    public int getPopularity() {
        return Popularity;
    }
    public void setPopularity(int Popularity){
        if (Popularity >= 0 && Popularity <= 5){
            this.Popularity = Popularity;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getPrice() {
        return Price;
    }
    public void setPrice(int Price){
        if (Price >= 0 && Price <= 5){
            this.Price = Price;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getService() {
        return Service;
    }
    public void setService(int Service){
        if (Service >= 0 && Service <= 20){
            this.Service = Service;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 20");
        }

    }

}