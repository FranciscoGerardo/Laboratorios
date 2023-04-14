package edu.utvt.feing.students.service.feing;

import edu.utvt.feing.students.models.bean.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "student-api")
public interface StudentsServiceFeing {
    @GetMapping("/api/students/all")
    public List<Student> findAll();

    @GetMapping("/api/students/{id}")
    public ResponseEntity<Student> findById();

}
