package lab2;
public class Cars {
    private String model;
    private int age;
    private int probeg;

    public Cars(String model, int age, int probeg) {
        this.model = model;
        this.age = age;
        this.probeg = probeg;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getProbeg() {
        return probeg;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }
}