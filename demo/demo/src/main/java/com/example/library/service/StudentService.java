package com.example.library.service;

import com.example.library.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Integer studentId);
}