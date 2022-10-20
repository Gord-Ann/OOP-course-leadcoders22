package l2;

public class Style {
    private String  name;
    private String books;
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
