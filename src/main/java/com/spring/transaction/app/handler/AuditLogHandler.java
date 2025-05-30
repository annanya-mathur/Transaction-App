package com.spring.transaction.app.handler;

import com.spring.transaction.app.entity.AuditLog;
import com.spring.transaction.app.entity.Order;
import com.spring.transaction.app.repository.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Component
public class AuditLogHandler {

    @Autowired
    private AuditLogRepository auditLogRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void AuditLogDetails(Order order, String action)
    {
        AuditLog auditLog = new AuditLog(Long.valueOf(order.getOrderID()), action, LocalDateTime.now());
        auditLogRepository.save(auditLog);

    }
}
