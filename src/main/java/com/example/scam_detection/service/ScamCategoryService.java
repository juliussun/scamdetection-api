package com.example.scam_detection.service;

import java.util.List;

import com.example.scam_detection.entity.ScamCategory;

public interface ScamCategoryService {
    List<ScamCategory> getCategories();
}
