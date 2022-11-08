package com.javarush.test;

public class Guest {
    //Постоялец
        private String name;
        private Long phone;

        public Guest(String name, Long phone){
            this.name = name;
            this.phone = phone;
        }
        public Guest(){
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public Long getPhone(){
            return phone;
        }
        public void setPhone(Long phone) {
            if (phone !=11){
                this.phone = phone;
            }else{
                System.out.println("Error. Check your phone number");
            }
        }

}
