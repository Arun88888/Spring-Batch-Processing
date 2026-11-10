package com.arun.batch.config;

import com.arun.batch.model.Student;
import lombok.NonNull;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(@NonNull Student student) {
        //Business logic will place here
        student.setId(null);
        return student;
    }
}
