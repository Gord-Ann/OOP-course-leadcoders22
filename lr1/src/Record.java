public class Record {
    private String type;
    int time;

    public Record(String type, int time){
        this.type = type;
        this.time = time;
    }
    public Record(){
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getTime(){
        return time;
    }
    public void setTime(int time){
        this.time = time;
    }
}
