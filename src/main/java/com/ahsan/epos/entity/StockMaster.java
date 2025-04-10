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
@Table(name = "t_stock_master")
@EqualsAndHashCode(callSuper = true)
public class StockMaster extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_master_id", nullable = false)
    private Long stockMasterId ;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "item_id", nullable = false)
    private Long itemId;

    @Column(name = "branch_id", nullable = false)
    private Long branchId;

    @Column(name = "stock_quantity", nullable = false)
    private BigDecimal stockQuantity = BigDecimal.ZERO;

    @Column(name = "is_active")
    private Boolean active = Boolean.FALSE;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "is_export")
    private Boolean export;

    @Column(name = "exported_by")
    private String exportedBy;

    @Column(name = "export_date")
    private LocalDateTime exportDate;

    @Column(name = "is_show")
    private Boolean show;

}
