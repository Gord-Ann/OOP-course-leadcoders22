public class Accountant {
    private String name;
    private int stage;
    private String educationLevel;

    public Accountant(String name, int stage, String educationLevel) {
        this.name = name;
        this.stage = stage;
        this.educationLevel = educationLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }
}
