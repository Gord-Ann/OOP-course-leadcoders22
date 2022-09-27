package l2;

public class Tenant {
    String name;
    String books;
    boolean rent;

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
    static class MainTenant{
        public static void main(String[] args){
            Tenant tenant = new Tenant("Eva","theatre",false);
            System.out.println("Owner's name"+ tenant.getName());
            System.out.println("Book's name"+ tenant.getBooks());
            System.out.println("Book's rent"+ tenant.getName());

            tenant.setName("suitcase");
            System.out.println("Books terns:"+ tenant.getName());

            tenant.setRent(true);
            System.out.println("Rent another books:"+ tenant.getRent());

        }
    }
}
