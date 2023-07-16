package com.sunpower.scale.inventoryplane.entity;

import com.sunpower.scale.inventoryplane.dto.MovementType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "t_inventory_movement_records")
@Data
@Builder

public class InventoryMovementRecordEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private Long id;
    private String warehouseId;
    private LocalDateTime movementTimeStamp;
    private MovementType movementType;
    private String sku;
    private Double quantityMoved;
    private boolean processed;
}
