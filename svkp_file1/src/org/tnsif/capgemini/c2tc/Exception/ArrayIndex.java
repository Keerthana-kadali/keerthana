package org.tnsif.capgemini.c2tc.Exception;

public class ArrayIndex {

	public static void main(String[] args) {
		int arr[]=new int[5]; 
		try
		{
			int i=arr[10];
			  System.out.println(i);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("whatever happen this line gets executed");
		}
		  
	}
}



	


