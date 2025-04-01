package org.tnsif.capgimini.c2tc.lambdaexpression;
interface Drawable1
{
	public void draw(); 
}
public class WithLambdaExpression {

	public static void main(String[] args) {
		 Drawable1 obj=()->{
			 int width=10;
			 System.out.println("Drawable :"+width);
		 };
		 obj.draw();


	}

}
