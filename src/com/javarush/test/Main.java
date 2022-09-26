package com.javarush.test;

public class Main {
    public static void main(String[] args) {
        // ИС «Издательство».

        Customer first = new Customer("Александр", 89219534561L);

        System.out.println("Имя заказчика : " + first.getName());
        System.out.println("Указаный номер - " + first.getPhone());

        Address_Customer Address_Customer = new Address_Customer("г. Санкт-Петербург", " ул. Набережная мойки, дом:", 21);
        System.out.println("Адрес заказчика : " + Address_Customer.getCity() + Address_Customer.getStreet()  + Address_Customer.getHouse_number());

        Book Book = new Book("Жанр - Ужасы, год издания ", 2001, "Название - Доктор Сон, ", " Автор - Стивен Кинг, количество страниц ", 531);
        System.out.println("Выбранная книга : " + Book.getName() + Book.getGenre() + Book.getYear() + Book.getAuthor() + Book.getpageCount());

        Offices Office = new Offices(" г.Санкт-Петербург, Линия 6, дом 45", "Старый переплет");
        System.out.println("Офис доставки : " + Offices.getOffice() + Offices.getaddres());

        Payment price = new Payment(500);///Стоимость
        System.out.println("Стоимтость заказа : " + Payment.getPayment() );

        Employees Employee = new Employees("Мария", 89314671042L);
        System.out.println("Сотрудник исполняющий доставку : " + Employee.getName());
        System.out.println("Номер для связи - " + Employee.getPhone());

        Authors Author = new Authors("Стивен Кинг, контактный номер - ", 8961356781L);
        System.out.println("Связь с автором : " + Author.getName() + Author.getPhone());

        Authors_Rating Authors = new Authors_Rating(5, 5, 4, 10);
        int Rating = Authors.getReviews() + Authors. getPopularity() + Authors.getPublication() + Authors.getExperience();

        System.out.println("Рейтинг автора :" + Rating);
        boolean Author1 = (Rating <= 35) && (Rating >= 30);
        boolean Author2 = (Rating <= 30) && (Rating >= 25);
        boolean Author3 = (Rating <= 25) && (Rating >= 15);
        boolean Author4 = (Rating <= 15) && (Rating >= 0);
        {
            if (Author1) {
                System.out.println("Первое место");
            } else if (Author2) {
                System.out.println("Второе место");
            }else if (Author3) {
                System.out.println("Третье место");
            }else if (Author4){
                System.out.println("Четвертое место");
            }
        }
        Books_Rating Books = new Books_Rating(5, 5, 5);
        int Ratings = Books.getReviews() + Books. getPopularity() + Books.getNumber_of_copies();

        System.out.println("Рейтинг книги :" + Ratings);
        boolean Books1 = (Ratings <= 15) && (Ratings >= 10);
        boolean Books2 = (Ratings <= 10) && (Ratings >= 5);
        boolean Books3 = (Ratings <= 5) && (Ratings >= 1);
        boolean Books4 = (Ratings <= 1) && (Ratings >= 0);
        {
            if (Books1) {
                System.out.println("Первое место");
            } else if (Books2) {
                System.out.println("Второе место");
            }else if (Books3) {
                System.out.println("Третье место");
            }else if (Books4){
                System.out.println("Четвертое место");
            }
        }
        Printing first_Printing = new Printing(1, 800,"Доктор сон");
        System.out.println("Выпуск: " + first_Printing.getNumber());
        System.out.println("Количество копий : " + first_Printing.getNumber_of_copies());
        System.out.println("Название книги : "  + first_Printing.getBook());

    }
}
