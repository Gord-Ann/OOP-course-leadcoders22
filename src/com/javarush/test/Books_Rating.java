package com.javarush.test;

public class Books_Rating {
    private int Reviews; //отзывы
    private int Popularity;//популярность
    private int Number_of_copies; //Количество копий

    public Books_Rating(int Reviews, int Popularity, int Number_of_copies){
        this.Reviews = Reviews;
        this.Popularity = Popularity;
        this.Number_of_copies = Number_of_copies;

    }

    public Books_Rating(){
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

    public int getNumber_of_copies() {
        return Number_of_copies;
    }
    public void setNumber_of_copies(int Number_of_copies){
        if (Number_of_copies >= 0 && Number_of_copies <= 5){
            this.Number_of_copies = Number_of_copies;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

}

