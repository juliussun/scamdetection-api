package com.example.scam_detection.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmailRecordId implements Serializable {

    @Column(name = "recordId")
    private Long recordId;

    @Column(name = "email", length = 30)
    private String email;

}
