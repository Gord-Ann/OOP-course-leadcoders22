import ru.pgups.efimova.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Classroom math = new Classroom("Math", 7515, 36);
        System.out.println(math.getName());
        System.out.println(math.getCapacity());
        System.out.print(math.getNumber());

        System.out.println();
        Dean professor = new Dean("Professor", 30, "history");
        System.out.println(professor.getAcademicDegree());
        System.out.println(professor.getStanding());
        System.out.print(professor.getFaculty());

        System.out.println();
        Departament ait = new Departament("ait", 5, 115);
        System.out.println(ait.getName());
        System.out.println(ait.getHousing());
        System.out.print(ait.getNumberOfTeachers());

        System.out.println();
        Exam russian = new Exam("Russian", 5, 35);
        System.out.println(russian.getSubject());
        System.out.println(russian.getGrade());
        System.out.print(russian.getDuration());

        System.out.println();
        Group bib = new Group("Bib", 30, "Ivanov");
        System.out.println(bib.getName());
        System.out.println(bib.getAmountStudents());
        System.out.print(bib.getgroupLeader());

        System.out.println();
        Semester good= new Semester("Good", 4, 4);
        System.out.println(good.getProgress());
        System.out.println(good.getNumber());
        System.out.print(good.getCourseOfStudy());

        System.out.println();
        Speciality builder = new Speciality(5875, "Builder", 44);
        System.out.println(builder.getCode());
        System.out.println(builder.getName());
        System.out.print(builder.getNumberOfStudents());

        System.out.println();
        Student ivanov = new Student("Ivanov" , 3, "RYU");
        System.out.println(ivanov.getName());
        System.out.println(ivanov.getCourseOfStudy());
        System.out.print(ivanov.getFaculty());

        System.out.println();
        Teacher sokolov = new Teacher("Sokolov" , 33, "Russian");
        System.out.println(sokolov.getName());
        System.out.println(sokolov.getStanding());
        System.out.print(sokolov.getSubject());
    }
}

