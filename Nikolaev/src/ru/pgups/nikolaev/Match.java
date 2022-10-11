package ru.pgups.nikolaev;

public class Match {

    private String winner;

    private int score;

    private int duration;

    public Match (String winner, int score, int duration){
        this.winner = winner;
        this.score = score;
        this.duration = duration;
    }
    public int getScore(){ return this.score;}
    public void setScore(int score){
        this.score = score;
    }
    public String getWinner() { return this.winner;}
    public void setWinner(String winner) {
        this.winner = winner;
    }
    public int getDuration() { return this.duration;}
    public void setDuration(int duration) {
        this.duration = duration;}
}

