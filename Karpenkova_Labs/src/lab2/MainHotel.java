package lab2;

public class MainHotel {
    public static void main(String[] args) {

        Client Cheloveck = new Client("Ленидский","Анатолий" , "Борисович" ,  35 ,  "Муж");
        System.out.println("Фамилия : " + Cheloveck.getSurname());
        System.out.println("Имя : " + Cheloveck.getName());
        System.out.println("Отчество : " + Cheloveck.getPatronymic());
        System.out.println("Возраст : " + Cheloveck.getAge());
        System.out.println("Пол : " + Cheloveck.getGender());

        Сommunication Svyaz = new Сommunication( "tolyanLenidskiy@mail.ru", 5438474);
        System.out.println("Email : " + Svyaz.getEmail());
        System.out.println("Номер телефона : " + Svyaz.getPhoneNumber());

        HotelRoom Room = new HotelRoom( "одноместный");
        System.out.println("Вместимость номера : " + Room.getRoomCapacity());

        Category Nomera = new Category( "стандартный");
        System.out.println("Категория номера : " + Nomera.getRoomClass());


        Food Stoimost = new Food( "включена");
        System.out.println("Еда включена в стоимость : " + Stoimost.getIncludedInThePrice());

        AdditionalServices Usluga = new AdditionalServices( "поздний выезд без доплаты",  1500);
        System.out.println("Привилегии : " + Usluga.getPrivileges());
        System.out.println("Бонусов начислено + : " + Usluga.getBonusPoints());

        Payment Oplata = new Payment( "Наличными",  50200);
        System.out.println("Тип оплаты : " + Oplata.getTypeOfPayment());
        System.out.println("Цена : " + Oplata.getCost());


    }

}


