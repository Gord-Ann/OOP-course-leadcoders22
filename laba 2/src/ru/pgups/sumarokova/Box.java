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
           Box Small = new Box("Small",1200, 1200, 1200);
           System.out.println("Name Box " + Small.getName()+ " cm");
           System.out.println( "Height: " + Small.getHeight()+ " cm");
           System.out.println( "Width: " + Small.getWidth()+ " cm");
           System.out.println( "Length: " + Small.getLength()+ " cm");
           System.out.println(" ");


            Box Medium= new Box("Medium",2000, 2200, 1500);
            System.out.println("Name Box " + Medium.getName()+ " cm");
            System.out.println( "Height: " + Medium.getHeight()+ " cm");
            System.out.println( "Width: " + Medium.getWidth()+ " cm");
            System.out.println( "Length: " + Medium.getLength()+ " cm");
            System.out.println(" ");

            Box Big = new Box("Big",2400, 2500, 2100);
            System.out.println("Name Box " + Big.getName()+ " cm");
            System.out.println( "Height: " + Big.getHeight()+ " cm");
            System.out.println( "Width: " + Big.getWidth()+ " cm");
            System.out.println( "Length: " + Big.getLength()+ " cm");
            System.out.println(" ");

            System.out.println("     Change in the characteristics of box C ");
            System.out.println("Name Box " + Big.getName());

            Big.setHeight(2350);
            System.out.println( "Height: " + Big.getHeight() + " cm");

            Big.setLength(2550);
            System.out.println( "Width: " + Big.getWidth() + " cm");

            Big.setWidth(2200);
            System.out.println( "Length: " + Big.getLength()+ " cm");


    }
    }