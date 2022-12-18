package com.javarush.test;

public class Printing {
    //Тираж
    private Long edition; //Номер
    private int size ; //Количество копий
    private String book;

    public Printing(Long edition,  int size, Book o) {
        this.edition = edition;
        if (size >= 0 && size <= 1000) {
            this.size = size;
        }else{
            System.out.println("Size cannot be less than 0 or more than 1000");
        }
        book = o.getName();
        System.out.println("Напечатано:"+size + " " + "произведений:" + " " + book + " " + "Тираж:" + edition);
        int sz = o.getNumber_of_copies();
        sz = sz+size;
        o.setBookRating(o.getReviews(),o.getPopularity(), sz);
        System.out.println("Текущее количество книги:" + o.getName() + " :"+ sz + "штук");
    }
    public void Print(Long edition,  int size, Book o) {
        this.edition = edition;
        if (size >= 0 && size <= 1000) {
            this.size = size;
        }else{
            System.out.println("Size cannot be less than 0 or more than 1000");
        }
        book = o.getName();
        System.out.println("Напечатано:"+size + " " + "произведений:" + " " + book + " " + "Тираж:" + edition);
        int sz = o.getNumber_of_copies();
        sz = sz+size;
        o.setBookRating(o.getReviews(),o.getPopularity(), sz);
        System.out.println("Текущее количество книг" +"'"+ book+"'"+ " :" + sz);
    }
    public Printing() {
    }
    public Long getEdition() {
        return edition;
    }
    public void setEdition(Long edition) {
        this.edition = edition;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size){
        if (size >= 0 && size <= 1000){
            this.size = size;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 1000");
        }
    }

    public String getBook() {
        return book;
    }
    public void setBook(String Book) {
        this.book = book;
    }
    public void setBook(Book o) {
        this.book = o.getName();
    }

}
