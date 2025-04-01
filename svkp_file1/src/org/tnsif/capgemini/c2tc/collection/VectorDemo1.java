package org.tnsif.capgemini.c2tc.collection;

import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		List<Integer> numbers=new Vector<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		//access the specified number
		System.out.println("number :"+numbers.get(2));
		
		//modify the specific number
		numbers.set(1,25);
		
		//remove the specific number
		numbers.remove(3);
		
		//print all the numbers
		for(Integer numb:numbers)
		{
			System.out.println(numb);
		}
		
		//checking whethere the number is exists or not
		if(numbers.contains(30))
		{
			System.out.println("the number is existed in it");
		}
		
		//the size of the numbers
		numbers.size();
		System.out.println(numbers);
		
		//to clear all the elements
		numbers.clear();
		System.out.println("after using clear operation :"+numbers);
		}
		

	}


