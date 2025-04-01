package org.tnsif.capgemini.c2tc.stactic;

class StaticDemo
{
	public static int square(int number)
	{
		return number*number;
	}
	public static int cubic(int a,int b,int c)
	{
		return a*b*c;
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		int result =StaticDemo.square(5);
		int result1= StaticDemo.cubic(2,3,2);
		 System.out.println("square : " +result);
		 System.out.println("cubic : " +result1);
	}

}
