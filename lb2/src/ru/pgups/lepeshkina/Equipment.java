package ru.pgups.lepeshkina;

public class Equipment {
    private String name;
    private String characteristics;
    private int lifetime;

    public Equipment(String name, String characteristics, int lifetime) {
        this.name = name;
        this.characteristics = characteristics;
        this.lifetime = lifetime;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacteristics() {
        return this.characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public int getLifetime() {
        return this.lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
}
