package com.example.scam_detection.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CallRecordId implements Serializable {

    @Column(name = "recordId")
    private Long recordId;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

}

