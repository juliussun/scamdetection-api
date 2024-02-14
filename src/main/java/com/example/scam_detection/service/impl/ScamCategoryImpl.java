package com.example.scam_detection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scam_detection.entity.ScamCategory;
import com.example.scam_detection.repository.ScamCategoryRepository;
import com.example.scam_detection.service.ScamCategoryService;

@Service
public class ScamCategoryImpl implements ScamCategoryService {

    @Autowired
    private ScamCategoryRepository scamCategoryRepository;

    @Override
    public List<ScamCategory> getCategories(){
        return scamCategoryRepository.findAll();
    }
    
}
