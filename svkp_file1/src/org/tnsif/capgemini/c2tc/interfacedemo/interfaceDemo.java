package org.tnsif.capgemini.c2tc.interfacedemo;

public class interfaceDemo {

	public static void main(String[] args) {
	VehicleDemo Car=new CarDemo("toyota corolla");
	VehicleDemo bike=new BikeDemo("Mountain Bike");
	
	Car.start();
	Car.stop();
	
	bike.start();
	bike.stop();
	System.out.println("maximum speed for Vehical " + VehicleDemo.max_speed);
	
	

	}

}
