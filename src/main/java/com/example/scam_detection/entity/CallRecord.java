package com.example.scam_detection.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;


@Entity
@Table(name = "Call_record")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CallRecord {

    @EmbeddedId
    private CallRecordId id;

    @Column(name = "duration")
    private Timestamp duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "recordId", insertable = false, updatable = false)
    private Record record;

}



