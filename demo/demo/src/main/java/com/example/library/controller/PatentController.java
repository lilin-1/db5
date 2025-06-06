package com.example.library.controller;

import com.example.library.entity.Patent;
import com.example.library.service.PatentService;
import com.example.library.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patent")
public class PatentController {

    @Autowired
    private PatentService patentService;

    // 查询所有专利
    @GetMapping("/list")
    public Result<List<Patent>> getAllPatents() {
        List<Patent> patents = patentService.getAllPatents();
        return Result.success(patents);
    }

    // 根据专利编号查询专利
    @GetMapping("/search")
    public Result<Patent> getPatent(@RequestParam String patentId) {
        Patent patent = patentService.getPatent(patentId);
        if (patent != null) {
            return Result.success(patent);
        } else {
            return Result.error("未找到专利");
        }
    }
}