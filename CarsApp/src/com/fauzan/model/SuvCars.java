package com.fauzan.model;

public class SuvCars implements Cars {

	private String nameCar;
	private String ReleasedYearCar;
	private int price;
	
	private CarsInfo doorCar;
	
	public SuvCars(CarsInfo doorCar) {
		super();
		this.doorCar = doorCar;
	}


	public SuvCars() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SuvCars(String nameCar, String releasedYearCar, int price) {
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

	
	

	@Override
	public String toString() {
		return "SuvCars [nameCar=" + nameCar + ", ReleasedYearCar=" + ReleasedYearCar + ", price=" + price
				+ ", doorCar=" + doorCar + "]";
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
		System.out.println(toString());
	}

}
