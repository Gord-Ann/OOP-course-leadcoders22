package com.javarush.test;

public class Employee extends  Person{

     public Employee(String name, String phone){
        super(name,phone);

    }

    @Override
    public  void showData(){
     System.out.println("Name:"+getName() +","+" "+"Phone:"+ getPhone());
    }

}
