package ru.pgups.nikolaev;

public class Player {
    private String name;

    private int weight;

    private int growth;

    public Player(String name, int weight, int growth) {
        this.name = name;
        this.weight = weight;
        this.growth = growth;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getGrowth() {
        return this.growth;
    }

    public void setGrowth(int growth) {

        this.growth = growth;
    }
}

