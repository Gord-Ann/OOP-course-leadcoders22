package ru.pgups.efimova;

public class Dean {
    private String academicDegree;
    private int standing;
    private String faculty;

    public Dean(String academicDegree, int standing, String faculty) {
        this.academicDegree = academicDegree;
        this.standing = standing;
        this.faculty = faculty;
}
    public String getDeanInfo() {
        String result = "AcademicDegree:" + this.academicDegree + "standing:" + this.standing + "Faculty:" + this.faculty;
        return result;
    }
    public String getAcademicDegree() {return this.academicDegree;}
    public void setAcademicDegree(String academicDegree){
        this.academicDegree = academicDegree;
    }
    public int getStanding(){return this.standing;}
    public void setStanding(int number){
        this.standing = standing;
    }
    public String getFaculty(){return this.faculty;}
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
}
