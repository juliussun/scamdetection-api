package com.example.scam_detection.repository;

import com.example.scam_detection.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecrordRepository extends JpaRepository<Record,Integer> {
}
