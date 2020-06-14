package com.zqg.po;

import java.io.Serializable;

public class Student implements Serializable {


    private int id;
    private String stuName;

    private String picture;


    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    private int gradeId;
    private Grade grade;

    public int getGradeId() {
        return gradeId;
    }



    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }


    public Student(int id, String stuName, int gradeId) {
        this.id = id;
        this.stuName = stuName;
        this.gradeId = gradeId;
    }

    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", gradeId=" + gradeId +
                ", grade=" + grade +
                '}';
    }
}
