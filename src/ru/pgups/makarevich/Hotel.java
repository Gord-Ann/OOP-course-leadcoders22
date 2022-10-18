package ru.pgups.makarevich;

public class hotel {
    public static void main(String[] argas) {
        System.out.println();
        Restaurant restaurant = new Restaurant("12", 12, 1500);
        System.out.println(Restaurant.getTimeEat());
        System.out.println(Restaurant.getStol());
        System.out.println(Restaurant.getCash());
        System.out.println();

        Administration administration =new Administration("Jack",10,60);
        System.out.println(Administration.getAdmin());
        System.out.println(Administration.getPeople());
        System.out.println(Administration.getHigh());
        System.out.println();

        Advertisement advertisement =new Advertisement("Clark", 8, "Kamera");
        System.out.println(Advertisement.getAdmin());
        System.out.println(Advertisement.getPeople());
        System.out.println(Advertisement.getVid());
        System.out.println();

        Attendance attendance = new Attendance("Mary", 9,"18:00");
        System.out.println(Attendance.getName());
        System.out.println(Attendance.getNumber());
        System.out.println(Attendance.getTime());
        System.out.println();

        Cleaning cleaning = new Cleaning("Elaiz", 5, "23:00");
        System.out.println(Cleaning.getAdmin());
        System.out.println(Cleaning.getPeople());
        System.out.println(Cleaning.getTime());
        System.out.println();

        Laundry laundry = new Laundry("John", 18,"Moscow");
        System.out.println(Laundry.getName());
        System.out.println(Laundry.getYear());
        System.out.println(Laundry.getCity());
        System.out.println();

        Repair repair = new Repair("Laus", 12, "Camera");
        System.out.println(Repair.getAdmin());
        System.out.println(Repair.getPeople());
        System.out.println(Repair.getObor());
        System.out.println();

        Security security = new Security("Rash", 6, 14);
        System.out.println(Security.getAdmin());
        System.out.println(Security.getPeople());
        System.out.println(Security.getLook());
        System.out.println();

        Staff staff = new Staff("Clark","Admin", 1999);
        System.out.println(Staff.getName());
        System.out.println(Staff.getrang());
        System.out.println(Staff.getYear());
        System.out.println();
    }

}


