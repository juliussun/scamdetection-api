package com.example.scam_detection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scam_detection.entity.Scam;
import com.example.scam_detection.repository.ScamRepository;
import com.example.scam_detection.service.ScamService;

@Service
public class ScamServiceImpl implements ScamService {

    @Autowired
    private ScamRepository scamRepository;

    @Override
    public List<Scam> getScams(){
        return scamRepository.findAll();
    }


}
