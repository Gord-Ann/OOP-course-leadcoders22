package ru.pgups.efimova;

public class Semester {
    private String progress;
    private int number;
    private int courseOfStudy;
    public Semester(String progress, int number, int courseOfStudy) {
        this.progress = progress;
        this.number = number;
        this.courseOfStudy = courseOfStudy;
    }
    public String getSemesterInfo() {
        String result = "Progress:" + this.progress + "Number:"+ this.number + "courseOfStudy:" + this.courseOfStudy;
        return result;
    }
    public String getProgress() {return this.progress;}
    public void setProgress(String progress){
        this.progress = progress;
    }
    public int getNumber(){return this.number;}
    public void setNumber(int number){
        this.number = number;
    }
    public int getCourseOfStudy(){return this.courseOfStudy;}
    public void setCourseOfStudy(int courseOfStudy){
        this.courseOfStudy = courseOfStudy;
    }
}
