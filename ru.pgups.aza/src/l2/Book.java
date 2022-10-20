package l2;

public class Book {
    private String title;
   private int pages;

    public Book() {
        this.title = "Three Comrades";
        this.pages = 480;
    }

    public Book(int pages) {
        this.title = "Crime and punishment";
        this.pages = pages;
    }

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
    }

    public static void main(String[] args) {

        Book threeComrades = new Book();
        threeComrades.showInfo();

        Book crimeandPunishment = new Book(470);
        crimeandPunishment.showInfo();

        Book primer = new Book("primer", 96);
        primer.showInfo();
    }
}

