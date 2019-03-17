package com.fauzan.model;

public class ReebokShoes implements Shoes {
	
	final static String BrandsShoes="Reebok";
	private String KindofShoes;
	private int size;
	private String Colour;
	
	public ReebokShoes() {
		// TODO Auto-generated constructor stub
	}

	public ReebokShoes(String kindofShoes, int size, String colour) {
		super();
		KindofShoes = kindofShoes;
		this.size = size;
		Colour = colour;
	}

	public String getKindofShoes() {
		return KindofShoes;
	}

	public void setKindofShoes(String kindofShoes) {
		KindofShoes = kindofShoes;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}
	
	@Override
	public void ShoesDetails() {
		// TODO Auto-generated method stub

	}
	
	
}
