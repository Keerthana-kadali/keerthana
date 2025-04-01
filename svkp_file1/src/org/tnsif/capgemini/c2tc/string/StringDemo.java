package org.tnsif.capgemini.c2tc.string;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Hello World";
		String s3="Greethings";//string variable stores in string pool
		String s4=new String("Greethings");//string variable object stores in heap memory
		String s5="Hello World";
		if(s3==s4) {
			System.out.println("Reference pointing to the same object");
			
		}
		else
		{
			System.out.println("Reference poining to the different object");
		}

	}

}
