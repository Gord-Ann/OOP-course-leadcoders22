public class Driver {

    private String name;
    private int age;
    private int rating;
    private int stage;

    public Driver(String name, int age, int rating, int stage) {
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.stage = stage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("error");
        } else {
            this.age = age;
        }
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating > 5) {
            System.out.println("error");
        } else {
            this.rating = rating;
        }
    }


    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
}
