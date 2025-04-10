package com.ahsan.epos.repository;

import com.ahsan.epos.entity.UserMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserMenuRepository extends JpaRepository<UserMenu, Long>, JpaSpecificationExecutor<UserMenu> {

}