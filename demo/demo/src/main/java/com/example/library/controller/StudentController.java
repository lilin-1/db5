package com.example.library.controller;

import com.example.library.entity.Student;
import com.example.library.service.StudentService;
import com.example.library.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 查询所有学生信息
    @GetMapping("/list")
    public Result<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return Result.success(students);
    }

    // 根据学生编号查询学生信息
    @GetMapping("/searchById")
    public Result<Student> getStudentById(@RequestParam Integer studentId) {
        Student student = studentService.getStudentById(studentId);
        if (student != null) {
            return Result.success(student);
        } else {
            return Result.error("未找到学生信息");
        }
    }
}