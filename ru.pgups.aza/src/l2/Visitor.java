package l2;
public class Visitor{
private String name;
private String book;
private int number;

public Visitor( String name, String book, int number){
        this.name=name;
        this.book=book;
        this.number=number;
 }

public String getName() {
        return name;
}

public void setName(String name) {
        this.name = name;
 }

public String getBook() {
        return book;
 }

public void setBook(String book) {
        this.book = book;
 }

public int getNumber() {
        return number;
  }
 }