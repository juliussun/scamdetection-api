package com.example.scam_detection.controller;

import java.util.List;

import com.example.scam_detection.service.impl.RecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.scam_detection.entity.Record;
import com.example.scam_detection.service.RecordService;

@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordServiceImpl recordService;

    @GetMapping("all")
    public List<Record> getRecords(){
        return recordService.getRecords();
    }

    @GetMapping("get/{id}")
    public Record getRecordById(@PathVariable Integer id){

        return recordService.getRecordById(id);
    }
    
}
