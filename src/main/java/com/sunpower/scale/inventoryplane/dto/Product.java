package com.sunpower.scale.inventoryplane.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    String sku; // a global identifier across all the systems
    String name;
    String description;

}
