package ru.pgups.kyalina;

public class Database {


    private String cell;
    private int column;
    private int information ;

    public Database(String cell, int column, int information ) {
        this.cell = cell;
        this.column = column;
        this.information = information;
    }

    public Database()  {

    }

    public String getCell() {return this.cell;}
    public void setCell (String cell) {
        this.cell = cell;
    }
    public int getColumn() {return this.column;}
    public void setColumn(int column) {
        this.column = column;
    }
    public int getInformation(){return this.information;}
    public void setInformation(int information) {
        this.information = information;
    }
}