package ru.pgups.kyalina;

public class Booking {


    private String bookId;
    private int name;
    private int source;

    public Booking(String bookId, int name, int source ) {
        this.bookId = bookId;
        this.name = name;
        this.source = source;
    }

    public Booking() {

    }

    public String getbookId() {return this.bookId;}
    public void setbookId (String bookId) {
        this.bookId = bookId;
    }
    public int getName() {return this.name;}
    public void setName(int name) {
        this.name = name;
    }
    public int getSource(){return this.source;}
    public void setSource(int source) {
        this.source = source;
    }
}