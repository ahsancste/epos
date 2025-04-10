package com.ahsan.epos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_user_menu")
@EqualsAndHashCode(callSuper = true)
public class UserMenu extends BaseEntity implements Serializable {


    @Id
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Id
    @Column(name = "menu_id", nullable = false)
    private Long menuId;

    @Column(name = "can_view")
    private Boolean canView = Boolean.FALSE;

    @Column(name = "can_add")
    private Boolean canAdd = Boolean.FALSE;

    @Column(name = "can_edit")
    private Boolean canEdit = Boolean.FALSE;

    @Column(name = "can_delete")
    private Boolean canDelete = Boolean.FALSE;

    @Column(name = "is_active")
    private Boolean active = Boolean.FALSE;

}
