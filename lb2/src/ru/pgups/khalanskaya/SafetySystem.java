package ru.pgups.khalanskaya;

public class SafetySystem {
    private String signaling;

    private int cameras;

    private int inspection;

    public SafetySystem(){
        this.signaling = signaling;
        this.cameras = cameras;
        this.inspection = inspection;
    }
    public String getSignaling(){return this.signaling;}
    public void setSignaling (String signaling){
        this.signaling = signaling;
    }
    public int getCameras(){return this.cameras;}
    public void  setCameras(int cameras){
        this.cameras = cameras;
    }
    public int getInspection(){return this.inspection;}
    public void setInspection(int inspection){
        this.inspection = inspection;
    }
}
