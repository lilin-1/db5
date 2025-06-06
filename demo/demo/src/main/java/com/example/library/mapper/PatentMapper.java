package com.example.library.mapper;
import com.example.library.entity.Patent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatentMapper {
    List<Patent> getAllPatent();
    Patent getPatent(String patentId);

}
