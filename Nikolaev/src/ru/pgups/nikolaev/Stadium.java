package ru.pgups.nikolaev;

public class Stadium {

    private int capacity;

    private String name;

    private String address;

    public Stadium(String name, int capacity, String address) {
        this.capacity = capacity;
        this.name = name;
        this.address = address;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

