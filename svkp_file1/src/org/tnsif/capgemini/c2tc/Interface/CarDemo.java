package org.tnsif.capgemini.c2tc.Interface;

public class CarDemo implements VehicleDemo{
private String model;
public CarDemo(String model)
{
	this.model=model;
}


	@Override
	public void start() {
		
		System.out.println("car" + model + "is starting");
	}

	@Override
	public void stop() {
		System.out.println("car" +model + " is stoping");
		
		
	}

	
}
