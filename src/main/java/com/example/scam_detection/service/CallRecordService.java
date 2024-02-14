package com.example.scam_detection.service;

import java.util.List;

import com.example.scam_detection.entity.CallRecord;

public interface CallRecordService {
    List<CallRecord> getCallRecords();
}
