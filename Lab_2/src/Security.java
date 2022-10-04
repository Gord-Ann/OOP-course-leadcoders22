public class Security {
    private String name;
    private String sensors;
    private int lifetime;

    public Security(String name, String sensors, int lifetime) {
        this.name = name;
        this.sensors = sensors;
        this.lifetime = lifetime;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSensors() {
        return this.sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }

    public int getLifetime() {
        return this.lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;


    }
}