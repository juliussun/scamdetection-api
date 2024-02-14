package com.example.scam_detection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scam_detection.entity.CallRecord;
import com.example.scam_detection.repository.CallRecordRepository;
import com.example.scam_detection.service.CallRecordService;

@Service
public class CallRecordServiceImpl implements CallRecordService{

    @Autowired
    private CallRecordRepository callRecordRepository;

    @Override
    public List<CallRecord> getCallRecords(){
        return callRecordRepository.findAll();
    }
    
}
