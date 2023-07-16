package com.sunpower.scale.inventoryplane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class InventoryplaneApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryplaneApplication.class, args);
	}

}
