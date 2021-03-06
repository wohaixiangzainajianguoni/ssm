package com.zqg.po;

import java.io.Serializable;
import java.util.List;

public class Grade  implements Serializable {
    private  int id;

    private String gradeName;

    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Grade(int id, String gradeName) {
        this.id = id;
        this.gradeName = gradeName;
    }

    public Grade() {
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gradeName='" + gradeName + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
