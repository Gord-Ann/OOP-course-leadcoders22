package l2;

public class Book {
    private String author;
    private String title;
    private int page;

    public Book (String author,String title,int page) {
        this.author=author;
        this.title=title;
        this.page=page;
    }

    public String getAuthor() {
        return author;
    }
    public void  setAuthor(){
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

}