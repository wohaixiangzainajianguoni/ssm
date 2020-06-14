package com.zqg.controller;

import com.zqg.po.Grade;
import com.zqg.po.Student;
import com.zqg.service.GradeService;
import com.zqg.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    GradeService gradeService;

    @RequestMapping("/updateStudent")
    public String  updateStudent(Student student, Model model)
    {
        int id = student.getId();
            Student result = null;
            try {
                if(id!=0) {
                    result = studentService.selectStudentById(student.getId());
                    model.addAttribute("student", result);
                }
                List<Grade> allGrade = gradeService.getAllGrade();
                model.addAttribute("allgrade",allGrade);
            } catch (Exception e) {
                e.printStackTrace();
            }

        return  "insertStudent";

    }



    @RequestMapping("/saveStudent")
    public  String saveStudent(Student student, @RequestParam("image") MultipartFile file,
                               HttpServletRequest request
    ) throws IOException {


        if(file.getSize()!=0)
        {
            String imagePath="/resource/upload";
            String path=request.getSession().getServletContext().getRealPath(imagePath);
            String originalFilename1 = file.getOriginalFilename();
            String newFileName = UUID.randomUUID().toString()+
                    originalFilename1.substring(originalFilename1.indexOf("."));
            File result = new File(path, newFileName);
            file.transferTo(result);
            student.setPicture(imagePath+"/"+newFileName);
        }







        try {
            studentService.updateStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return  "redirect:/";
    }







}
