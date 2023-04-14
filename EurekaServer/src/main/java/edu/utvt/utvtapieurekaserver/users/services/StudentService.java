package edu.utvt.EurekaServer.users.services;


import edu.utvt.EurekaServer.users.models.Student;
import edu.utvt.EurekaServer.users.models.dto.StudentDto;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public List<Student> findAll();

    @Transactional
    Optional<Student> findById(Long id);

    public Student save(Student student);

    public void deleteById(Long id);

    public Student update(Long id, Student data);

    public Optional<StudentDto> findByName(String name);

    public List<StudentDto> findByNameContaining(String name);
}
