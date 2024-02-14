package com.example.scam_detection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scam_detection.entity.EmailRecord;
import com.example.scam_detection.service.EmailRecordService;

@RestController
@RequestMapping("/emailrecord")
public class EmailRecordController {

    @Autowired
    private EmailRecordService emailRecordService;

    @GetMapping("/all")
    public List<EmailRecord> getEmailRecords(){
        return emailRecordService.getEmailRecords();
    }
    
}
