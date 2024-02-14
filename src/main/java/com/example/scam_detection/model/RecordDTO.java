package com.example.scam_detection.model;

import com.example.scam_detection.entity.Record;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Data
@AllArgsConstructor@NoArgsConstructor
@Builder
public class RecordDTO {
    public Record record;
    public String type;
    public String content;
    public Timestamp duration;
    public String lostResource;

}
