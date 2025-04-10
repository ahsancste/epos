package com.ahsan.epos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_branch")
@EqualsAndHashCode(callSuper = true)
public class Branch extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id", nullable = false)
    private Long branchId;

    @Column(name = "branch_name", nullable = false)
    private String branchName;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;

    @Column(name = "is_active", nullable = false)
    private Boolean active = Boolean.FALSE;

    @Column(name = "is_archived")
    private Boolean archived = Boolean.FALSE;

    @Column(name = "serial_no")
    private Long serialNo;

    @Column(name = "outlet_open_date")
    private LocalDate outletOpenDate;

    @Column(name = "is_outlet")
    private Boolean outlet = Boolean.FALSE;

    @Column(name = "extra_message")
    private String extraMessage;

}
