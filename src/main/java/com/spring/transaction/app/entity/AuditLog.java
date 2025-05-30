package com.spring.transaction.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditId;
    private Long orderId;
    private String action;
    private LocalDateTime timestamp;

    public AuditLog() {
        this.timestamp = LocalDateTime.now();  // Default timestamp is the current time
    }

    public AuditLog(Long orderId, String action, LocalDateTime timestamp) {
        this.orderId = orderId;
        this.action = action;
        this.timestamp = timestamp;
    }

}
