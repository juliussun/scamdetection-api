package com.example.scam_detection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgeDTO {
    public String age;
    public Long scamCount;
}
