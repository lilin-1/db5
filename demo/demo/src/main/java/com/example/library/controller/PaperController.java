package com.example.library.controller;

import com.example.library.entity.Paper;
import com.example.library.service.PaperService;
import com.example.library.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paper")
public class PaperController {

    @Autowired
    private PaperService paperService;

    // 查询所有论文
    @GetMapping("/list")
    public Result<List<Paper>> getAllPapers() {
        List<Paper> papers = paperService.getAllPapers();
        return Result.success(papers);
    }

    // 根据论文名称查询论文
    @GetMapping("/search")
    public Result<Paper> getPaperByName(@RequestParam String paperName) {
        Paper paper = paperService.getPaperByName(paperName);
        if (paper != null) {
            return Result.success(paper);
        } else {
            return Result.error("未找到论文");
        }
    }
}