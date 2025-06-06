package com.example.library.controller;

import com.example.library.entity.BorrowInfo;
import com.example.library.service.BorrowInfoService;
import com.example.library.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrow")
public class BorrowInfoController {

    @Autowired
    private BorrowInfoService borrowInfoService;

    // 查询所有借阅信息
    @GetMapping("/list")
    public Result<List<BorrowInfo>> getAllBorrowInfo() {
        List<BorrowInfo> borrowInfos = borrowInfoService.getAllBorrowInfo();
        return Result.success(borrowInfos);
    }

    // 根据图书编号查询借阅学生
    @GetMapping("/searchByBookId")
    public Result<String> getStudentByBookId(@RequestParam String bookId) {
        String studentName = borrowInfoService.getStudentByBookId(bookId);
        if (studentName != null) {
            return Result.success(studentName);
        } else {
            return Result.error("未找到借阅信息");
        }
    }
}