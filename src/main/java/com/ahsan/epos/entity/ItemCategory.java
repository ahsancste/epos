package com.ahsan.epos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_item_category")
@EqualsAndHashCode(callSuper = true)
public class ItemCategory extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", nullable = false)
    private Long categoryId;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "category_name", nullable = false)
    private String categoryName;

    @Column(name = "description")
    private String description;

    @Column(name = "parent_category_id")
    private Long parentCategoryId;

    @Column(name = "sort_order")
    private Long sortOrder = 0L;

    @Column(name = "is_active")
    private Boolean active = Boolean.FALSE;

}
