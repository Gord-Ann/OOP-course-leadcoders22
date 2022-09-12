package introOOP.principlesOOP;

public class Main {

    public static void main(String[] args) {
        Point pointA = new Point(1,2);
        Point pointB = new Point(3,4);

        double distanceAB = pointA.getDistance(pointB);

        System.out.println(distanceAB);
    }
}
