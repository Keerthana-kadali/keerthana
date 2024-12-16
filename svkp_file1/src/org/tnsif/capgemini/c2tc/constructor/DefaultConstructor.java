package org.tnsif.capgemini.c2tc.constructor;

class Myclass1
{
	String color;
	int cost;
	String brand;
	
	//default constructor
	Myclass1()
	{
		color="Black";
		cost=50000000;
		brand="Rolls Royals";
	}
}
public class DefaultConstructor
{
	public static void main(String args[]) {
		Myclass1 obj=new Myclass1();
		System.out.println(obj.color + " "+obj.cost+ " "+obj.brand);
		
		
	}
}
	
	


