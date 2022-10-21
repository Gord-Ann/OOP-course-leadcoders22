package l2;

public class Style {
    private String name;
    private String book;
    private int availability;

    public Style (String name, String book, int availability){
        this.name=name;
        this.book=book;
        this.availability=availability;
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

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
}