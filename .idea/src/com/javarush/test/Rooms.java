package com.javarush.test;

public class Rooms {

        private static String addres;
        private static String Room;
        public Rooms(String addres, String Office){
            this.addres= addres;
            Rooms.Room = Room;
        }
        public Rooms(){
        }
        public static String getOffice(){
            return Room;
        }
        public void setOffice(String Office){
            this.Room = Office;
        }
        public static String getaddres(){
            return addres;
        }
        public void setaddress(String addres){
            this.addres = addres;
        }
    }

