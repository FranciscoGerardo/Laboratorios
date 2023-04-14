package edu.utvt.EurekaServer.users.controllers;

import edu.utvt.EurekaServer.users.models.Student;
import edu.utvt.EurekaServer.users.models.dto.StudentDto;
import edu.utvt.EurekaServer.users.services.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok().body(studentService.findAll());
    }

    @GetMapping("/all")
    public List<Student> findAllOther() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> get(@PathVariable("id") Long id) {
        return ResponseEntity.of(this.studentService.findById(id));
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
        return ResponseEntity.created(null).body(this.studentService.update(id, student));
    }

    @PostMapping("/create")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        System.out.println(student.getName());
        return ResponseEntity.created(null).body(this.studentService.save(student));
    }

    @GetMapping("/find")
    public ResponseEntity<StudentDto> find(@RequestParam String name) {
        return ResponseEntity.of(this.studentService.findByName(name));
    }

    @GetMapping("/findContainName")
    public List<StudentDto> findContain(@RequestParam String name) {
        return this.studentService.findByNameContaining(name);
    }

}
