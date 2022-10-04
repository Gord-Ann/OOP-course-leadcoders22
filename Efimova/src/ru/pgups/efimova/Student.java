package ru.pgups.efimova;

public class Student {
        private String name;
        private int courseOfStudy;
        private String faculty;

        public Student(String name, int courseOfStudy, String faculty){
            this.name = name;
            this.courseOfStudy = courseOfStudy;
            this.faculty = faculty;
        }
        public String getName(){return this.name;}
    public void setName(String name){
            this.name = name;
    }
    public int getCourseOfStudy(){return this.courseOfStudy;}
    public void setCourseOfStudy(String name){
        this.courseOfStudy = courseOfStudy;
}
    public String getFaculty(){return this.faculty;}
    public void setFaculty(String faculty){
        this.faculty = faculty;
        }
}