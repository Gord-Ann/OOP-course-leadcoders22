package ru.pgups.kyalina;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Driver driver1= new Driver("Nastya", "Kyalina", "Nevsky prospekt 5", "15");
        System.out.println(driver1.firstName);
        System.out.println(driver1.lastName);
        System.out.println(driver1.address);
        System.out.println();

        Customer customer1 = new Customer("Helena", "Kyalina", "Nevsky prospekt 20", "153578");
        System.out.println(customer1.firstName);
        System.out.println(customer1.lastName);
        System.out.println(customer1.address);
        System.out.println();

        Dispatcher dispatcher1 = new Dispatcher("Ivan", "Sokolov", "Mira prospekt", "Yes");
        System.out.println(dispatcher1.firstName);
        System.out.println(dispatcher1.lastName);
        System.out.println(dispatcher1.address);
        System.out.println();

        Person person1 = new Person("Oleg", "Ivanov", "Nevsky prospekt 123");
        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.address);
        System.out.println();

        Kia kia1 = new Kia("Rio", "A123RS", "2016","Cummins");
        System.out.println(kia1.model);
        System.out.println(kia1.number);
        System.out.println(kia1.year);
        System.out.println();

        BMWCar bmwCar1 = new BMWCar("X6", "A123RS", "2019","Germany");
        System.out.println(bmwCar1.model);
        System.out.println(bmwCar1.number);
        System.out.println(bmwCar1.year);
        System.out.println();

        Database database1 = new Database("command line", "code", "source code","table with fields");
        System.out.println(database1.interfase);
        System.out.println(database1.assemblers);
        System.out.println(database1.compilers);
        System.out.println();


        }
    }

