package com.example.scam_detection.repository;

import com.example.scam_detection.entity.Scammer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ScammerRepository extends JpaRepository<Scammer, Integer> {
}
