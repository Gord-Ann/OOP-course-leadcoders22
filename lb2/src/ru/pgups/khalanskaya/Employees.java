package ru.pgups.khalanskaya;

public class Employees {
    private String pilot;
    private int stewardess;
    private int dispetcher;

    public Employees(){
        this.pilot = pilot;
        this.stewardess = stewardess;
        this.dispetcher = dispetcher;
    }
    public String getPilot(){return this.pilot;}
    public void setPilot (String pilot){
        this.pilot = pilot;
    }
    public int getStewardess(){return this.stewardess;}
    public void  setStewardess(int stewardess){
        this.stewardess = stewardess;
    }
    public int getDispetcher(){return this.dispetcher;}
    public void setDispetcher(int dispetcher){
        this.dispetcher = dispetcher;
    }
}
