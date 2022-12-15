package com.javarush.test;

public class Rooms {

        private static String addres;
        private static String room;
        public Rooms(String addres, String Office){
            this.addres= addres;
            Rooms.room = room;
        }
        public Rooms(){
        }
        public static String getOffice(){
            return room;
        }

    public static String getaddres() {
        return null;
    }

    public void setOffice(String office){
            this.room = office;
        }
        public static String getAddres(){
            return addres;
        }
        public void setAddres(String addres){
            this.addres = addres;
        }
    }

