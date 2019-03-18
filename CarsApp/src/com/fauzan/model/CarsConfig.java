package com.fauzan.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarsConfig {
	
	@Bean
	public CarsInfo doorCars() {
		return new DoorCars();
	}
	
	@Bean("cars1")
	public Cars suvCars() {
		SuvCars suvCar = new SuvCars(doorCars());
		
		return suvCar;
	}
	
}
