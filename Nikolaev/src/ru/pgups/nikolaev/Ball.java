package ru.pgups.nikolaev;

public class Ball {
    private String typeOfSport;

    private String material;

    private int weight;

    public Ball(String typeOfSport, String material, int weight) {
        this.typeOfSport = typeOfSport;
        this.material = material;
        this.weight = weight;
    }

    public String getTypeOfSport() {
        return this.typeOfSport;
    }

    public void setTypeOfSport(String typeOfSport) {
        this.typeOfSport = typeOfSport;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWeight() {
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

}