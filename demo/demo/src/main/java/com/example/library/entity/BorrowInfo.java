package com.example.library.entity;

import java.util.Date;
import lombok.Data;
@Data
public class BorrowInfo {
    private String recordId; // 借阅日志编号
    private String bookId; // 图书编号
    private int userId; // 借阅用户编号
    private int status; // 状态
    private Date requestTime; // 请求时间
    private Date borrowTime; // 实际借出时间
    private Date returnTime; // 实际归还时间
    private String chineseName; // 借阅人
}