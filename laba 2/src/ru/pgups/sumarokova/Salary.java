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
          Salary Anna = new Salary(2, 4.5, 213);
          System.out.println("Salary: " + Anna.getNumber());
          System.out.println("Hour: " + Anna.getHour()) ;
          System.out.println("Rate: " + Anna.getRate());
          System.out.println("Result: " + Anna.getHour()*Anna.getRate());

          System.out.println("UPDATE");
          //A.setNumber();
          System.out.println("Salary: " + Anna.getNumber());

          Anna.setHour(8.4);
          System.out.println("Hour: " + Anna.getHour()) ;

          //A.setRate(213);
          System.out.println("Rate: " + Anna.getRate());

          System.out.println("Result: " + Anna.getHour()*Anna.getRate());
     }


}
