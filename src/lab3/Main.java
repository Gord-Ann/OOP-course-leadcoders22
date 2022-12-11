package lab3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Member member = new Member("Aza","Nastya","Igorevna","aza@mail.ru");
        Member member1 = new Member("Ivanov","Vanya","Ivanovich","iv@yandex.ru");
        Member member2 = new Member("Melnik","Anna","Vadimovna","mel@yandex.ru");

        List<Member> membersexh = new ArrayList<>();
        membersexh.add(member);
        membersexh.add(member1);
        membersexh.add(member2);

        Event exhibition = new Exhibition("touch to history",  "25.11.2022","PGUPS", 10, membersexh);
        exhibition.display();

        Member memberconf1 = new Member("Lebedeva","Nastya","Vitalevna","Leb@mail.ru");
        Member memberconf2 = new Member("Petrov","Maksim","Ivanovich","Pet@yandex.ru");
        Member memberconf3 = new Member("Uvarova","Marina","Vadimovna","Uvar@yandex.ru");

        List<Member> membersconf = new ArrayList<>();
        membersconf.add(memberconf1);
        membersconf.add(memberconf2);
        membersconf.add(memberconf3);

        Event conference = new Conference("Arctic","15.12.2022","PGUPS",20, membersconf);
        conference.display();

        Member membertr1 = new Member("Smirnova","Valeria","Andreevna","Smir@mail.ru");
        Member membertr2 = new Member("Ivanova","Daria","Ivanovna","Iva@yandex.ru");
        List<Member> membertr = new ArrayList<>();
        membertr.add(membertr1);
        membertr.add(membertr2);

        Event training = new Training("Arctic","15.12.2022","PGUPS",20,membertr);
        training.display();

    }

}
