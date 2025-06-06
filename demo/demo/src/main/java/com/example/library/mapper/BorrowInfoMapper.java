package com.example.library.mapper;
import com.example.library.entity.BorrowInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BorrowInfoMapper {
    String getStudent(String bookId);
    List<BorrowInfo> getAllInfo();
}
