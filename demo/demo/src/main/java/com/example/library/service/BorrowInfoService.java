package com.example.library.service;

import com.example.library.entity.BorrowInfo;

import java.util.List;

public interface BorrowInfoService {
    String getStudentByBookId(String bookId);
    List<BorrowInfo> getAllBorrowInfo();
}