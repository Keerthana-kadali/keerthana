package org.tnsif.capgemini.c2tc.generics;

import java.util.Arrays;
import java.util.List;

class Animal8
{
	public void makesound()
	{
		System.out.println("animal make sound");
	}
	class Dog8 extends Animal8
	{
		public void makesound()
		{
			System.out.println("barks");
		}
		class cat8 extends Animal8
		{
			public void makesound()
			{
				System.out.println("meow");
			}
	}
	}
}
public class UpperBounded {
	
public static void displayanimal(List<? extends Animal8> animal) {
	for(Animal8 animal1 :animal) 
	{
	animal1.makesound();
	}
}
	public static void main(String[] args) {
	//	List<Dog8> dogs=Arrays.asList(new Dog8());
	//	List<cat8> cats=Arrays.asList(new cat8());
		
	//	displayanimal(dogs);
	//	displayanimal(cats);
	}
	

	}

