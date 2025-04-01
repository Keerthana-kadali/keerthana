package org.tnsif.capgemini.c2tc.generics;

import java.util.List;

public class UnboundedWildCards {
	
	public static void display(List<?> list)
	{
		for(Object elements:list)
		{
			System.out.println(elements + " ");
		}
	}
		public static void main(String[] args) {
			List<Integer> obj1=List.of(1,2,3,4,5,6);
			System.out.println("List Integer:");
			display(obj1);
			
			List<String>obj2=List.of("apple","bananna","pine apple");
			System.out.println("List String:");
			display(obj2);
			
			
			
		}
	}

