package com.example.library.mapper;
import com.example.library.entity.Paper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaperMapper {
    List<Paper> getAllPaper();
    Paper getPaperByName(String paperName);
}
