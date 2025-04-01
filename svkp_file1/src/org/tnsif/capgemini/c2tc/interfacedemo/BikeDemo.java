package org.tnsif.capgemini.c2tc.interfacedemo;

public class BikeDemo implements VehicleDemo {
	private String type;
	public BikeDemo(String type)
	{
		this.type=type;
	}
	
	
	@Override
	public void start() {
		System.out.println("bike"+ type + "is starting");
		
	}

	@Override
	public void stop() {
		
		System.out.println("bike"+ type + "is stoping");
	}


		

	}


