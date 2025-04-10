package com.ahsan.epos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_buyer")
@EqualsAndHashCode(callSuper = true)
public class Buyer extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buyer_id", nullable = false)
    private Long buyerId;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "buyer_name", nullable = false)
    private String buyerName;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "contact_person")
    private String contactPerson;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "gst_number")
    private String gstNumber;

    @Column(name = "pan_number")
    private String panNumber;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country = "'India'::text";

    @Column(name = "notes")
    private String notes;

    @Column(name = "is_active", nullable = false)
    private Boolean active = Boolean.FALSE;

    @Column(name = "version")
    private Long version = 1L;

}
