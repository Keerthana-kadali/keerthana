package org.tnsif.capgimini.c2tc.lambdaexpression;
interface sayable
{
	public String say();
}
public class LambdaExpressionWithNoParameter {

	public static void main(String[] args) {
		sayable obj=()->{
			return "hii guys good morning.";
			
		};
		System.out.println(obj.say());
		}
		

	}


