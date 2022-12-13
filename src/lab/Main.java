package lab;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Member member = new Member("Aza","Nastya","Igorevna","aza@mail.ru");
        Member member1 = new Member("Ivanov","Vanya","Ivanovich","iv@yandex.ru");
        Member member2 = new Member("Melnik","Anna","Vadimovna","mel@yandex.ru");

        List<Member> membersExh = new ArrayList<>();
        membersExh.add(member);
        membersExh.add(member1);
        membersExh.add(member2);

        Expert expert1 = new Expert("Maksimov","Ivan","Petrovich","Main presenter");
        List<Expert> expertsExh = new ArrayList<>();
        expertsExh.add(expert1);

        Exhibition exhibition = new Exhibition("Touch to history",  "25.11.2022","Demonstration of historical objects","PGUPS", 10, membersExh,expertsExh);
        exhibition.display();

        Expert expert2 = new Expert("Ivanov","Maksim","Maksimovich","Chief Speaker");
        List<Expert> expertsConf = new ArrayList<>();
        expertsConf.add(expert2);

        Member memberconf1 = new Member("Lebedeva","Nastya","Vitalevna","Leb@mail.ru");
        Member memberconf2 = new Member("Petrov","Maksim","Ivanovich","Pet@yandex.ru");
        Member memberconf3 = new Member("Uvarova","Marina","Vadimovna","Uvar@yandex.ru");

        List<Member> membersСonf = new ArrayList<>();
        membersСonf.add(memberconf1);
        membersСonf.add(memberconf2);
        membersСonf.add(memberconf3);

        Conference conference = new Conference("Arctic","15.12.2022","Problems of the Arctic","PGUPS",20, membersСonf,expertsConf);
        conference.display();

        Expert expert3 = new Expert("Smirnov","Michail","Maksimovich", "Invited expert");
        Expert expert4 = new Expert("Maksimova","Maria","Ivanovna", "Chief speaker");
        List<Expert> expertsTr = new ArrayList<>();
        expertsTr.add(expert3);
        expertsTr.add(expert4);

        Member membertr1 = new Member("Smirnova","Valeria","Andreevna","Smir@mail.ru");
        Member membertr2 = new Member("Ivanova","Daria","Ivanovna","Iva@yandex.ru");
        List<Member> memberTr = new ArrayList<>();
        memberTr.add(membertr1);
        memberTr.add(membertr2);

        Training training = new Training("History at hand","15.12.2022","PGUPS",36,20,memberTr, expertsTr);
        training.display();

    }

}
