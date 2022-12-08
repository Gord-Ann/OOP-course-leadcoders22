package com.javarush.test;

public class main {
    public static void main(String[] args) {
        // ИС «Гостиница».

        Guest first = new Guest("Элвира Иванова Ивановна ", 89143360118L);

        System.out.println("Имя постояльца : " + first.getName());
        System.out.println("Указаный номер - " + first.getPhone());

        Address_Guest Address_Guest = new Address_Guest("г. Санкт-Петербург", " ул. Бабушкина, дом:", 21);
        System.out.println("Адрес : " + Address_Guest.getCity() + Address_Guest.getStreet() + Address_Guest.getHouse_number());

        Room Room = new Room("Наличие вайфая - Есть, дата ", 2022, "Название - Всё включено, ", " Отель - , три звезды ", 2);
        System.out.println("Выбранная комната : " + Room.getName() + Room.getWifi() + Room.getTheDate() + Room.getroomName() + Room.getTheDate());

        Rooms Office = new Rooms(" г.Санкт-Петербург, Линия 6, дом 45", "Ария");
        System.out.println("номер : " + Rooms.getOffice() + Rooms.getaddres());

        Payment price = new Payment(500);///Стоимость
        System.out.println("Стоимтость заказа : " + Payment.getPayment());

        Employees Employee = new Employees("Мария", 89314671042L);
        System.out.println("Сотрудник : " + Employee.getName());
        System.out.println("Номер для связи - " + Employee.getPhone());

        Hotels Hotel = new Hotels("Граф, контактный номер - ", 8961356781L);
        System.out.println("Москва");
        Hotels_Rating Hotels = new Hotels_Rating(5, 5, 4, 10);
        int Rating = Hotels.getReviews() + Hotels.getPopularity() + Hotels.getPrice() + Hotels.getService();

        System.out.println("Рейтинг гостиницы :" + Rating);
        boolean Hotel1 = (Rating <= 35) && (Rating >= 30);
        boolean Hotel2 = (Rating <= 30) && (Rating >= 25);
        boolean Hotel3 = (Rating <= 25) && (Rating >= 15);
        boolean Hotel4 = (Rating <= 15) && (Rating >= 0);
        {
            if (Hotel1) {
                System.out.println("Первое место");
            } else if (Hotel2) {
                System.out.println("Второе место");
            } else if (Hotel3) {
                System.out.println("Третье место");
            } else if (Hotel4) {
                System.out.println("Четвертое место");
            }
        }
        Room_Rating Rooms = new Room_Rating(5, 5, 5);
        int Ratings = Rooms.getReviews() + Rooms.getPopularity() + Rooms.getNumber_of_copies();
        {
            System.out.println("Рейтинг книги :" + Ratings);
            boolean Rooms1 = (Ratings <= 15) && (Ratings >= 10);
            boolean Rooms2 = (Ratings <= 10) && (Ratings >= 5);
            boolean Rooms3 = (Ratings <= 5) && (Ratings >= 1);
            boolean Rooms4 = (Ratings <= 1) && (Ratings >= 0);
            {
                if (Rooms1) {
                    System.out.println("Первое место");
                } else if (Rooms2) {
                    System.out.println("Второе место");
                } else if (Rooms3) {
                    System.out.println("Третье место");
                } else if (Rooms4) {
                    System.out.println("Четвертое место");
                }
            }
            Printing first_Printing = new Printing(1, 800, "Ария");
            System.out.println("Выпуск: " + first_Printing.getNumber());
            System.out.println("Номер комнаты : " + first_Printing.getNumber_of_rooms());
            System.out.println("Комната : " + first_Printing.getRoom());

        }
    }
}


