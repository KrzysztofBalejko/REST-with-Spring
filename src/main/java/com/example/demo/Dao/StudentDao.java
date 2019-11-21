package com.example.demo.Dao;

import com.example.demo.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {

        students = new HashMap<Integer, Student>(){

            {
                put(1, new Student(1, "Krzysztof", "Maths"));
                put(2, new Student(2, "Marcin", "English"));
                put(3, new Student(3, "Aga", "Biology"));
                put(4, new Student(4, "Kasia", "Maths"));
                put(5, new Student(5, "Fryc", "Maths"));
                put(6, new Student(6, "Dex", "Latin"));
            }

        };

    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    };

    public Student getStudentById(int id){
        return this.students.get(id);
    }

}
