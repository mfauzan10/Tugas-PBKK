package com.fauzan.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fauzan.model.Shoes;
import com.fauzan.model.SpecsShoes;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Obj.xml");
		
		Shoes shoes = context.getBean("Specs",Shoes.class);
		SpecsShoes specShoes = (SpecsShoes) shoes;
		specShoes.ShoesDetails();
		
		
		context.close();		
	}

}
