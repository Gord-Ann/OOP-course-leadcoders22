package ru.pgups.kyalina;

public class Database extends  Software{
    private String table;

    public Database(String interfase, String assemblers, String compilers, String table) {
        super(interfase, assemblers, compilers);
        this.table = table;
    }
    public void display(){
        super.display();
        System.out.println("Table: " + this.table);


    }
}
