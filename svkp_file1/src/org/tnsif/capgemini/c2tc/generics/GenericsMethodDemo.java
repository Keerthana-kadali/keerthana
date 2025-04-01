package org.tnsif.capgemini.c2tc.generics;

public class GenericsMethodDemo {
	
	public static <T> void display(T[] array)
	{
		for(T elements:array) {
		System.out.print(elements+ " ");
		
		}
	}

	public static void main(String[] args) {
		
		Integer[] intarray= {1,2,3,4,5,6,7,};
		System.out.println("Integer Arraya :");
		display(intarray);
		
		String[] strarray= {"apple","bananna","pine apple"};
		System.out.println("String Array:");
		display( strarray);
		
		Double[] douarray= {1.22,1.333,1.4444};
		System.out.println("Double Array:");
		display(douarray);
		
	

	}

}
