package com.example.library.mapper;

import com.example.library.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> getAllStudents();
    Student getStudentById(Integer studentId);
}