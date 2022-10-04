public class Hospital {
    String doctor;
    String time;
    int price;

    public Hospital(){
    }
    void ShowInfo() {
        System.out.println("Doctor: " + doctor);
        System.out.println("Time: " + time);
        System.out.println("Price: " + price);
    }
}