package l2;

public class Books {
    String title;
    int pages;

    public Books() {
        this.title = "Three Comrades";
        this.pages = 480;
    }

    public Books(int pages) {
        this.title = "Crime and punishment";
        this.pages = pages;
    }

    public Books(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
    }

    public static void main(String[] args) {

        Books ThreeComrades = new Books();
        ThreeComrades.showInfo();

        Books CrimeAndPunishment = new Books(470);
        CrimeAndPunishment.showInfo();

        Books primer = new Books("primer", 96);
        primer.showInfo();
    }
}

