package com.javarush.test;
//Оплата
public class Order {

    public Order() {
    }
public void Ordering(int cost, int number, int quantity, Customer c, Employee e, Book b, Offices o){
System.out.println("Номер заказа:" + number +", "+ "Стоимость заказа:" + cost +", " + "Номер заказа:" + number);
System.out.println("Заказчик:" + c.getName() + " "+ "Оформил заказ:" + e.getName() + " " +"Офис получения:" + o.getaddres() + " " + o.getOffice() );
System.out.println("Книга:" + b.getName() + " " + "Количество:" + quantity);

}




}