package ru.pgups.sumarokova;

public class Salary {
     private int number;
     private double hour;
     private double rate;

     public Salary(int number, double hour, double rate){
          this.number = number;
          this.hour = hour;
          this.rate = rate;
     }

     public int getNumber() {
          return number;
     }

     public void setNumber(int number) {
          this.number = number;
     }

     public double getHour() {
          return hour;
     }

     public void setHour(double hour) {
          this.hour = hour;
     }

     public double getRate() {
          return rate;
     }

     public void setRate(double rate) {
          this.rate = rate;
     }
}

class MainSalary {
     public static void main(String[] args){
          Salary A = new Salary(2, 4.5, 213);
          System.out.println("Salary: " + A.getNumber());
          System.out.println("Hour: " + A.getHour()) ;
          System.out.println("Rate: " + A.getRate());
          System.out.println("Result: " + A.getHour()*A.getRate());

          System.out.println("        UPDATE       ");
          //A.setNumber();
          System.out.println("Salary: " + A.getNumber());

          A.setHour(8.4);
          System.out.println("Hour: " + A.getHour()) ;

          //A.setRate(213);
          System.out.println("Rate: " + A.getRate());

          System.out.println("Result: " + A.getHour()*A.getRate());
     }


}
