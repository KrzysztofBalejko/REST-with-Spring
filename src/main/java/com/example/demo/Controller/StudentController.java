package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class StudentController {

    private StudentService studentService = new StudentService();

    public Collection<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    };


}
