package com.example.library.entity;
import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private Integer studentId;
    private Integer studentCategory;
    private Date enrollmentDate;
    private String advisor;
    private String coAdvisor;
    private String remarks;
    private String photoUrl;
    private Integer status;
    private Integer userId;
    private Integer grade;
    private String fullTimeInformation;
    private String chineseName;
}