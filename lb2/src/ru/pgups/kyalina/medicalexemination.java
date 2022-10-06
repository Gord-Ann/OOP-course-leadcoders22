package ru.pgups.kyalina;

public class medicalexemination {

    private String conclusion;

    private int positiveanswer;

    private int negativeanswer;

    public void medicalexamination(String conclusion, int positiveanswer, int negativeanswer){
        this.conclusion = conclusion;
        this.positiveanswer = positiveanswer;
        this.negativeanswer = negativeanswer;
    }
    public String getConclusion(){return this.conclusion;}
    public void setConclusion(String conclusion){
        this.conclusion = conclusion;
    }
    public int getPositiveanswer(){return this.positiveanswer;}
    public void setPositiveanswer(int positiveanswer){
        this.positiveanswer = positiveanswer;
    }
    public int getNegativeanswer(){return this.negativeanswer;}
    public void setNegativeanswer(int negativeanswer){
        this.negativeanswer = negativeanswer;
    }


}


