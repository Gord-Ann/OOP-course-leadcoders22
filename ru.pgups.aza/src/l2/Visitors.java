package l2;

public class Visitors {
    String  name;
    String books;
    void  showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Books: " + books);
    }
    public static void main(String[] args) {
        Visitors Visitors = new Visitors();

        Visitors.name = "Misha";
        Visitors.books = "player";

       Visitors.showInfo();
    }
}
