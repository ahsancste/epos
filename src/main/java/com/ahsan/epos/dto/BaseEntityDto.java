package com.ahsan.epos.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.ahsan.epos.entity.BaseEntity}
 */
@Value
public class BaseEntityDto implements Serializable {
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    String createdBy;
    String updatedBy;
    Boolean isActive;
}