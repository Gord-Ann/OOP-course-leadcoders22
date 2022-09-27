package l2;

public class Genre {
    public static void main(String[] args) {
        int booksGenre = 1;
        // 0- интересно
        // 1- дктективы
        // 2- научная литература
        // 3- драмма
        // 4- романтика
        // ...
        if (booksGenre==0) {
            System.out.println ("pick up a book ...");
        } else if (booksGenre==1 ){
            System.out.println ("Nancy Drew's book is being issued");
        } else if (booksGenre==2 ){
            System.out.println ("The book Theory of Everything is issued");
        } else if (booksGenre==3 ){
            System.out.println ("The book Fathers and Children is issued");
        } else if (booksGenre==4 ){
            System.out.println ("The Great Gatsby book is being issued");
        } else {
            System.out.println ("The visitor leaves");
        }
    }
}
