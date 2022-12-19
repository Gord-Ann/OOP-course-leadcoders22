import java.util.Scanner;
class Client extends Person{
    public void inputClient() {
        System.out.println("Введите фио, день, месяц и год рождения");
        Scanner console = new Scanner(System.in);
        String surname = console.nextLine();
        String name = console.nextLine();
        int birthDay = console.nextInt();
        int birthMonth = console.nextInt();
        int birthYear = console.nextInt();

        System.out.println("Surname - " + surname);
        System.out.println("Name - " + name);
        System.out.println("Birth day - " + birthDay);
        System.out.println("Birth month - " + birthMonth);
        System.out.println("Birth year - " + birthYear);
    }
}
