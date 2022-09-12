package introOOP.principlesOOP;

public class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(Point anotherPoint) {
        double dx = this.x - anotherPoint.x;
        double dy = this.y - anotherPoint.y;

        return Math.sqrt(dx * dx + dy * dy);
    }
}

