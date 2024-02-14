package com.example.scam_detection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scam_detection.entity.CallRecord;
import com.example.scam_detection.service.CallRecordService;

@RestController
@RequestMapping("/callrecord")
public class CallRecordController {

    @Autowired
    private CallRecordService callRecordService;

    @GetMapping("/all")
    public List<CallRecord> getCallRecords(){
        return callRecordService.getCallRecords();
    }
    
}
