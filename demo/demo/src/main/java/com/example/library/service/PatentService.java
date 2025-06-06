package com.example.library.service;

import com.example.library.entity.Patent;

import java.util.List;

public interface PatentService {
    List<Patent> getAllPatents();
    Patent getPatent(String patentId);
}