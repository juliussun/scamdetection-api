package com.example.scam_detection.service;

import java.util.List;

import com.example.scam_detection.entity.EmailRecord;

public interface EmailRecordService {
    List<EmailRecord> getEmailRecords();
}
