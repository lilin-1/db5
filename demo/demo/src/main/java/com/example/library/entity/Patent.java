package com.example.library.entity;
import lombok.Data;

import java.util.Date;
@Data
public class Patent extends Achievement {
    private String achievementId; // 研究成果编号
    private String patentId; // 专利申请号
    private String inventionName; // 发明名称
    private String chineseName; // 当前申请人（专利权人）
    private String inventionType; // 专利类型
    private Date applicationDate; // 申请日
    private Date authorizationDate; // 授权日
    private String author; // 发明人
    private int state; // 状态
}