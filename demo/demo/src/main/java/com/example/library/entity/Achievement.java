package com.example.library.entity;

import lombok.Data;
@Data
public class Achievement {
    protected String achievementId; // 研究成果编号
    private int category; // 类型
    private int subcategory; // 子类

}