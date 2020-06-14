package com.zqg.controller;

import com.zqg.po.Grade;
import com.zqg.po.Student;
import com.zqg.service.GradeService;
import com.zqg.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.IconUIResource;
import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
public class FirstController   {
    @Autowired
    StudentService studentService;
    @Autowired
    GradeService gradeService;

    @RequestMapping("/")
    public  ModelAndView first() throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("first");
        try {
//            List<Grade> allGrade = gradeService.getAllGrade();
            List<Student> students = studentService.selectStudent();
            modelAndView.addObject("allStudent",students);
        }catch (Exception e)
        {
            throw  e;
        }

      return  modelAndView;
    }

    @RequestMapping("/insertStudent")
    public String insertStudent(Student student, MultipartFile file)
    {

        try {
            studentService.insertStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        重定向
//        return  "redirect:/";

        return "forward:/";
    }







}
