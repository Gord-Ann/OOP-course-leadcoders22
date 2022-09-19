public class Car_name {

    private String brand;
    private String model;
    private int year;

    public Car_name(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public Car_name() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if (year >= 1920 && year <= 2022){
            this.year = year;
        }else{
            System.out.println("Year cannot be less than 1920 or more than 2022");
        }

    }

}

