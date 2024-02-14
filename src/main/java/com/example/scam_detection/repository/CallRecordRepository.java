package com.example.scam_detection.repository;

import com.example.scam_detection.entity.CallRecord;
import com.example.scam_detection.entity.CallRecordId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallRecordRepository extends JpaRepository<CallRecord, CallRecordId> {
}
