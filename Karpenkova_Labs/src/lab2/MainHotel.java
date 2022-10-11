package lab2;

public class MainHotel {
    public static void main(String[] args) {

        Client сheloveck = new Client("Ленидский","Анатолий" , "Борисович" ,  35 ,  "Муж");
        System.out.println("Фамилия : " + сheloveck.getSurname());
        System.out.println("Имя : " + сheloveck.getName());
        System.out.println("Отчество : " + сheloveck.getPatronymic());
        System.out.println("Возраст : " + сheloveck.getAge());
        System.out.println("Пол : " + сheloveck.getGender());

        Сommunication svyaz = new Сommunication( "tolyanLenidskiy@mail.ru", 5438474);
        System.out.println("Email : " + svyaz.getEmail());
        System.out.println("Номер телефона : " + svyaz.getPhoneNumber());

        HotelRoom room = new HotelRoom( "одноместный");
        System.out.println("Вместимость номера : " + room.getRoomCapacity());

        Category nomera = new Category( "стандартный");
        System.out.println("Категория номера : " + nomera.getRoomClass());


        Food stoimost = new Food( "включена");
        System.out.println("Еда включена в стоимость : " + stoimost.getIncludedInThePrice());

        AdditionalServices usluga = new AdditionalServices( "поздний выезд без доплаты",  1500);
        System.out.println("Привилегии : " + usluga.getPrivileges());
        System.out.println("Бонусов начислено + : " + usluga.getBonusPoints());

        Payment oplata = new Payment( "Наличными",  50200);
        System.out.println("Тип оплаты : " + oplata.getTypeOfPayment());
        System.out.println("Цена : " + oplata.getCost());


    }

}


