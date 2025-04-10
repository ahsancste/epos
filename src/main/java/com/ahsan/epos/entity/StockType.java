package com.ahsan.epos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_stock_type")
@EqualsAndHashCode(callSuper = true)
public class StockType extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_type_id", nullable = false)
    private Long stockTypeId;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "stock_type_name", nullable = false)
    private String stockTypeName;

    @Column(name = "description")
    private String description;

    @Column(name = "is_active")
    private Boolean active = Boolean.FALSE;

}
