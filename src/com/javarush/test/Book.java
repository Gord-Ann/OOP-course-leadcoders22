package com.javarush.test;

public class Book {
    private String name;
    private String genre; //Жанр
    private int year;  //Год
    private String Author;
    int pageCount;//Колво страниц

    public Book(String genre, int year,  String name, String Author, int pageCount) {
        this.genre = genre;
        this.year = year;
        this.name = name;
        this.Author = Author;
        this.pageCount = pageCount;
    }
    public Book () {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
        this.pageCount = pageCount;

    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }

}

