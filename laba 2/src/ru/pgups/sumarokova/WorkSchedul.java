package ru.pgups.sumarokova;

public class WorkSchedul {

    private String person;
    private String day;

    public WorkSchedul(String person, String day) {
        this.person = person;
        this.day = day;
    }

    public String getName() {
        return person;
    }

    public String getDay() {
        return day;
    }

    public void setName(String person) {
        this.person = person;
    }

    public void setDay(String day) {
        this.day = day;
    }
}

