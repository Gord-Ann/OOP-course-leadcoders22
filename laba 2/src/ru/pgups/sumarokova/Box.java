package ru.pgups.sumarokova;


public class Box {

    private String name;
    private int height;
    private int width;
    private int length;


    public Box(String name, int height, int width, int length) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.length = length;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
    class MainBox{

        public static void main(String[] args) {
           Box A = new Box("A",1200, 1200, 1200);
           System.out.println("Name Box " + A.getName()+ " cm");
           System.out.println( "Height: " + A.getHeight()+ " cm");
           System.out.println( "Width: " + A.getWidth()+ " cm");
           System.out.println( "Length: " + A.getLength()+ " cm");
           System.out.println(" ");


            Box B = new Box("B",2000, 2200, 1500);
            System.out.println("Name Box " + B.getName()+ " cm");
            System.out.println( "Height: " + B.getHeight()+ " cm");
            System.out.println( "Width: " + B.getWidth()+ " cm");
            System.out.println( "Length: " + B.getLength()+ " cm");
            System.out.println(" ");

            Box C = new Box("C",2400, 2500, 2100);
            System.out.println("Name Box " + C.getName()+ " cm");
            System.out.println( "Height: " + C.getHeight()+ " cm");
            System.out.println( "Width: " + C.getWidth()+ " cm");
            System.out.println( "Length: " + C.getLength()+ " cm");
            System.out.println(" ");

            System.out.println("     Change in the characteristics of box C ");
            System.out.println("Name Box " + C.getName());

            C.setHeight(2350);
            System.out.println( "Height: " + C.getHeight() + " cm");

            C.setLength(2550);
            System.out.println( "Width: " + C.getWidth() + " cm");

            C.setWidth(2200);
            System.out.println( "Length: " + C.getLength()+ " cm");


    }
    }