package lab3;


public class Main {
    public static void main(String[] args) {
        Event exhibition = new Exhibition("touch to history",  "25.11.2022","PGUPS", 50);
        exhibition.display();

        Event conference = new Conference("Arctic","15.12.2022","PGUPS",20);
        conference.display();

        Event training = new Training("Arctic","15.12.2022","PGUPS",20);
        training.display();

        User member = new Member("Aza","Nastya","Igor","aza@mail.ru");
        member.getList();
    }

}
