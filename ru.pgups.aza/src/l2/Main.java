package l2;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("remark", "threeComrades", 480);
        System.out.println("author:" + book.getAuthor());
        System.out.println("title:" + book.getTitle());
        System.out.println("page:" + book.getPage());
        System.out.println();

        Category category = new Category("medical", 21);
        System.out.println("name: " + category.getName());
        System.out.println("quantity: " + category.getQuantity());
        System.out.println();

        Genre genre = new Genre("drama", 15, "russian");
        System.out.println("name:" + genre.getName());
        System.out.println("number:" + genre.getNumber());
        System.out.println("language:" + genre.getLanguage());
        System.out.println();

        Staff staff = new Staff("Mira", 23, "woman");
        System.out.println("name:" + staff.getName());
        System.out.println("age:" + staff.getAge());
        System.out.println("gender:" + staff.getGender());
        System.out.println();

        Style style = new Style("realism", "idiot", 5);
        System.out.println("name:" + style.getName());
        System.out.println("book:" + style.getBook());
        System.out.println("availability:" + style.getAvailability());
        System.out.println();

        Supplier supplier= new Supplier("AMD","computer","manufacturer");
        System.out.println("name:" + supplier.getName());
        System.out.println("object:" +supplier.getObject() );
        System.out.println("availabilitytype:" + supplier.getType());
        System.out.println();

        Tenant tenant = new Tenant("Eva", "theatre", false);
        System.out.println(" name:" + tenant.getName());
        System.out.println("name:" + tenant.getBooks());
        System.out.println("rent:" + tenant.getRent());
        System.out.println();

        Visitor visitor=new Visitor("Angelina","player",1);
        System.out.println("name:" + visitor.getName());
        System.out.println("book:" + visitor.getBook());
        System.out.println("number:" + visitor.getNumber());
        System.out.println();
    }
}
