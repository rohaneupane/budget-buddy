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
public class Expense {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;

    private Long userId;
    private Long categoryId;
    private Long budgetId;

    private BigDecimal amount;
    private String description;
    private LocalDate date;
    private String paymentMode; // UPI, CASH, CARD

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
