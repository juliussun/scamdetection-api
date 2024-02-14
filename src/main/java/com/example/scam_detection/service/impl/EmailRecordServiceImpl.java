package com.example.scam_detection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scam_detection.entity.EmailRecord;
import com.example.scam_detection.repository.EmailRecordRepository;
import com.example.scam_detection.service.EmailRecordService;

@Service
public class EmailRecordServiceImpl implements EmailRecordService{

    @Autowired
    private EmailRecordRepository emailRecordRepository;

    @Override
    public List<EmailRecord> getEmailRecords(){
        return emailRecordRepository.findAll();
    }    
}
