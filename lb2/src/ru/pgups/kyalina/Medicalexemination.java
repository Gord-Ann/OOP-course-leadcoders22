package ru.pgups.kyalina;

public class Medicalexemination {

    private String conclusion;

    private int positiveAnswer;

    private int negativeAnswer;

    public void medicalExamination(String conclusion, int positiveanswer, int negativeAnswer){
        this.conclusion = conclusion;
        this.positiveAnswer = positiveAnswer;
        this.negativeAnswer = negativeAnswer;
    }
    public String getConclusion(){return this.conclusion;}
    public void setConclusion(String conclusion){
        this.conclusion = conclusion;
    }
    public int getpositiveAnswer(){return this.positiveAnswer;}
    public void setpositiveAnswer(int positiveAnswer){
        this.positiveAnswer = positiveAnswer;
    }
    public int getnegativeAnswer(){return this.negativeAnswer;}
    public void setnegativeAnswer(int negativeAnswer){
        this.negativeAnswer = negativeAnswer;
    }


}


