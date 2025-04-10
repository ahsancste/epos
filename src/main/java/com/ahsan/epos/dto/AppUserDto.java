package com.ahsan.epos.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.ahsan.epos.entity.AppUser}
 */
@Value
public class AppUserDto implements Serializable {
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    String createdBy;
    String updatedBy;
    Boolean isActive;
    Long userId;
    @NotNull
    String username;
    String password;
    String fullName;
    @Email
    String email;
    String mobileNumber;
    Long companyId;
    Long branchId;
    Boolean active;
    Boolean accountLocked;
    Boolean expired;
    String rawPassword;
    Boolean superAdmin;
    Boolean companyAdmin;
}