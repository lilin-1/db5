package com.example.library.service.impl;

import com.example.library.entity.Patent;
import com.example.library.mapper.PatentMapper;
import com.example.library.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatentServiceImpl implements PatentService {

    @Autowired
    private PatentMapper patentMapper;

    @Override
    public List<Patent> getAllPatents() {
        return patentMapper.getAllPatent();
    }

    @Override
    public Patent getPatent(String patentId) {
        return patentMapper.getPatent(patentId);
    }
}