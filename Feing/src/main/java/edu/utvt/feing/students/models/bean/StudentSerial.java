package edu.utvt.feing.students.models.bean;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class StudentSerial extends JsonSerializer<Student> {
    @Override
    public void serialize(Student student, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        gen.writeNumberField("id", student.getId());
        gen.writeStringField("name", student.getName());
        gen.writeStringField("lastname", student.getLastname());
        gen.writeNumberField("age", student.getAge());
        gen.writeNumberField("gender", student.getGender());
        gen.writeEndObject(); 
    }
}
