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
public class WriterWebBookPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long writerWebBookPayment;

    private Long webBookChapterId;

    private Long readerWebBookPaymentId;

    private Integer paymentAmount;

    private boolean isWithdraw; //default = false;

    private LocalDateTime createdAt;

}
