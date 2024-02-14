package com.example.scam_detection.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Email_record")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EmailRecord {

    @EmbeddedId
    @Column(name = "record_id")
    private EmailRecordId id;

    @Column(name = "content", length = 50)
    private String content;

    @ManyToOne
    @JoinColumn(name = "recordId", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    private Record record;

}

