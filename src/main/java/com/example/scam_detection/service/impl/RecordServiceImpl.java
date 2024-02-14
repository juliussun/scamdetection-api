package com.example.scam_detection.service.impl;

import com.example.scam_detection.entity.Record;
import com.example.scam_detection.repository.RecrordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RecordServiceImpl  {

    @Autowired
    private RecrordRepository recordRepository;

    public List<Record> getRecords(){
        return recordRepository.findAll();
    }

    public Record getRecordById(Integer id){
        Record record = recordRepository.findById(id).orElseThrow(
                ()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Record with id "+id+" not found"));
        return record;
    }
    
}
