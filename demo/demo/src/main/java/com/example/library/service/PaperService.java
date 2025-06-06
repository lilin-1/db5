package com.example.library.service;

import com.example.library.entity.Paper;

import java.util.List;

public interface PaperService {
    List<Paper> getAllPapers();
    Paper getPaperByName(String paperName);
}