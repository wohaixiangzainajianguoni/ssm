package com.zqg.service.serviceImpl;

import com.zqg.exception.CustomException;
import com.zqg.mapper.GradeMapper;
import com.zqg.mapper.StudentMapper;
import com.zqg.po.Grade;
import com.zqg.po.Student;
import com.zqg.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    GradeMapper gradeMapper;

    @Override
    public List<Student> selectStudent() throws Exception {




       return studentMapper.selectStudentinfo();

    }

    @Override
    public void insertStudent(Student student) throws Exception {

        studentMapper.insert(student);

        Grade grade = student.getGrade();

//        int result = 1/0;


        gradeMapper.insertGrade(grade);



    }

    @Override
    public Student selectStudentById(int id) throws Exception {


        return studentMapper.selectStudentById(id);
    }

    @Override
    public void updateStudent(Student student) throws Exception {


        studentMapper.updateStudent(student);


    }


}
