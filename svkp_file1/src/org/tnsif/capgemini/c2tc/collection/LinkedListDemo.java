package org.tnsif.capgemini.c2tc.collection;

import java.util.LinkedList;

import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> car=new LinkedList<>();
		car.add("Toyato");
		car.add("BMW");
		car.add("Audio");
		car.add("Tesla");
		car.add("BMW");
		
		//access the Specific car 
		System.out.println("car :"+ car.get(2));
		
		//remove the specific car
		 car.remove(4);
		
		//modification of specific car
		car.set(3, "TATA");
		
		// a specific car is contained or not
		if(car.contains("toyoto"))
		{
			System.out.println("car contains toyoto");
		}
		//print all the elements
		for(String cars:car)
		{
			System.out.println(cars);
		}
		//get the size of the linked list
		System.out.println("no of cars :"+car.size());
		
		//to clear ALL the elements
         car.clear();
		System.out.println("all the elements are clear:"+car);
		

	}

}
