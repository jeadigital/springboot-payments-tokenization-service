package com.jea.payments.token.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Token {
    @Id
    private String token;
    private Long cardId; // Links to the original card data
    private LocalDateTime createdDate;
    // Getters and setters
}
