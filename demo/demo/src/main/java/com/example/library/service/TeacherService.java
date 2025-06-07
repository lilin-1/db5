package com.example.library.service;


import com.example.library.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(String teacherId);
}