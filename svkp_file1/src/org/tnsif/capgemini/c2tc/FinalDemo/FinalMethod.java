package org.tnsif.capgemini.c2tc.FinalDemo;

class cal
{
	public final void show()
	{
		System.out.println("AI integration done by vedavani");
		
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}
class advcalc extends cal
{
	public void show1()
	{
		System.out.println("AI integration done by keerthana");
		
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		advcalc obj=new advcalc();
		obj.show1();
		obj.add(10, 5);

	}

}