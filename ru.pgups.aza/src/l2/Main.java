package l2;

public class Main {
    public static void main( String[] args) {

        Category medical = new Category("medical",21);
        Category childrens = new Category("childrens",34);

        System.out.println("name's name: " + medical.getName());
        System.out.println("quantity's quantity: " + medical.getQuantity());

        System.out.println("");

        System.out.println("name's name: " + childrens.getName());
        System.out.println("quantity's quantity: " + childrens.getQuantity());

    }
}
