package org.tnsif.capgemini.c2tc.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	List list=new ArrayList();
	list.add("abc");
	list.add(new Integer(5));
	for(Object obj:list)
	{
		System.out.println(obj);
		String str=(String) obj;
	}

	}

}
