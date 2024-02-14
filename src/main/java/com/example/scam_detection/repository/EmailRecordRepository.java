package com.example.scam_detection.repository;

import com.example.scam_detection.entity.EmailRecord;
import com.example.scam_detection.entity.EmailRecordId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRecordRepository extends JpaRepository<EmailRecord, EmailRecordId> {
}
