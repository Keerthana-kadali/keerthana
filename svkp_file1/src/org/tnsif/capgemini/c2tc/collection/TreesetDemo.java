package org.tnsif.capgemini.c2tc.collection;
import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		//it has ascending order and similar to hashset
		Set<String> set=new TreeSet<>();
		set.add("bananna");
		set.add("straw berray");
		set.add("apple");
		set.add("pin apple");
		set.add("bananna");
		
		System.out.println(set);

	}

}
