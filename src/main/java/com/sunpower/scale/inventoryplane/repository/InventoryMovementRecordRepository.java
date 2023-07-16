package com.sunpower.scale.inventoryplane.repository;

import com.sunpower.scale.inventoryplane.entity.InventoryMovementRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryMovementRecordRepository extends JpaRepository<InventoryMovementRecordEntity, Long> {
    public List<InventoryMovementRecordEntity> findByProcessed(boolean processed);
}
