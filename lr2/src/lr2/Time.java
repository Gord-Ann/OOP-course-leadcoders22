package lr2;

public class Time {
    private double time;

    public Time(double time) {
        this.time = time;
    }

    public Time() {
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        if (time > 0) {
            this.time = time;
        } else {
            System.out.println("Error. Insert the correct value ");
        }
    }
}
