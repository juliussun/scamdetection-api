package com.example.scam_detection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scam_detection.entity.Scammer;
import com.example.scam_detection.repository.ScammerRepository;
import com.example.scam_detection.service.ScammerService;

@Service
public class ScammerServiceImpl implements ScammerService{

    @Autowired
    private ScammerRepository scammerRepository;

    @Override
    public List<Scammer> getScammers(){
        return scammerRepository.findAll();
    }
    
}
