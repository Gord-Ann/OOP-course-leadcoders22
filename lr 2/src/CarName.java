public class CarName {

    private String brandName;
    private String modelName;
    private int year;

    public CarName(String brandName, String modelName, int year) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.year = year;

    }

    public CarName() {
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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

