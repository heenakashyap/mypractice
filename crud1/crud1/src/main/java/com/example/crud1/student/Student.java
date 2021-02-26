package com.example.crud1.student;

import java.time.LocalDate;

public class Student {

    private Long id;
    private String name;
    private String lastname;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(Long id, String name, String lastname, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String lastname, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.dob = dob;
        this.age = age;
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

    public LocalDate getDob() {
        return dob;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
