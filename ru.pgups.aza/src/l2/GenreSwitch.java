package l2;

public class GenreSwitch {
    public static void main(String[] args){
        int booksGenre = 0;
        // 0- интересно
        // 1- дктективы
        // 2- научная литература
        // 3- драмма
        // 4- романтика
        // ...
        switch (booksGenre){
            case 0:
                System.out.println ("pick up a book ...");
                break;
            case 1:
                System.out.println ("Nancy Drew's book is being issued");
                break;
            case 2:
                System.out.println ("The book Theory of Everything is issued");
                break;
            case 3:
                System.out.println ("The book Fathers and Children is issued");
                break;
            case 4:
                System.out.println ("The Great Gatsby book is being issued");
                break;
            default:
                System.out.println ("The visitor leaves");
                break;
        }
    }

}
