package com.myldz.student.app.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController //veri tabanı sorgularını işleme ve sonuçları RESTful servisler aracılığıyla döndürmek gerekiyorsa
//Eğer bir web sayfası sunmanız gerekiyorsa @Controller
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired  //gerekli dependencyleri otomatik yerleştirir
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();

    }
}
