import java.util.Scanner;

public class Notice {
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    private String description;
    private int price;
    public void inputNotice(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input description: ");
        description = in.nextLine();
        System.out.println("Input price: ");
        price = in.nextInt();
        System.out.printf("Car price: %d and description: %s \n", price, description);
    }


}
