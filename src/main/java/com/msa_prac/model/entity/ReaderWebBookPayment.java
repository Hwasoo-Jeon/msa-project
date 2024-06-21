package com.msa_prac.model.entity;

import lombok.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class ReaderWebBookPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long readerWebBookPaymentId;

    private Long webBookChapterId;

    private Long readerId;

    private Integer paymentAmount;

    private LocalDateTime createdAt;


}
