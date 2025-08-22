package com.budgetbuddy.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Budget {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long budgetId;

    private Long userId;
    private Long categoryId;

    private BigDecimal limitAmount;
    private LocalDate startDate;
    private LocalDate endDate;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
