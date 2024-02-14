package com.example.scam_detection.repository;

import com.example.scam_detection.entity.ScamCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScamCategoryRepository extends JpaRepository<ScamCategory,Long> {
    ScamCategory findByType(String type);
}
