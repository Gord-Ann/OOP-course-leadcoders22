package com.javarush.test;

public class Offices {
    private  String addres;
    private  String Office;
        public Offices(String addres, String Office){
            this.addres= addres;
            this.Office= Office;
        }
    public Offices(){
    }
    public  String getOffice(){
        return Office;
    }
    public void setOffice(String Office){
        this.Office = Office;
    }
    public  String getaddres(){
            return addres;
        }
        public void setaddress(String addres){
            this.addres = addres;
        }
    }
