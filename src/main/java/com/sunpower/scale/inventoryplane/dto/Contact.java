package com.sunpower.scale.inventoryplane.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
}
