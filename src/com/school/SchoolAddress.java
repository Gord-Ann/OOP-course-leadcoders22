package com.school;

public class SchoolAddress {

    private String address;

        public SchoolAddress(){}


        public SchoolAddress(String address){
            this.address= address;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public void getInfo(){
            System.out.println("Address of School: " + this.address);
        }
    }
