package com.ahsan.epos.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.ahsan.epos.entity.Branch}
 */
@Value
public class BranchDto implements Serializable {
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    String createdBy;
    String updatedBy;
    Boolean isActive;
    Long branchId;
    String branchName;
    Long companyId;
    String address1;
    String address2;
    String postalCode;
    String phoneNumber;
    String mobileNumber;
    String email;
    String website;
    Boolean active;
    Boolean archived;
    Long serialNo;
    LocalDate outletOpenDate;
    Boolean outlet;
    String extraMessage;
}