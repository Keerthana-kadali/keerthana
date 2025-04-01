package org.tnsif.capgemini.c2tc.collection;

import java.util.HashSet;
import java.util.Set;

public class AllSetMethods {

	public static void main(String[] args) {
	Set <String> set=new HashSet<>();
	//it is an unordered collection of elements
	set.add("bananna");
	set.add("apple");
	set.add("straw berry");
	set.add("papaya");
	System.out.println(set);
	
	//removing an element 
	set.remove("papaya");
	System.out.println("after removing an element:"+set);
	
	//if the element is exits or not
	boolean hashset=set.contains("straw berry");
	System.out.println("if the element is exits or not:"+set);
	
	//size of the set
	int setsize=set.size();
	System.out.println("size of the set:"+setsize);
	
	//clear all the elements in the set
	set.clear();
	System.out.println("after clearing the elements:"+set);
	

	}

}
