package com.sunpower.scale.inventoryplane.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    private String streetNumber;
    private String streetName;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
