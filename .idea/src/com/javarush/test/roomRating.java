package com.javarush.test;

public class roomRating {
    private int reviews; //отзывы
    private int popularity;//популярность
    private int numberOfRooms; //Количество комнат
    private int getNumberOfRoomsRooms;

    public roomRating(int reviews, int popularity, int NumberOfRooms){
        this.reviews = reviews;
        this.popularity = popularity;
        this.numberOfRooms = numberOfRooms;

    }

    public roomRating(){
    }

    public int getReviews() {
        return reviews;
    }
    public void setReviews(int reviews){
        if (reviews >= 0 && reviews <= 5){
            this.reviews = reviews;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }
    public int getPopularity() {
        return popularity;
    }
    public void setPopularity(int popularity){
        if (popularity >= 0 && popularity <= 5){
            this.popularity = popularity;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getNumberOfcopies() {
        return numberOfRooms;
    }
    public void setNumber_of_rooms(int Number_of_rooms){
        if (Number_of_rooms >= 0 && numberOfRooms <= 3){
            this.numberOfRooms = numberOfRooms;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 3");
        }

    }

}

