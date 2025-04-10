package com.ahsan.epos.repository;

import com.ahsan.epos.entity.StockMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StockMasterRepository extends JpaRepository<StockMaster, Long>, JpaSpecificationExecutor<StockMaster> {

}