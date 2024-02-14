package com.example.scam_detection.controller;

import com.example.scam_detection.entity.Scam;
import com.example.scam_detection.model.AgeDTO;
import com.example.scam_detection.model.AgeGroupDTO;
import com.example.scam_detection.model.RecordDTO;
import com.example.scam_detection.service.RecordService;
import com.example.scam_detection.service.ScamService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/scam")
public class ScamController {

    @Autowired
    private RecordService recordService;

    @Autowired
    private ScamService scamService;

    @PostMapping("/save")
    @Transactional
    public ResponseEntity<?> saveScamRecord(@RequestBody RecordDTO record){
        try{
            return ResponseEntity.ok(recordService.saveRecord(record));
        } catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }


    @GetMapping("/age")
    public List<AgeDTO> getAgeList(){
        return recordService.ageDTOList();
    }


    @GetMapping("/all")
    public List<Scam> getScams(){
        return scamService.getScams();
    }

    @GetMapping("/scamStats")
    public Map<String, Integer> getScamCounts(@RequestBody  AgeGroupDTO ageGroupDTO){
        System.out.println(ageGroupDTO);
        return recordService.getScamStats(ageGroupDTO);
    }
}
