public class Workers {
    private String name;
    private String post;
    private int pay;

    public Workers(String name, String post, int pay) {
        this.name=name;
        this.post=post;
        this.pay=pay;
    }

    public String getName() { return this.name;}
    public void setName(String name) {
        this.name=name;
    }
    public String getPost() { return this.post;}
    public void setPost(String post) {
        this.post=post;
    }
    public int getPay() { return this.pay;}
    public void setPay(int pay) {
        this.pay=pay;}
}
