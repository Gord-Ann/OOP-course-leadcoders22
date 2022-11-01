public class Accountant {
    private String name;
    private int stage;
    private String education_level;

    public Accountant(String name, int stage, String education_level) {
        this.name = name;
        this.stage = stage;
        this.education_level = education_level;
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

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }
}
