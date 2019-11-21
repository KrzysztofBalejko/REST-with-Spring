package com.example.demo.Controller;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Entity.Student;

import java.util.Collection;

public class StudentController {

    private StudentDao studentService;

    public Collection<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    };


}
