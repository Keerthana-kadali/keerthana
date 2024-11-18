package org.tnsif.capgemini.c2tc.oops;
class Vehicles
{
	void move()
	{
		System.out.println("The vehicles moves");
	}
	
}

class Car extends Vehicles
{
	@Override
	void move()
	{
		System.out.println("The car drives");
	}
	
}
class Bicycle extends Vehicles
{
	void move()
	{
		System.out.println("The bicycle pedals");
	}
}
class Airplane extends Vehicles
{
	void move()
	{
		System.out.println("The airplane flies");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
	 Vehicles obj=new Vehicles();
	 obj=new Vehicles();
	 obj.move();
	 obj=new Car();
	 obj.move();
	 obj=new Bicycle();
	 obj.move();
	 obj=new Airplane();
	 obj.move();

	}

}