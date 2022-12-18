package com.javarush.test;

public class Author extends Person {
    private int Reviews; //отзывы
    private int Popularity;//популярность
    private int Publication; //Издаваемость
    private int Experience; //Стаж

    public Author(String name, String phone, int Reviews, int Popularity, int Publication, int Experience) {
        super(name,phone);
        if (Reviews >= 0 && Reviews <= 5){
            this.Reviews = Reviews;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }
        if (Popularity >= 0 && Popularity <= 5){
            this.Popularity = Popularity;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }
        if (Publication >= 0 && Publication <= 5){
            this.Publication = Publication;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }
        if (Experience >= 0 && Experience <= 20){
            this.Experience = Experience;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 20");
        }
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

    public int getPublication() {
        return Publication;
    }
    public void setPublication(int Publication){
        if (Publication >= 0 && Publication <= 5){
            this.Publication = Publication;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getExperience() {
        return Experience;
    }
    public void setExperience(int Experience){
        if (Experience >= 0 && Experience <= 20){
            this.Experience = Experience;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 20");
        }

    }
    @Override
    public  void showData(){
        System.out.println("Name:"+getName() +","+" "+"Phone:"+ getPhone()+ "\n" + "Reviews:" + getReviews() + ","+" "+"Popularity:" + getPopularity()
                + ","+" "+"Publication:" + getPublication()+","+" "+ "Experience:"+ getExperience());
    }
}
