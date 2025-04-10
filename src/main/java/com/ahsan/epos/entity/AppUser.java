package com.ahsan.epos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_user")
@EqualsAndHashCode(callSuper = true)
public class AppUser extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "branch_id")
    private Long branchId;

    @Column(name = "is_active")
    private Boolean active = Boolean.FALSE;

    @Column(name = "is_account_locked")
    private Boolean accountLocked = Boolean.FALSE;

    @Column(name = "is_expired")
    private Boolean expired = Boolean.FALSE;

    @Column(name = "raw_password")
    private String rawPassword;

    @Column(name = "is_super_admin")
    private Boolean superAdmin;

    @Column(name = "is_company_admin")
    private Boolean companyAdmin;

}
