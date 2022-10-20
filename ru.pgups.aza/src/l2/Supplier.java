package l2;

public class Supplier {
    private String  name;
    private String object;

    void  showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Object: " + object);
    }
    public static void main(String[] args) {
        Supplier supplier = new Supplier();

        supplier.name = "Sun";
        supplier.object = "chairs";

        supplier.showInfo();

        Supplier supplier1 = new Supplier();

        supplier1.name = "Genius";
        supplier1.object = "computers";

        supplier1.showInfo();
    }

}
