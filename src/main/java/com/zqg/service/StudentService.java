package com.zqg.service;


import com.zqg.po.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

     List<Student> selectStudent() throws Exception;

     void insertStudent(Student student) throws  Exception;


     Student selectStudentById(int id) throws Exception;

    void updateStudent(Student student) throws Exception;
}
