package com.example.library.service.impl;

import com.example.library.entity.Teacher;
import com.example.library.mapper.TeacherMapper;
import com.example.library.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherMapper.getAllTeachers();
    }

    @Override
    public Teacher getTeacherById(String teacherId) {
        return teacherMapper.getTeacherById(teacherId);
    }
}