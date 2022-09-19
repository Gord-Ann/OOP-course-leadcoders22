public class Volume_and_weight {
    private int trunk_volume;
    private int fuel_tank;
    private int weight;
    private int max_weight;

    public Volume_and_weight(int trunk_volume, int fuel_tank, int weight, int max_weight){
        this.trunk_volume = trunk_volume;
        this.fuel_tank = fuel_tank;
        this.weight = weight;
        this.max_weight = max_weight;
    }

    public Volume_and_weight(){
    }

    public int getFuel_tank() {
        return fuel_tank;
    }

    public void setFuel_tank(int fuel_tank) {
        if (fuel_tank >= 0){
            this.fuel_tank = fuel_tank;
        }else{
            System.out.println("Fuel tank cannot be negative");
        }
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if (weight >= 0){
            this.weight = weight;
        }else{
            System.out.println("Weight cannot be negative");
        }
    }

    public int getTrunk_volume() {
        return trunk_volume;
    }

    public void setTrunk_volume(int trunk_volume) {
        if (trunk_volume >= 0){
            this.trunk_volume = trunk_volume;
        }else{
            System.out.println("Trunk volume cannot be negative");
        }
    }

    public int getMax_weight() {
        return max_weight;
    }
    public void setMax_weight(int max_weight) {
        if (max_weight >= 0){
            this.max_weight = weight;
        }else{
            System.out.println("Max weight cannot be negative");
        }
    }


}
