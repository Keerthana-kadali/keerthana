package org.tnsif.capgimini.c2tc.lambdaexpression;

interface Drawable
{
	public void draw();
}
class Test implements Drawable
{

	@Override
	public void draw() {
		int width=10;
		System.out.println("Drawable:"+width);
		
	}
	
}
public class WithoutLambdaExpression {

	public static void main(String[] args) {
		Drawable obj=new Test();
		obj.draw();
		

	}

}
