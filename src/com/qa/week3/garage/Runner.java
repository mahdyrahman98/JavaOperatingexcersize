package com.qa.week3.garage;

import java.awt.List;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

	Car car = new Car(1234, "audi");
	
	Motorcycle cycle = new Motorcycle(5423, "honda");
	
	Van van = new Van(5641, "ford");
	
	@SuppressWarnings("rawtypes")
	ArrayList<Vehicle> garagelist = new ArrayList();
	
	garagelist.add(car);
	garagelist.add(cycle);
	garagelist.add(van);
	
	
	TheGarage house = new TheGarage(garagelist);

	}

}
