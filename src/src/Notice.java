public class Notice {

    private int noticeId;

    private int price;

    private String description;

    public Notice (int noticeId, int price, String description){
        this.noticeId = noticeId;
        this.price = price;
        this.description = description;
    }

    public int getNoticeId(){
        return noticeId;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
