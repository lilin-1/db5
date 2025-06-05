package com.example.library.entity;

import lombok.Data;
import java.util.Date;
@Data
public class Book {
    private String bookId; // 图书编号
    private String author; // 作者
    private int currentLocation; // 现在何处
    private Date publishDate; // 出版年月
    private String bookName; // 图书名称


}