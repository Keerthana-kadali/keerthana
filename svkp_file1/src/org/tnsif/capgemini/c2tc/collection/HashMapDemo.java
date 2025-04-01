package org.tnsif.capgemini.c2tc.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		//adding elements
		map.put("keerthana", 90);
		map.put("veda vani", 80);
		map.put("drakshayani", 10);
		map.put("leela", 50);
		map.put("prasanna", 100);
		System.out.println(map);
		
		//removing elements
		map.remove("leela");
		System.out.println("after removing an element:"+map);
		
		//updating the value
		map.put("keerthana",95);
		System.out.println("after updating the value:"+map);
		
		//the value is exists or not
		boolean hashvalue=map.containsValue(100);
		System.out.println("the value is exists or not:"+hashvalue);
		
		//the key is exists or not
		boolean hashkey=map.containsKey("drakshayani");
		System.out.println("the key is exists or not:"+hashkey);
		
		//size of the key value pair
	     int hashmap=map.size();
	     System.out.println("the size of the key value pair:"+hashmap);
	     
	     //clear all the key value pairs
	     map.clear();
	     System.out.println(map);
		
		
	}

}