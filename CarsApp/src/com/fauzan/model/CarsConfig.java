package com.fauzan.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:JosCar")
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
	
	@Bean
	public Cars hatchbackCars() {
		HatchbackCars hatchCar = new HatchbackCars();
		
		return hatchCar;
	}
	
}
