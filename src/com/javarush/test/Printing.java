package com.javarush.test;

public class Printing {
    //Тираж
    private int Number; //Номер
    private int Number_of_copies; //Количество копий
    private String Book;

    public Printing(int Number,  int Number_of_copies, String Book) {
        this.Number = Number;
        this.Book = Book;
        this.Number_of_copies = Number_of_copies;
    }
    public Printing() {
    }
    public int getNumber() {
        return Number;
    }
    public void setNumber(int Number) {
        this.Number = Number;
    }

    public int getNumber_of_copies() {
        return Number_of_copies;
    }
    public void setNumber_of_copies(int Number_of_copies){
        if (Number_of_copies >= 0 && Number_of_copies <= 1000){
            this.Number_of_copies = Number_of_copies;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 1000");
        }
    }

    public String getBook() {
        return Book;
    }
    public void setBook(String Book) {
        this.Book = Book;
    }
}
