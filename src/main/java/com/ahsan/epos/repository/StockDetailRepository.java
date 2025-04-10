package com.ahsan.epos.repository;

import com.ahsan.epos.entity.StockDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StockDetailRepository extends JpaRepository<StockDetail, Long>, JpaSpecificationExecutor<StockDetail> {

}