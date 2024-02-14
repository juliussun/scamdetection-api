package com.example.scam_detection.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Scams")
public class Scam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scamId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "scammerId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    private Scammer scammer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    private User user;

    private String lostResource;

    private LocalDateTime time;
}



