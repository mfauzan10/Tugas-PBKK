package com.fauzan.model;

public class DoorCars implements CarsInfo {
	
	private int doorCar;
	
	public DoorCars() {
		// TODO Auto-generated constructor stub
	}

	public int getDoorCar() {
		return doorCar;
	}
	
	public DoorCars(int doorCar) {
		super();
		this.doorCar = doorCar;
	}


	public void setDoorCar(int doorCar) {
		this.doorCar = doorCar;
	}

	

	@Override
	public String toString() {
		return "DoorCars [doorCar=" + doorCar + "]";
	}

	@Override
	public void CarInformation() {
		// TODO Auto-generated method stub
		System.out.println(doorCar);
	}

}
