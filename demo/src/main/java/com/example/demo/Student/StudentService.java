//This is the Service layer
package com.example.demo.Student;

import java.time.*;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> getStudentDetails() {
        return List.of(new Student(100, "kishore", LocalDate.of(2002, Month.FEBRUARY, 9), 20));
    }

}
