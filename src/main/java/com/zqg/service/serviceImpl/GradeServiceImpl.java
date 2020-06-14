package com.zqg.service.serviceImpl;

import com.zqg.mapper.GradeMapper;
import com.zqg.po.Grade;
import com.zqg.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.sun.javafx.application.PlatformImpl.exit;


@Service
public class       GradeServiceImpl implements GradeService {


    @Autowired
    GradeMapper gradeMapper;

    @Override
    public void insert(Grade grade) throws Exception {
        gradeMapper.insertGrade(grade);

        exit();
    }

    @Override
    public List<Grade> getAllGrade() throws Exception {

        List<Grade> grades = gradeMapper.selectAllGrade();
        return  grades;
    }
}
