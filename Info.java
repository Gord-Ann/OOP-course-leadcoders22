import java.util.Scanner;
public class Info {
    public void inputInfo(){
        System.out.println("Введите наличие завтрака, Wi-Fi, тип комнаты, рейтинг еды, рейтинг Wi-Fi и рейтинг комнаты...");
        Scanner console = new Scanner(System.in);
        String food = console.nextLine();
        String wifi = console.nextLine();
        String room = console.nextLine();
        int ratingFood = console.nextInt();
        int ratingWifi = console.nextInt();
        int ratingRoom = console.nextInt();

        System.out.println("Food: " + food);
        System.out.println("Wifi: " + wifi);
        System.out.println("Room: " + room);
        System.out.println("Food rating: " + ratingFood);
        System.out.println("Wifi rating: " + ratingWifi);
        System.out.println("Room rating: " + ratingRoom);
    }
}
