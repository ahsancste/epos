package com.ahsan.epos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_stock_detail")
@EqualsAndHashCode(callSuper = true)
public class StockDetail extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_detail_id", nullable = false)
    private Long stockDetailId;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "stock_date", nullable = false)
    private LocalDateTime stockDate;

    @Column(name = "item_id", nullable = false)
    private Long itemId;

    @Column(name = "branch_id", nullable = false)
    private Long branchId;

    @Column(name = "in_quantity", nullable = false)
    private BigDecimal inQuantity = BigDecimal.ZERO;

    @Column(name = "out_quantity", nullable = false)
    private BigDecimal outQuantity = BigDecimal.ZERO;

    @Column(name = "in_unit_price")
    private BigDecimal inUnitPrice;

    @Column(name = "out_unit_price")
    private BigDecimal outUnitPrice;

    @Column(name = "stock_type_id")
    private Long stockTypeId;

    @Column(name = "is_active")
    private Boolean active = Boolean.FALSE;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "reference_no")
    private String referenceNo;

    @Column(name = "is_export")
    private Boolean export;

    @Column(name = "exported_by")
    private String exportedBy;

    @Column(name = "export_date")
    private LocalDateTime exportDate;

    @Column(name = "cost_price")
    private BigDecimal costPrice;

    @Column(name = "stock_master_id")
    private Long stockMasterId;

}
