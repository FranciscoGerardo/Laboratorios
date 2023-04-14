package edu.utvt.feing.students.controllers;

import edu.utvt.feing.students.models.bean.Student;
import edu.utvt.feing.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/microservice/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Student> findAllOther(){
        return this.service.findAll();
    }
}
