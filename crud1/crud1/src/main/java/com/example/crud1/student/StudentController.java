package com.example.crud1.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {


    // @GetMapping
   /* public List<Student> hello(){
        return List.of(
                new Student(
                        1L,
                        "John",
                        "hikk@gmail.com",
                        "kirtii",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21

                )

        );*/


    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

}
