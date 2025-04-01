package org.tnsif.capgemini.c2tc.collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	//orederd collection of elements , null values access and there is no duplicate values
			Set<String> set=new LinkedHashSet<>();
			set.add("bananna");
			set.add("Straw berray");
			set.add("apple");
			set.add("pin apple");
			set.add("bananna");
			set.add(null);
			System.out.println(set);

	}

}
