package edu.utvt.EurekaServer.users.services.implementation;


import edu.utvt.EurekaServer.users.models.Student;
import edu.utvt.EurekaServer.users.models.dto.StudentDto;
import edu.utvt.EurekaServer.users.repositories.StudentRepository;
import edu.utvt.EurekaServer.users.services.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImplement implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }

    @Transactional
    public Optional<Student> findById(Long id) {
        return this.studentRepository.findById(id);
    }

    @Transactional
    public Student save(Student student) {
        return this.studentRepository.saveAndFlush(student);
    }

    @Transactional
    public void deleteById(Long id) {
        this.studentRepository.deleteById(id);
    }

    @Transactional
    public Student update(Long id, Student data) {
        Optional<Student> student = null;
        student = this.studentRepository.findById(id);

        if (student.isPresent()) {
            student.get().setName(data.getName());
            student.get().setLastname(data.getLastname());
            student.get().setEmail(data.getEmail());
            student.get().setGender(data.getGender());
            student.get().setAge(data.getAge());
            this.studentRepository.save(student.get());
        }

        return student.orElseThrow();
    }

    @Transactional
    public Optional<StudentDto> findByName(String name) {
        return this.studentRepository.findByName(name);
    }

    @Transactional
    public List<StudentDto> findByNameContaining(String name) {
        return this.studentRepository.findByNameContaining(name);
    }
}
