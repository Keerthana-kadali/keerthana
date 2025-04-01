package org.tnsif.capgimini.c2tc.lambdaexpression;
@FunctionalInterface
interface sayable1
{
	public String say(String name);
}
public class LambdaExpressionWithOneParameter {

	public static void main(String[] args) {
		sayable1 obj=(name)->{
			return "hello,"+name;
			
		};
		System.out.println(obj.say("keerthana"));
	
//without paranthis
	sayable1 obj1 =name ->{
		return "hello,"+name;
		
	};
	System.out.println(obj1.say("veda vani"));

	}
}




