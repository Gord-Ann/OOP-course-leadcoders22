package com.javarush.test;

public abstract class Person {
    private String name;
    private String phone;

    public Person(String name, String phone) {
        if (phone.length()==11){
            this.phone = phone;
        }else{
            System.out.println("Error. Check your phone number");
        }
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        if (phone.length()==11){
            this.phone = phone;
        }else{
            System.out.println("Error. Check your phone number");
        }
        
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }


    public abstract void showData();




}
