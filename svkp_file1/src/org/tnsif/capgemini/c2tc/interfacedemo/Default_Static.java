package org.tnsif.capgemini.c2tc.interfacedemo;
interface vehicle1
{
	void start();
	void stop();
	int max_speed=120;
	default void repair()
	{
		System.out.println("vehicle is been reparid");
	}

    static void checkmaintance()
{
	System.out.println("vehicle maintanace is done");
}
    }
class car1 implements vehicle1
{
	private String model;
	car1(String model)
	{
		this.model=model;
	}

@Override
	public void start() {
	System.out.println("car"+ model +" is starting" );
}
		
	@Override
	public void stop() {
		System.out.println("car"+ model +" is stopping" );
	}		
	}

public class Default_Static {

	public static void main(String[] args) {
		vehicle1 obj=new car1("BMW");
		obj.stop();
		System.out.println("max_speed of the vehical"+ vehicle1.max_speed);

	}

}
