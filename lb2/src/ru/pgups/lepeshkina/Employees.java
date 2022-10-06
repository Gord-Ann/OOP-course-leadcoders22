package ru.pgups.lepeshkina;

public class Employees {
    private String jobTitile;
    private int experience;
    private int salary;

    public Employees(String jobTitile, int experience, int salary) {
        this.jobTitile = jobTitile;
        this.experience= experience;
        this.salary = salary;
    }
    public String getJobTitile() {
        return this.jobTitile;
    }

    public void setJobTitile(String jobTitile) {
        this.jobTitile = jobTitile;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

