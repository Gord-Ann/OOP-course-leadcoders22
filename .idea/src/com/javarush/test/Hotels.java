package com.javarush.test;
public class Hotels {
private String name;
private Long phone;

public Hotels(String name, Long phone) {
        this.name = name;
        this.phone = phone;
        }

public Hotels() {
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public Long getPhone() {
        return phone;
        }

public void setPhone(Long phone) {
        if (phone != 11) {
        this.phone = phone;
        } else {
        System.out.println("Ошибка. Проверьте корректность ввода");
        }
        }
        }





