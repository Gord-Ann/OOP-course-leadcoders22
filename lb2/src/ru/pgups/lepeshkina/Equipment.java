package ru.pgups.lepeshkina;

public class Equipment {
    private String Name;
    private String Characteristics;
    private int Lifetime;

    public Equipment(String Name, String Characteristics, int Lifetime) {
        this.Name = Name;
        this.Characteristics = Characteristics;
        this.Lifetime = Lifetime;
    }
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCharacteristics() {
        return this.Characteristics;
    }

    public void setCharacteristics(String Characteristics) {
        this.Characteristics = Characteristics;
    }

    public int getLifetime() {
        return this.Lifetime;
    }

    public void setLifetime(int Lifetime) {
        this.Lifetime = Lifetime;
    }
}
