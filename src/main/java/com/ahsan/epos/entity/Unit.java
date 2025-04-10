package com.ahsan.epos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_unit")
@EqualsAndHashCode(callSuper = true)
public class Unit extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_id", nullable = false)
    private Long unitId;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "unit_name", nullable = false)
    private String unitName;

    @Column(name = "unit_code", nullable = false)
    private String unitCode;

    @Column(name = "conversion_factor")
    private BigDecimal conversionFactor;

    @Column(name = "is_active")
    private Boolean active = Boolean.FALSE;

}
