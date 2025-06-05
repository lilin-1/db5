package com.example.library.mapper;

import com.example.library.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(String teacherId);
}