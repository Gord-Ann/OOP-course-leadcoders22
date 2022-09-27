package l2;

public class Suppliers {
    String  name;
    String object;

    void  showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Object: " + object);
    }
    public static void main(String[] args) {
        Suppliers suppliers = new Suppliers();

        suppliers.name = "Sun";
        suppliers.object = "chairs";

        suppliers.showInfo();

        Suppliers suppliers1 = new Suppliers();

        suppliers1.name = "Genius";
        suppliers1.object = "computers";

        suppliers1.showInfo();
    }

}
