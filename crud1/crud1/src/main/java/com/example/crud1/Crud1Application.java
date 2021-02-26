package com.example.crud1;

import com.example.crud1.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
// @RestController
public class Crud1Application {

	public static void main(String[] args) {

		SpringApplication.run(Crud1Application.class, args);
	}

	//@GetMapping
	/*public String hello(){
		return "kirti";
	}*/

	/*public List<String> hello(){
		return List.of("kirti","kashyap");
	}*/

	/*@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"John",
						"hikk@gmail.com",
						"kirtii",
						LocalDate.of(2000, Month.JANUARY,5),
						21

				)

		);
	}*/
}
