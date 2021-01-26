package com.qa.week3.garage;

public class Car extends Vehicle {
	
	public int carReg = 2010;
	public String carMake = "ford";
	
   Car(int reg, String type)
	{
	   
		carReg = reg;
		carMake = type;
		
		
	
   
   
   Vehicle vehicle = new Vehicle(type, reg);
   
   vehicle.carMake = type;
	}
}