package org.tnsif.capgimini.c2tc.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
interface names{
	public void dispaly();
}
public class LambdaExpressionForEachLoop {

	public static void main(String[] args) {
		List<String> obj=new ArrayList<String>();
		obj.add("keerthana");
		obj.add("veda vani");
		obj.add("Drakshayani");
		obj.add("Prasanna");
		obj.add("Leela");
		obj.forEach(
				(n)->System.out.println(n));
		
		

	}

}
