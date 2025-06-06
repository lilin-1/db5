package com.example.library.entity;
import lombok.Data;
@Data
public class Paper extends Achievement{
    private String achievementId; // 研究成果编号
    private String paperName; // 论文题目
    private String authorId; // 作者学号
    private String publishYear; // 发表年份
    private String publicationName; // 发表期刊/会议名称
    private String publicationInfo; // 刊号/会议时间
    private int paperType; // 论文类型
    private String paperTitle; // 学位论文名称
    private String chineseName; // 作者姓名
}
