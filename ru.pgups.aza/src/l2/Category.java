package l2;

public class Category {
    private String name;
    private int quantity;

    public Category(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


class MainCategory {
    public static void main(String[] args) {
       Category art = new Category("Art", 78);
        System.out.println("name's name: " + art.getName());
        System.out.println("quantity's quantity: " + art.getQuantity());

      art.setQuantity(73);
        System.out.println("Art turns: " + art.getQuantity());

       art.setName("artistic");
        System.out.println("Art has another name: " + art.getName());
    }
}

