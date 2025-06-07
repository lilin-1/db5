package com.example.library.controller;

import com.example.library.entity.Teacher;
import com.example.library.service.TeacherService;
import com.example.library.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    // 查询所有教师信息
    @GetMapping("/list")
    public Result<List<Teacher>> getAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        return Result.success(teachers);
    }

    // 根据教师编号查询教师信息
    @GetMapping("/searchById")
    public Result<Teacher> getTeacherById(@RequestParam String teacherId) {
        Teacher teacher = teacherService.getTeacherById(teacherId);
        if (teacher != null) {
            return Result.success(teacher);
        } else {
            return Result.error("未找到教师信息");
        }
    }
}