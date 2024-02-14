package com.example.scam_detection.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Scammer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scammerId")
    private Long scammerId;

    @Column(name = "phone_number", nullable = false, length = 15)
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @ManyToOne(optional = false)
    @JoinColumn(name = "categoryId")
    private ScamCategory scamCategory;
}


