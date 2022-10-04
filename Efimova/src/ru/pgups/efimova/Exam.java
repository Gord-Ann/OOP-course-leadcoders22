package ru.pgups.efimova;

public class Exam {
    private String subject;
    private int grade;
    private int duration;
    public Exam(String subject, int grade, int duration) {
        this.subject = subject;
        this.grade = grade;
        this.duration = duration;
    }
    public String getExamInfo() {
        String result = "Subject:" + this.subject + "Grade:"+ this.grade + "Duration:" + this.duration;
        return result;
    }
    public String getSubject() {return this.subject;}
    public void setSubject(String subject){
        this.subject = subject;
    }
    public int getGrade(){return this.grade;}
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getDuration(){return this.duration;}
    public void setDuration(int duration){
        this.duration = duration;
    }
}

