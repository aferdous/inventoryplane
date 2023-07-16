package com.sunpower.scale.inventoryplane.service;

import com.sunpower.scale.inventoryplane.entity.InventoryMovementRecordEntity;
import com.sunpower.scale.inventoryplane.repository.InventoryMovementRecordRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class ProcessInventoryMovementRecords {
    private final InventoryMovementRecordRepository repository;

    /**
     * Runs at regular interval to process unprocessed events.
     */
    @Scheduled(fixedDelay = 1000)
    public void processInventoryMovementRecords(){
        List<InventoryMovementRecordEntity> listToProcess = repository.findByProcessed(false);
        if (listToProcess.size() > 0) {
            log.info("ProcessInventoryMovementRecords : processing {} records ", listToProcess.size());
        }
        listToProcess.stream().forEach((entity)-> {
            //TODO: Send message to the ERP system.
            entity.setProcessed(true);
            repository.save(entity);
    });
    }
}
