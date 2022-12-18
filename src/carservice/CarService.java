package carservice;

import java.util.Scanner;

public class CarService {

    private Scanner sc;
    private int count1;
    private int count2;
    Client client = new Client();
    Car car = new Car();
    Master master = new Master();
    Details details = new Details();
    Check check = new Check();
    Repair repair = new Repair();

    public CarService() {
        sc = new Scanner(System.in);
        count1 = 0;
        count2 = 0;
    }

    public static void main(String[] args) {
        CarService service = new CarService();
        service.doMenu();
    }

    public void doMenu() {
        while (true) {
            System.out.println("\nВыберите действие из меню:\n");
            System.out.println("1. Добавить новое обращение");
            System.out.println("2. Назначить ремонт");
            System.out.println("3. Расчетный документ");
            System.out.println("4. Выйти из программы\n");
            System.out.print("Ваш выбор: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    newAppeal();
                    break;
                case 2:
                    Repair();
                    break;
                case 3:
                    settlementDocument();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("\nЯ вас не понял. Повторите ввод.");
            }
        }
    }

    private void newAppeal() {
        String FIO = "";
        int num = 0;
        String prob = "";
        String model = "";
        String brand = "";
        int year = 0;
        String color = "";
        count1++;

        System.out.print("Введите ФИО клиента: ");
        while (FIO.isEmpty()) {
            FIO = sc.nextLine();
        }

        num = count1;
        System.out.println("Номер клиента: " + num);

        System.out.print("Опишите проблему: ");
        while (prob.isEmpty()) {
            prob = sc.nextLine();
        }
        client.setClient();
        client.setFIO(FIO);
        client.setNum(num);
        client.setProb(prob);

        System.out.print("Введите модель автомобиля: ");
        while (model.isEmpty()) {
            model = sc.nextLine();
        }

        System.out.print("Введите марку автомобиля: ");
        while (brand.isEmpty()) {
            brand = sc.nextLine();
        }

        System.out.print("Введите год выпуска автомобиля: ");
        while (!sc.hasNextInt()) {
            System.out.print("Неверно, повторите: ");
            sc.next();
        }
        year = sc.nextInt();

        System.out.print("Введите цвет автомобиля: ");
        while (color.isEmpty()) {
            color = sc.nextLine();
        }
        car.setModel(model);
        car.setBrand(brand);
        car.setYear(year);
        car.setColor(color);
        car.setCount(count1);
        car.setCar();
    }

    private void Repair() {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int j1 = 1;
        int j2 = 1;
        count2++;
        String cars = "";
        String detail = "";
        String clients = "";
        String sum = "";
        int price = 0;

        for (int i = 0; i < car.getCar().length; i++) {
            if (car.getCar()[i] != null) {
                String s1 = car.getCar()[i];
                s1 = s1.replaceAll("/", ", ");
                System.out.println(i + ". " + s1);
            }
        }
        System.out.print("Выберите номер необходимого автомобиля: ");
        while (!sc.hasNextInt()) {
            System.out.print("Неверно, повторите: ");
            sc.next();
        }
        num1 = sc.nextInt();

        for (int i = 0; i < car.getCar().length; i++) {
            if (num1 == i) {
                cars = car.getCar()[i];
            }
        }

        System.out.println();
        for (int i = 0; i < master.getMaster().length; i++) {
            if (i % 2 == 0) {
                System.out.println(j1 + ". " + master.getMaster()[i]);
                j1++;
            }
        }
        System.out.print("Выберите номер необходимого мастера: ");
        while (!sc.hasNextInt()) {
            System.out.print("Неверно, повторите: ");
            sc.next();
        }
        num2 = sc.nextInt();

        System.out.println();
        for (int i = 0; i < details.getDetails().length; i++) {
            if (i % 2 == 0) {
                System.out.println(j2 + ". " + details.getDetails()[i]);
                j2++;
            }
        }
        System.out.print("Выберите номер необходимой запчасти: ");
        while (!sc.hasNextInt()) {
            System.out.print("Неверно, повторите: ");
            sc.next();
        }
        num3 = sc.nextInt();

        for (int i = 0; i < details.getDetails().length; i++) {
            if (num3 == i) {
                detail = details.getDetails()[i] + "/" + details.getDetails()[i + 1];
                sum = details.getDetails()[i + 1];
            }
        }

        System.out.print("Выберите количество необходимой запчасти: ");
        while (!sc.hasNextInt()) {
            System.out.print("Неверно, повторите: ");
            sc.next();
        }
        num4 = sc.nextInt();
        
        repair.setCars(cars);
        repair.setDetails(detail);
        repair.setCount(count1);
        repair.setNum(num4);
        repair.setRepair();

        for (int i = 0; i < client.getClient().length; i++) {
            if (num1 == i) {
                clients = client.getProb();

            }
        }

        price = Integer.parseInt(sum) * num4;
        check.setPrice(price);
        check.setProb(clients);
        check.setCheck(count1);
    }

    private void settlementDocument() {
        System.out.println("Расчетные документы: ");
        for (int i = 0; i < check.getCheck().length; i++) {
            if (check.getCheck()[i] != null) {
                String res = check.getCheck()[i];
                String str1 = res.substring(0, res.indexOf("/"));
                String str2 = res.substring(res.indexOf("/") + 1, res.length());
                System.out.println("Проблема: " + str1);
                System.out.println("Стоимость: " + str2);
            }
        }
    }
}
