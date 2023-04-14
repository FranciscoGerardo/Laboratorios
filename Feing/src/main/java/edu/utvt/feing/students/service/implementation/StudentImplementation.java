package edu.utvt.feing.students.service.implementation;


import edu.utvt.feing.students.models.bean.Student;
import edu.utvt.feing.students.service.StudentService;
import edu.utvt.feing.students.service.feing.StudentsServiceFeing;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImplementation implements StudentService {
    private final StudentsServiceFeing studentsServiceFeing;

    public StudentImplementation(StudentsServiceFeing studentsServiceFeing) {
        this.studentsServiceFeing = studentsServiceFeing;
    }

    @Override
    public List<Student> findAll(){
        return this.studentsServiceFeing.findAll();
    }
}
