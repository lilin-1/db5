package com.example.library.service.impl;

import com.example.library.entity.Paper;
import com.example.library.mapper.PaperMapper;
import com.example.library.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperMapper paperMapper;

    @Override
    public List<Paper> getAllPapers() {
        return paperMapper.getAllPaper();
    }

    @Override
    public Paper getPaperByName(String paperName) {
        return paperMapper.getPaperByName(paperName);
    }
}