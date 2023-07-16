package com.sunpower.scale.inventoryplane.service;

import com.sunpower.scale.inventoryplane.dto.InventoryMovementRecord;
import com.sunpower.scale.inventoryplane.entity.InventoryMovementRecordEntity;
import com.sunpower.scale.inventoryplane.events.InventoryMovedEvent;
import com.sunpower.scale.inventoryplane.repository.InventoryMovementRecordRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor

@Transactional
public class InventoryMovementListener {

    private final InventoryMovementRecordRepository repository;

    /**
     * Listens to kafka stream for InventoryMovedEvent.
     * @param event incoming event
     */
    @KafkaListener (topics = "InventoryMovedEvent" , groupId = "InventoryMoved" , concurrency = "16")
    public void handleInventoryMovement(InventoryMovedEvent event){
      log.info("Received event {}", event);

      InventoryMovementRecordEntity entity = dtoToEntity(event.getData());
      entity.setProcessed(false);
      repository.save(entity);

      log.info("Save entity {}", entity);
    }

    private InventoryMovementRecordEntity dtoToEntity(InventoryMovementRecord dto){
       return InventoryMovementRecordEntity.builder()
                .sku(dto.getSku())
                .movementType(dto.getMovementType())
                .movementTimeStamp(dto.getMovementTimeStamp())
                .quantityMoved(dto.getQuantityMoved())
                .warehouseId(dto.getWarehouseId())
                .build();
    }
}
