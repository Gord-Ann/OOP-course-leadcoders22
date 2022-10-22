package l2;

public class Tenant {
    private String name;
    private String books;
    private boolean rent;

    public Tenant( String name, String books, boolean rent) {
        this.name = name;
        this.books = books;
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBooks() {
        return books;
    }
    public boolean getRent(){
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    }

