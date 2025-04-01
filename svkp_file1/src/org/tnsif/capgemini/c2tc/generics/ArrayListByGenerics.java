package org.tnsif.capgemini.c2tc.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListByGenerics {

	public static void main(String[] args) {
	List<String> obj=new ArrayList<String>();
	obj.add("abc");
//	obj.add(new Integer(5)); compile time error,no typecating and no classcast exception

	}

}
