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
@Table(name = "t_item")
@EqualsAndHashCode(callSuper = true)
public class Item extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id", nullable = false)
    private Long itemId;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "barcode", nullable = false)
    private String barcode;

    @Column(name = "barcode_label", nullable = false)
    private String barcodeLabel;

    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Column(name = "item_type")
    private String itemType;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "buyer_id", nullable = false)
    private Long buyerId;

    @Column(name = "unit_id", nullable = false)
    private Long unitId;

    @Column(name = "hsn_code")
    private String hsnCode;

    @Column(name = "sku_code")
    private String skuCode;

    @Column(name = "weight")
    private BigDecimal weight;

    @Column(name = "latest_cost_price")
    private BigDecimal latestCostPrice;

    @Column(name = "sales_tax", nullable = false)
    private BigDecimal salesTax;

    @Column(name = "vat", nullable = false)
    private BigDecimal vat;

    @Column(name = "unit_price_pos", nullable = false)
    private BigDecimal unitPricePos;

    @Column(name = "unit_price_web", nullable = false)
    private BigDecimal unitPriceWeb;

    @Column(name = "is_show_ecom", nullable = false)
    private Boolean showEcom;

    @Column(name = "serial_no", nullable = false)
    private Long serialNo;

    @Column(name = "is_active", nullable = false)
    private Boolean active;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "token_no")
    private String tokenNo;

    @Column(name = "version")
    private Long version = 1L;

    @Column(name = "is_exceptional_item")
    private Boolean exceptionalItem;

    @Column(name = "category_id")
    private Long categoryId;

}
