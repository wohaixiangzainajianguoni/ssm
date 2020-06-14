package com.zqg.mapper;


import com.zqg.po.Grade;

import java.util.List;


public interface GradeMapper {
    public int insertGrade(Grade grade) throws  Exception;

    public Grade selectGradeById(int id) throws  Exception;


    public List<Grade> selectGradeDetail() throws  Exception;
    
    public List<Grade> selectAllGrade() throws  Exception;




}
