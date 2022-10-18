package lab2;

public class MainCars {

    public static void main(String[] args) {
        System.out.println("АВТОМОБИЛЬ НИССАН!!!");
        Cars Nissan = new Cars("Almera", 10, 150000);
        System.out.println("Модель машины: " + Nissan.getModel());
        System.out.println("Возраст авто: " + Nissan.getAge());
        System.out.println("Пробеш авто: " + Nissan.getProbeg());

        Client First = new Client("Денчик", 89218845345L);

        System.out.println("Имя клиента: " + First.getName());
        System.out.println("Телефон клиента: " + First.getPhone());

        Repair One  = new Repair(1500, 25000, 5200);

        System.out.println("Цена замены масла: " + One.getMaslo());
        System.out.println("Цена ремонта двигателя: " + One.getDvig());
        System.out.println("Цена шпаклёвки кузова: " + One.getShpak());

        Salon Vnutr = new Salon("Алькантара", "Кожа", 5);

        System.out.println("Отделка салона: " + Vnutr.getOtdelka());
        System.out.println("Отделка кресел: " + Vnutr.getKresla());
        System.out.println("Колличество мест: " + Vnutr.getMesta());

        Workers Sostav = new Workers("Никита", "Дима", "Арчи");
        System.out.println("Слесарь: " + Sostav.getSles());
        System.out.println("Монтажник: " + Sostav.getMont());
        System.out.println("Администратор: " + Sostav.getAdmin());


        Payment P = new Payment("Карта");

        System.out.println("Ваш способ оплаты: "+ P.getPayment());
        P.setPayment("Наличные");
        System.out.println("Ваш новый способ оплаты: "+ P.getPayment());

        Status S = new Status("Не оплачено");

        System.out.println("Статус оплаты: "+ S.getStatus());
        S.setStatus("Оплачено");
        System.out.println("Ваш новый статус оплаты: "+ S.getStatus());


    }
}
