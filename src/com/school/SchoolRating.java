package com.school;

public class SchoolRating {
    private int rating;

    public SchoolRating(){}


    public SchoolRating(int rating){
        this.rating= rating;
    }
    public int getNumber() {
        return rating;
    }
    public void setNumber(int rating) {
        if (rating < 1) {
            System.out.println("Рейтинг не может быть меньше 1");
            return;
        } else if (rating > 10) {
            System.out.println("Рейтинг не может быть больше 10");
            return;
        }

        this.rating = rating;
    }
    public void getInfo(){
        System.out.println("rating of School: " + this.rating);
    }
}


