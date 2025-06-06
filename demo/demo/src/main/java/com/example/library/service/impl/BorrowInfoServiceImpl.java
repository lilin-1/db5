package com.example.library.service.impl;

import com.example.library.entity.BorrowInfo;
import com.example.library.mapper.BorrowInfoMapper;
import com.example.library.service.BorrowInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowInfoServiceImpl implements BorrowInfoService {

    @Autowired
    private BorrowInfoMapper borrowInfoMapper;

    @Override
    public String getStudentByBookId(String bookId) {
        return borrowInfoMapper.getStudent(bookId);
    }

    @Override
    public List<BorrowInfo> getAllBorrowInfo() {
        return borrowInfoMapper.getAllInfo();
    }
}