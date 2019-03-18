package com.fauzan.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fauzan.model.Cars;
import com.fauzan.model.CarsConfig;
import com.fauzan.model.SuvCars;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarsConfig.class);
		
		Cars car = context.getBean("cars1",Cars.class);
		SuvCars suvCar = (SuvCars) car;
		suvCar.CarDetails();
		
	}

}
