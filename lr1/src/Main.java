public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.doctor = "Surgeon"; //Хирург
        hospital.time = "Session";
        hospital.price = 3000;

        hospital.ShowInfo();

        Patients first = new Patients("Misha", "misha.patients@gmailcom", 88005553535l);

        System.out.println("Patients name - " + first.getName());
        System.out.println("Patients email - " + first.getEmail());
        System.out.println("Patients phone - " + first.getPhone());

        Record one = new Record("Ivanov", 1);

        System.out.println("first type - " + one.getType());
        one.setType("LASIK"); //Laser-Assisted in Situ Keratomileusis — «лазерный кератомилёз»
        System.out.println("new type - " + one.getType());

        System.out.println("hours before update - " + one.getTime());
        one.setTime(3);
        System.out.println("hours after update - " + one.getTime());

        Place onee = new Place("department");

        System.out.println("old type - " + onee.getType());
        onee.setType("ward");
        System.out.println("new type - " + onee.getType());

        Review firstt = new Review(5, 4);

        System.out.println("Rating_pills - " + firstt.getRating_pills());
        System.out.println("Rating_therapy - " + firstt.getRating_therapy());

        boolean booleanTrue = firstt.getRating_therapy() == firstt.getRating_pills();
        boolean booleanFalse = firstt.getRating_pills() < firstt.getRating_therapy();
        {
            if (booleanTrue) {
                System.out.println("Place is great");
            } else if (booleanFalse) {
                System.out.println("Trust yourself");
            } else {
                System.out.println("The place is good, but it's better to be on inpatient treatment");
            }
        }
        Info inf = new Info("Massage included", "working");

        System.out.println("pills - " + inf.getPills());
        System.out.println("therapy - " + inf.getTherapy());

        Insurance bon = new Insurance(0);

        System.out.println("Insurance - "+ bon.getAmount());
        bon.setAmount(0);
        System.out.println("Insurance after hospital - "+ bon.getAmount());

        Time t = new Time(5.5);

        System.out.println("Your operation time is - "+ t.getTime());
        t.setTime(-1);
        System.out.println("Your new operation time is - "+ t.getTime());

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