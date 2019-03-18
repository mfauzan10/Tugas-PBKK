package com.fauzan.model;

import org.springframework.beans.factory.annotation.Value;

public class HatchbackCars implements Cars {

	@Value("${car.name}")
	private String nameCar;
	@Value("${car.year}")
	private String ReleasedYearCar;
	@Value("${car.price}")
	private int price;
	
	public HatchbackCars() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public HatchbackCars(String nameCar, String releasedYearCar, int price) {
		super();
		this.nameCar = nameCar;
		ReleasedYearCar = releasedYearCar;
		this.price = price;
	}



	public String getNameCar() {
		return nameCar;
	}



	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}



	public String getReleasedYearCar() {
		return ReleasedYearCar;
	}

	

	@Override
	public String toString() {
		return "HatchbackCars [nameCar=" + nameCar + ", ReleasedYearCar=" + ReleasedYearCar + ", price=" + price + "]";
	}



	public void setReleasedYearCar(String releasedYearCar) {
		ReleasedYearCar = releasedYearCar;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public void CarDetails() {
		System.out.println(toString());

	}

}
