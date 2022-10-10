package com.javarush.test;

public class Employees {
        private String name;
        private Long phone;

        public Employees(String name, Long phone){
            this.name = name;
            this.phone = phone;
        }
        public Employees(){
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
