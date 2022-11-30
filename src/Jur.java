public class Jur {
    private String company;

    public Jur(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void getInfo(){
        System.out.println(this.company);
    }
}


