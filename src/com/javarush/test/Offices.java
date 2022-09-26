package com.javarush.test;

public class Offices {
    private static String addres;
    private static String Office;
        public Offices(String addres, String Office){
            this.addres= addres;
            this.Office= Office;
        }
    public Offices(){
    }
    public static String getOffice(){
        return Office;
    }
    public void setOffice(String Office){
        this.Office = Office;
    }
    public static String getaddres(){
            return addres;
        }
        public void setaddress(String addres){
            this.addres = addres;
        }
    }
