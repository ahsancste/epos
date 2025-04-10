package com.ahsan.epos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_menu")
@EqualsAndHashCode(callSuper = true)
public class Menu extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id", nullable = false)
    private Long menuId;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "menu_name", nullable = false)
    private String menuName;

    @Column(name = "description")
    private String description;

    @Column(name = "menu_level")
    private Long menuLevel;

    @Column(name = "parent_menu_id")
    private Long parentMenuId;

    @Column(name = "url_path")
    private String urlPath;

    @Column(name = "icon")
    private String icon;

    @Column(name = "sort_order")
    private Long sortOrder = 0L;

    @Column(name = "is_active", nullable = false)
    private Boolean active = Boolean.FALSE;

    @Column(name = "version")
    private Long version = 1L;

}
