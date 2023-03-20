package com.sp.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpApplication.class, args);
	}

}
/*
     1. Same Owner will have multiple sp
     2. multiple bookings can be done by a same customer
     3. multiple bookings can be done under one swimming pool
     4. every booking required customer & swimming pool
     5. every swimming pool should belong to one owner.
     
     
 */
