package com.fauzan.model;

public class SinteticLeatherShoesOrigin implements ShoesOrigin {
	final String origin="Sintetic Leather";
	
	public SinteticLeatherShoesOrigin() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "SinteticLeatherShoesOrigin [origin=" + origin + "]";
	}

	@Override
	public void MaterialofShoes() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}
}