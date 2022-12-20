package com.school;

public class DescriptionOfTheSchool {
    NumberOfClasses numberOfClasses;///количество классов
    NumberOfOffices numberOfOffices;///количество офисов
    NumberOfStudents numberOfStudents;///количество студентов
    NumberOfTeachers numberOfTeachers;///количество учителей
    SchoolAddress address; ///адрес школы
    SchoolNumber number;  /// номер школы
    SchoolRating rating; ///  рейтинг школы


    public DescriptionOfTheSchool(){}

    public DescriptionOfTheSchool(NumberOfClasses NumberOfClasses, NumberOfOffices NumberOfOffices, NumberOfStudents NumberOfStudents, NumberOfTeachers NumberOfTeachers, SchoolAddress address, SchoolNumber number, SchoolRating rating ){
        this.numberOfClasses = NumberOfClasses;
        this.numberOfOffices = NumberOfOffices;
        this.numberOfStudents = NumberOfStudents;
        this.numberOfTeachers = NumberOfTeachers;
        this.address = address;
        this.number = number;
        this.rating = rating;

    }

    public void getInfo() {
        System.out.println("количество классов");
        System.out.println("================");
        numberOfClasses.getInfo();
        System.out.println("================");

        System.out.println("количество офисов: ");
        numberOfOffices.getInfo();
        System.out.println("================");

        System.out.println("количество студентов ");
        numberOfStudents.getInfo();
        System.out.println("================");

        System.out.println("количество учителей: ");
        numberOfTeachers.getInfo();
        System.out.println("================");

        System.out.println("адрес школы ");
        address.getInfo();
        System.out.println("================");

        System.out.println("номер школы: ");
        number.getInfo();
        System.out.println("================");

        System.out.println("рейтинг школы: ");
        rating.getInfo();
        System.out.println("================");

    }


}
