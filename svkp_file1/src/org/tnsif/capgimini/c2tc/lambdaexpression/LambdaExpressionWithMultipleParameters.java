package org.tnsif.capgimini.c2tc.lambdaexpression;
interface Addition
{
	public int add(int a,int b);
}
public class LambdaExpressionWithMultipleParameters {

	public static void main(String[] args) {
		Addition obj1=(a,b)->{
			return a+b;
		};
		System.out.println(obj1.add(12, 12));
		
		Addition obj2=(int a,int b)->{
			return (a+b);
		};
		System.out.println(obj2.add(12, 12));
		
		
		
		
		}
			
			
		

	}


