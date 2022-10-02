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
           Box small = new Box("Small",1200, 1200, 1200);
           System.out.println("Name Box " + small.getName()+ " cm");
           System.out.println( "Height: " + small.getHeight()+ " cm");
           System.out.println( "Width: " + small.getWidth()+ " cm");
           System.out.println( "Length: " + small.getLength()+ " cm");
           System.out.println(" ");


            Box medium= new Box("Medium",2000, 2200, 1500);
            System.out.println("Name Box " + medium.getName()+ " cm");
            System.out.println( "Height: " + medium.getHeight()+ " cm");
            System.out.println( "Width: " + medium.getWidth()+ " cm");
            System.out.println( "Length: " + medium.getLength()+ " cm");
            System.out.println(" ");

            Box big = new Box("Big",2400, 2500, 2100);
            System.out.println("Name Box " + big.getName()+ " cm");
            System.out.println( "Height: " + big.getHeight()+ " cm");
            System.out.println( "Width: " + big.getWidth()+ " cm");
            System.out.println( "Length: " + big.getLength()+ " cm");
            System.out.println(" ");

            System.out.println("     Change in the characteristics of box C ");
            System.out.println("Name Box " + big.getName());

            big.setHeight(2350);
            System.out.println( "Height: " + big.getHeight() + " cm");

            big.setLength(2550);
            System.out.println( "Width: " + big.getWidth() + " cm");

            big.setWidth(2200);
            System.out.println( "Length: " + big.getLength()+ " cm");


    }
    }