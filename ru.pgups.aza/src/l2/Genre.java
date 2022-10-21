package l2;

public class Genre {
    private String name;
    private int number;
    private String language;

    public Genre(String name,int number, String language){
        this.name=name;
        this.number=number;
        this.language= language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}