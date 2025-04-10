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
@Table(name = "t_company")
@EqualsAndHashCode(callSuper = true)
public class Company extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "currency")
    private String currency;

    @Column(name = "business_type")
    private String businessType;

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

    @Column(name = "vat_registration_no")
    private String vatRegistrationNo;

    @Column(name = "is_active", nullable = false)
    private Boolean active = Boolean.FALSE;

    @Column(name = "is_archived")
    private Boolean archived = Boolean.FALSE;

    @Column(name = "serial_no")
    private Long serialNo;

    @Column(name = "financial_year_start")
    private LocalDate financialYearStart;

    @Column(name = "financial_year_end")
    private LocalDate financialYearEnd;

}
