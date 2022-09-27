package l2;

public class Style {
    String  name;
    String books;
    void  showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Books: " + books);
    }
    public static void main(String[] args) {
        Style Style = new Style();

        Style.name = "dispersed";
        Style.books = "The Dragon Chronicles";

        Style.showInfo();
    }
}
