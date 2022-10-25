package lab2;

public class MainCars {

    public static void main(String[] args) {
        System.out.println("АВТОМОБИЛЬ НИССАН!!!");

        Cars nissan = new Cars("Almera", 10, 150000);
        System.out.println("Модель машины: " + nissan.getModel());
        System.out.println("Возраст авто: " + nissan.getAge());
        System.out.println("Пробеш авто: " + nissan.getProbeg());

        Client first = new Client("Денчик", 89218845345L);

        System.out.println("Имя клиента: " + first.getName());
        System.out.println("Телефон клиента: " + first.getPhone());

        Repair one  = new Repair(1500, 25000, 5200);

        System.out.println("Цена замены масла: " + one.getMaslo());
        System.out.println("Цена ремонта двигателя: " + one.getDvig());
        System.out.println("Цена шпаклёвки кузова: " + one.getShpak());

        Salon vnutr = new Salon("Алькантара", "Кожа", 5);

        System.out.println("Отделка салона: " + vnutr.getOtdelka());
        System.out.println("Отделка кресел: " + vnutr.getKresla());
        System.out.println("Колличество мест: " + vnutr.getMesta());

        Workers sostav = new Workers("Никита", "Дима", "Арчи");
        System.out.println("Слесарь: " + sostav.getSles());
        System.out.println("Монтажник: " + sostav.getMont());
        System.out.println("Администратор: " + sostav.getAdmin());


        Payment p = new Payment("Карта");

        System.out.println("Ваш способ оплаты: "+ p.getPayment());
        p.setPayment("Наличные");
        System.out.println("Ваш новый способ оплаты: "+ p.getPayment());

        Status s = new Status("Не оплачено");

        System.out.println("Статус оплаты: "+ s.getStatus());
        s.setStatus("Оплачено");
        System.out.println("Ваш новый статус оплаты: "+ s.getStatus());


    }
}
