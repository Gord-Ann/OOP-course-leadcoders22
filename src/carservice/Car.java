package carservice;

public class Car {

    private String[] cars = new String[100];
    private String model;
    private String brand;
    private int year;
    private String color;
    private int count;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void setCar() {
        cars[count] = model + "/" + brand + "/" + Integer.toString(year) + "/" + color;
    }

    public String[] getCar() {
        return cars;
    }
}
