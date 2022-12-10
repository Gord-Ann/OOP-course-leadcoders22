package l3;

public class Employee {
    private String name;
    private String post;
    private long number;
    private String mail;

    public Employee(String name, String post, long number, String mail){
        this.name=name;
        this.post=post;
        this.number=number;
        this.mail=mail;
    }
    public void display() {
        System.out.println(this.name+ " "+ this.post + " " + this.number + " " + this.mail );
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
