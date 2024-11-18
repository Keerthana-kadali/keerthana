package org.tnsif.capgemini.c2tc.oops;

public class Abstraction {

	public static void main(String[] args) {
		RohithDemo obj=new RameshDemo();
		obj.calling();
		obj.phoneSystem();
		obj.MicrosoftTeams();
		obj.HealthMontoring();
	}

}
abstract class RohithDemo{    
	public void calling() 
	{
		System.out.println("calling");
	}
	
	public abstract void phoneSystem();
	public abstract void MicrosoftTeams();
	public abstract void HealthMontoring();
	
}

abstract class SureshDemo extends RohithDemo
{
	public void phoneSystem()
	{
		System.out.println("Phone is integrated with phoneSystem ");
	}
	
}

class RameshDemo extends SureshDemo                 
{
	public void MicrosoftTeams() {
		System.out.println("Phone is integrated with MicrosoftTeams ");
		
	}
	public void HealthMontoring() {
		System.out.println("Phone is integrated with HealthMontoring");
		
	}
	
}