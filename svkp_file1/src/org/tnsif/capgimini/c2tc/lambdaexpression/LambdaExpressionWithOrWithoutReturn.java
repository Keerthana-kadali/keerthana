package org.tnsif.capgimini.c2tc.lambdaexpression;
interface Addition1
{
	int add(int a,int b);
}
public class LambdaExpressionWithOrWithoutReturn {

	public static void main(String[] args) {
		Addition1 obj1=(a,b)->{
		return (a+b);
		};
		System.out.println(obj1.add(12, 12));

		Addition1 obj2=(a,b)->(a+b);
				System.out.println(obj2.add(12, 12));
			
		}
	}


