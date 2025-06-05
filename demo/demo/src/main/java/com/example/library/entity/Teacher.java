package com.example.library.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {
    private String teacherId;
    private String department;
    private Integer teacherCategory;
    private Integer isAdvisor;
    private String position;
    private String officePhone;
    private String remarks;
    private String photoUrl;
    private Integer title;
    private Integer userId;
    private Integer degree;
    private String chineseName; // 从用户表获取的中文名
}