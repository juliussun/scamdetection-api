package com.example.scam_detection.repository;

import com.example.scam_detection.entity.Scam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScamRepository extends JpaRepository<Scam,Long> {
}
