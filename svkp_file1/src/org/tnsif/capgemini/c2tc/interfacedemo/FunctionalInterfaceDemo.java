package org.tnsif.capgemini.c2tc.interfacedemo;

class Greetings implements FunctionalInterface1
{

	@Override
	public void SayHello(String name) {
		System.out.println("hello " +name+ " ! ");
		
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		FunctionalInterface1 obj=new Greetings ();
		obj.SayHello("keerthana");

	}

}
