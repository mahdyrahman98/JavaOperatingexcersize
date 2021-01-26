package com.qa.week3.garage;

public class Motorcycle extends Vehicle {
	
	int motorcycleReg = 1234;
	
	String motorcyleMake = "toyota";
	
	 Motorcycle (int reg, String type)
	{
		
		motorcycleReg = reg;
		motorcyleMake = type;
		
		Vehicle vehicle = new Vehicle();
		   
		   vehicle.carMake = type;
		
		
		
	}
	

}
