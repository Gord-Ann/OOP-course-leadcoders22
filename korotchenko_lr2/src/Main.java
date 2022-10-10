public class Main {
    public static void main(String[] args) {
        Tour tour = new Tour("Austria", "Salzburg", 250000);

        System.out.println("Old country - " + tour.getCountry());
        tour.setCountry("Italy");
        System.out.println("New country - " + tour.getCountry());
        System.out.println("Old city - " + tour.getCity());
        tour.setCity("Rome");
        System.out.println("New city - " + tour.getCity());
        System.out.println("Old price - " + tour.getPrice());
        tour.setPrice(270000);
        System.out.println("New price - " +tour.getPrice());

        Client first = new Client("Andrew", "89115543211");

        System.out.println("Old client name - " + first.getName());
        first.setName("Boris");
        System.out.println("New client name - " +first.getName());
        System.out.println("Old client phone - " + first.getPhone());
        first.setPhone("8931465231");
        System.out.println("New client phone - " + first.getPhone());

        Movement one = new Movement("train", 2);

        System.out.println("first type - " + one.getType());
        one.setType("airplane");
        System.out.println("new type - " + one.getType());

        System.out.println("hours before update - " + one.getTime());
        one.setTime(3);
        System.out.println("hours after update - " + one.getTime());

        Place onee = new Place("hotel");

        System.out.println("old type - " + onee.getType());
        onee.setType("hostel");
        System.out.println("new type - " + onee.getType());

        Review firstt = new Review(5, 4);

        System.out.println("ratingFood - " + firstt.getratingFood());
        System.out.println("ratingWifi - " + firstt.getratingWifi());

        boolean booleanTrue = firstt.getratingWifi() == firstt.getratingFood();
        boolean booleanFalse = firstt.getratingFood() < firstt.getratingWifi();
        {
            if (booleanTrue) {
                System.out.println("Place is great");
            } else if (booleanFalse) {
                System.out.println("Trust yourself");
            } else {
                System.out.println("PLace is okay, but check it out");
            }
        }
        Information inf = new Information("breakfast is included", "working");

        System.out.println("Food - " + inf.getFood());
        System.out.println("Wifi - " + inf.getWifi());

        Bonuses bon = new Bonuses(0);

        System.out.println("Bonuses - "+ bon.getAmount());
        bon.setAmount(2);
        System.out.println("Bonuses after tour - "+ bon.getAmount());

        Time t = new Time(2.4);

        System.out.println("Your travel time is - "+ t.getTime());
        t.setTime(-1);
        System.out.println("Your new travel time is - "+ t.getTime());

        Payment p = new Payment("card");

        System.out.println("Your payment method is - "+ p.getPayment());
        p.setPayment("cash");
        System.out.println("Your new payment method is - "+ p.getPayment());

        Status s = new Status("paid");

        System.out.println("Your order status is - "+ s.getStatus());
        s.setStatus("not paid");
        System.out.println("Your new order status is - "+ s.getStatus());
    }
}