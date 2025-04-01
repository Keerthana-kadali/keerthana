package org.tnsif.capgemini.c2tc.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
//unorderd coolection & no dublicate values 
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("bananna");
		set.add("Straw berray");
		set.add("apple");
		set.add("pin apple");
		set.add("bananna");
		System.out.println(set);
		

	}

}
