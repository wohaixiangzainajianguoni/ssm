package com.zqg.service;

import com.zqg.po.Grade;
import com.zqg.po.Student;

import java.util.List;

public interface GradeService {


    public void insert(Grade grade) throws Exception;


    public List<Grade> getAllGrade() throws Exception;

}
