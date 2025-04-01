package org.tnsif.capgemini.c2tc.arrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		//static instilization when you konw the values
		int num[]= {5,2,7,9,3};
		System.out.println(num[0]);
		System.out.println(num[4]);
		System.out.println(num[3]);
		System.out.println();
		
		//Dynamic instilization when you Dont know the values
		int nums[]=new int[5];
		nums[0]=2;
		nums[1]=3;
		nums[2]=4;
	    nums[3]=8;
		nums[4]=9;
		
		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		//System.out.println(nums[2]);
		//System.out.println(nums[3]);
		//System.out.println(nums[4]);
		int i;
		for(i=0;i<=4;i++)
		{
			System.out.println(nums[i]);
		}
		
	}

}
