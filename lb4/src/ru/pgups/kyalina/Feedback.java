package ru.pgups.kyalina;

public class Feedback {


    private String content ;
    private int userId;
    private int feedbackId;

    public Feedback(String content, int userId, int feedbackId ) {
        this.content = content;
        this.userId = userId;
        this.feedbackId = feedbackId;
    }

    public Feedback() {

    }

    public String getcarContent() {return this.content;}
    public void setContent (String content) {
        this.content = content;
    }
    public int getuserId() {return this.userId;}
    public void setuserId(int userId) {
        this.userId = userId;
    }
    public int getfeedbackId(){return this.feedbackId;}
    public void setfeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }
}
