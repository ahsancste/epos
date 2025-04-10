package com.ahsan.epos.repository;

import com.ahsan.epos.entity.StockType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StockTypeRepository extends JpaRepository<StockType, Long>, JpaSpecificationExecutor<StockType> {

}