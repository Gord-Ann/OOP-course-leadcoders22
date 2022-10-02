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
          Salary number2 = new Salary(2, 4.5, 213);
          System.out.println("Salary: " + number2.getNumber());
          System.out.println("Hour: " + number2.getHour()) ;
          System.out.println("Rate: " + number2.getRate());
          System.out.println("Result: " + number2.getHour()*number2.getRate());

          System.out.println("UPDATE");
          //A.setNumber();
          System.out.println("Salary: " + number2.getNumber());

          number2.setHour(8.4);
          System.out.println("Hour: " + number2.getHour()) ;

          //A.setRate(213);
          System.out.println("Rate: " + number2.getRate());

          System.out.println("Result: " + number2.getHour()*number2.getRate());
     }


}
