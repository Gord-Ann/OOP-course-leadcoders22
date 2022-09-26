package com.javarush.test;

public class Authors {
    private String name;
    private Long phone;

    public Authors(String name, Long phone) {
        this.name = name;
        this.phone = phone;
    }

    public Authors() {
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
