package com.javarush.test;

public class Book extends Product{

    private String genre; //Жанр
    private int year;  //Год
    private String Author;
    int pageCount;//Колво страниц

    private int Reviews = 0; //отзывы
    private int Popularity = 0;//популярность
    private int Number_of_copies = 0; //Количество копий
    public Book(String name, int price, String genre, int year, String Author, int pageCount){
        super(name,price);
        this.genre = genre;
        if (year >= 1990 && year <= 2022){
            this.year = year;
        }else{
            System.out.println("Year cannot be less than 1990 or more than 2022");
        }
        this.Author = Author;
        if(pageCount>0){
            this.pageCount = pageCount;
        }else{
            System.out.println("Pagecount must be greater than zero");

        }

    }
    public void setBookRating(int Reviews, int Popularity, int Number_of_copies){
        if (Reviews >= 0 && Reviews <= 5){
            this.Reviews = Reviews;
        }else{
            System.out.println("Reviews cannot be less than 0 or more than 5");

        }
        if (Popularity >= 0 && Popularity <= 5){
            this.Popularity = Popularity;
        }else{
            System.out.println("Popularity cannot be less than 0 or more than 5");
        }

    }
    public int getReviews() {
        return Reviews;
    }
    public int getPopularity() {
        return Popularity;
    }
    public int getNumber_of_copies() {
        return Number_of_copies;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if (year >= 1990 && year <= 2022){
            this.year = year;
        }else{
            System.out.println("Year cannot be less than 1990 or more than 2022");
        }

    }
    public int getpageCount() {
        return pageCount;
    }
    public void setpageCount(int pageCount) {
        if(pageCount>0){
            this.pageCount = pageCount;
        }else{
            System.out.println("Pagecount must be greater than zero");

        }

    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
   @Override
    public void showData(){
        System.out.println("Name:"+ getName()+","+" "+"Author:"+ getAuthor()+" "+ "Genre:"+getGenre()+"\n"
        +"Year:"+getYear()+", "+"PageCount:"+getpageCount()+", "+"Price:"+ getPrice()+"\n"+ "Reviews:" + getPopularity()+"\n" + "Popularity:"+ getPopularity()+ "\n" + "NumberOfCopies:"+ getNumber_of_copies() );
   }
}

