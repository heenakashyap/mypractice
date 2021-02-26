package com.example.crud1.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "John",
                        "hikk@gmail.com",
                        "kirtii",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21

                )

        );
    }
}