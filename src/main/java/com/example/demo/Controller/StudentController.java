package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    public Collection<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    };


}
