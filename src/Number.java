public class Number {
    private int Number;
    public Number(int Number){
        this.Number=Number;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public void GetInfo(){
        System.out.println(this.Number);
    }
}
