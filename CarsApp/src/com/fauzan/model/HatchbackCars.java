package com.fauzan.model;

public class HatchbackCars implements Cars {

	
	private String nameCar;
	private String ReleasedYearCar;
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
		// TODO Auto-generated method stub

	}

}
