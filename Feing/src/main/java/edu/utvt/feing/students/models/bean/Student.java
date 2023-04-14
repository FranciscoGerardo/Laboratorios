package edu.utvt.feing.students.models.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@JsonSerialize(using = StudentSerial.class)
public class Student implements Serializable{
    @Serial
    private static final long serialVersionUID = 2757878754L;
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private Integer age;
    private Integer gender;
    private Date createdAt;

    public Student(){

    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getGender() {
        return gender;
    }
}
