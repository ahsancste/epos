package com.ahsan.epos.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.ahsan.epos.entity.AuditLog}
 */
@Value
public class AuditLogDto implements Serializable {
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    String createdBy;
    String updatedBy;
    Boolean isActive;
    Long auditId;
    Long userId;
    Long companyId;
    String action;
    LocalDateTime logTime;
    String ipAddress;
    String deviceName;
    String deviceType;
    Boolean success;

}