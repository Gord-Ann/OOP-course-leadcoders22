package l2;

public class Visitor {
    private String  name;
    private String book;
    void  showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Book: " + book);
    }
    public static void main(String[] args) {
        Visitor Visitor = new Visitor();

        Visitor.name = "Misha";
        Visitor.book = "player";

       Visitor.showInfo();
    }
}
