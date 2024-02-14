package com.example.scam_detection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scam_detection.entity.ScamCategory;
import com.example.scam_detection.service.ScamCategoryService;

@RestController
@RequestMapping("/scamcategory")
public class ScamCategoryController {

    @Autowired
    private ScamCategoryService scamCategoryService;

    @GetMapping("/all")
    public List<ScamCategory> getCategories(){
        return scamCategoryService.getCategories();
    }
    
}
