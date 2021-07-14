package com.example.demo.Student;

import java.time.LocalDate;

public class Student {

    private int stuId;
    private String stuName;
    private LocalDate stuDob;
    private int stuAge;

    public Student(int i, String stuName, LocalDate stuDob, int stuAge) {
        this.stuId = i;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuDob = stuDob;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public LocalDate getStuDob() {
        return stuDob;
    }

    public void setStuDob(LocalDate stuDob) {
        this.stuDob = stuDob;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

}
