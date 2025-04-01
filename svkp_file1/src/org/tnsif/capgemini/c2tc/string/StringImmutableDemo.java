package org.tnsif.capgemini.c2tc.string;

public class StringImmutableDemo {

	public static void main(String[] args) {
	String s1="Hello World";
	String s2=s1;
	
	 s1="World Hello";
	System.out.println("S1 " + s1);
	System.out.println("s2 " + s2);                  

	}

}
