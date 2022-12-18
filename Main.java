package com.javarush.test;

import java.util.Scanner;

public class Main {
    private static Scanner sc;
    private Employee employee = null;
    private Customer customer = null;



    public static void main(String[] args) {
        // ИС «Издательство»
        Main Library = new Main();
        sc = new Scanner(System.in);
        Employee mark  = new Employee("Марк", "89129875432");
        Customer jack = new Customer("Джек", "89124563276", "Москва", "Радищева 2", 3);
        Author author1 = new Author("Иван Лялоу", "89129875441", 5,3,5,20);
        Book book1 = new Book("Песнь льда и пламени",2000,"Роман",1996, "Ричард Мартин",2000);
        Book book2 = new Book("12 стульев", 1000, "Роман",1927, "Илья Арнольдович Ильф и Евгений Петрович Петров", 400 );
        Book book3 = new Book("Дубровский",800,"Роман", 1841, "Александр Сергеевич Пушкин", 600);
        Book book = new Book("12 времен года", 2000, "Хоррор", 2020, "Иван Лялоу", 800);
        Offices office = new Offices("ул.Пушкина 22", "Главный офис");
        Order order = new Order();
        order.Ordering(5000,10012,3, jack, mark, book, office);
        Printing printing = new Printing(123212L,200, book1);
        Library.doMenu();


    }

        public void doMenu () {
            while (true) {
                System.out.println("\nВыберите действие из меню:\n");
                System.out.println("1. Создать работника");
                System.out.println("2. Показатть данные работника");
                System.out.println("3. Создать клиента");
                System.out.println("4. Показать данные клиента");
                System.out.println("5. Выйти из программы\n");
                System.out.print("Ваш выбор: ");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        createEmp();
                        break;
                    case 2:
                        if (employee != null) {
                            employee.showData();
                        } else {
                            System.out.println("Работник не создан!");
                        }
                        break;
                    case 3:
                        createCustomer();
                        break;
                    case 4:
                        if (customer != null) {
                            customer.showData();
                        } else {
                            System.out.println("Клиент не создан!");
                        }
                    case 5:
                        return;


                    default:
                        System.out.println("\nЯ вас не понял. Повторите ввод.");


                }
            }
        }




        public void createEmp(){
        String name = "";
        String phone = "";
        System.out.println("Введите имя");
        while(name.isEmpty()){
            name = sc.nextLine();
        }
        System.out.println("Введите номер телефона");
        while(phone.isEmpty()){
                phone = sc.nextLine();
            }
        employee = new Employee(name, phone);
        }
    public void createCustomer(){
        String name = "";
        String phone = "";
        String city = "";
        String street = "";
        int house_number = 0;
        System.out.println("Введите имя");
        while(name.isEmpty()){
            name = sc.nextLine();
        }
        System.out.println("Введите номер телефона");
        while(phone.isEmpty()){
            phone = sc.nextLine();
        }
        System.out.println("Введите город");
        while(city.isEmpty()){
            city = sc.nextLine();
        }
        System.out.println("Введите улицу");
        while(street.isEmpty()){
            street = sc.nextLine();
        }
        System.out.println("Введите номер дома");
        while(house_number == 0){
            house_number = sc.nextInt();
        }
        customer = new Customer(name, phone, city, street, house_number);
    }
    }
