package com.zqg.mapper;



import com.zqg.po.Student;

import java.util.List;

public interface StudentMapper {

    public  int insert(Student student) throws  Exception;

    public List<Student> selectStudent()throws  Exception;


    public List<Student> selectStudentinfo()throws  Exception;


    public List<Student> selectStudentSql(Student student)throws  Exception;

    public List<Student> selectforeach(List<Integer> ids)throws  Exception;

    public List<Student> selectin(List<Integer> ids)throws  Exception;


    public List<Student> associationSelect()throws  Exception;
    public Student selectStudentById(int id)throws  Exception;

    void updateStudent(Student student)  throws  Exception;
}
