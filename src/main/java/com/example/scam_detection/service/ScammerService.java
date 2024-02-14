package com.example.scam_detection.service;

import java.util.List;

import com.example.scam_detection.entity.Scammer;

public interface ScammerService {
    List<Scammer> getScammers();
}
