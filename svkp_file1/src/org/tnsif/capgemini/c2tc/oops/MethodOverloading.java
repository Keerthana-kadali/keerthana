package org.tnsif.capgemini.c2tc.oops;

class MethodOverloadingImp
{
	public int add(int a,int b) 
	{
		return a+b;
	}
	public int add(int a, int b , int c) 
	{
		return a+b+c;
	}
	public double add(int a, double b)
	{
		return a+b;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) { 
		MethodOverloadingImp obj=new MethodOverloadingImp();
		System.out.println(obj.add(9, 10));
		System.out.println(obj.add(6, 3.5));
		System.out.println(obj.add(3, 6,7));
		
		

	}

}