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