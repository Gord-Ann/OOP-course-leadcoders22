package ru.pgups.efimova;

public class Group {
    private String name;
    private int amountStudents;
    private String  groupLeader;
    public Group(String name, int amountStudents, String groupLeader) {
        this.name = name;
        this.amountStudents = amountStudents;
        this.groupLeader = groupLeader;
    }
    public String getGroupInfo() {
        String result = "Name:" + this.name + "AmountStudents:"+ this.amountStudents + "groupLeader:" + this.groupLeader;
        return result;
    }
    public String getName() {return this.name;}
    public void setName(String name){
        this.name = name;
    }
    public int getAmountStudents(){return this.amountStudents;}
    public void setAmountStudents(int amountStudents){
        this.amountStudents = amountStudents;
    }
    public String getgroupLeader(){return this.groupLeader;}
    public void setgroupLeader(String groupLeader){
        this.groupLeader = groupLeader;
    }
}


