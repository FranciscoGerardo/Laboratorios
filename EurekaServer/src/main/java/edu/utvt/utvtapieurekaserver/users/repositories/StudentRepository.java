package edu.utvt.EurekaServer.users.repositories;

import edu.utvt.EurekaServer.users.models.Student;
import edu.utvt.EurekaServer.users.models.dto.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public Optional<StudentDto> findByName(String name);

    public List<StudentDto> findByNameContaining(String name);
}