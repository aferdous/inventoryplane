package com.sunpower.scale.inventoryplane.events;

import com.sunpower.scale.inventoryplane.dto.InventoryMovementRecord;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class InventoryMovedEvent {
        String name ;
        LocalDateTime timeStamp;
        InventoryMovementRecord data;
}
