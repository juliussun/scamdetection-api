package com.example.scam_detection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scam_detection.service.ScamUserService;

@RestController
@RequestMapping("/scamuser")
public class ScamUserController {

    @Autowired
    private ScamUserService scamUserService;

    @GetMapping("/byage")
    public List<List<String>> getScamUserCountGroupByAge(){
        return scamUserService.getScamUserCountGroupByAge();
    }
    
}
