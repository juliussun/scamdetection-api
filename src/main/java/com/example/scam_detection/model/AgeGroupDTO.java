package com.example.scam_detection.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AgeGroupDTO {
    public int minAge;
    public int maxAge;
}
