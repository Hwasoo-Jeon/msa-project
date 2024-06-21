package com.msa_prac.model.entity;

import lombok.*;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long readerId;

    private String name;

    private LocalDateTime createdAt;
}
