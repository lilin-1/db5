package com.example.library.service.impl;

import com.example.library.entity.Student;
import com.example.library.mapper.StudentMapper;
import com.example.library.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudents() {
        return studentMapper.getAllStudents();
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return studentMapper.getStudentById(studentId);
    }
}