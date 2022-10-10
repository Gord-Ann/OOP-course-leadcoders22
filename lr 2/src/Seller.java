public class Seller {

    private String name;
    private int rating;
    private long phoneNumber;


    public Seller(String name, int rating, long phoneNumber){
        this.name = name;
        this.rating = rating;
        this.phoneNumber = phoneNumber;
    }

    public Seller(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rating){
        if (rating >=0 && rating <= 5){
            this.rating = rating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
