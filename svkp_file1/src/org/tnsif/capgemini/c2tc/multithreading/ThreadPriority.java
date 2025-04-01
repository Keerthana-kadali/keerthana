package org.tnsif.capgemini.c2tc.multithreading;
class Eclipse3 extends Thread
{
	public void run()
	{
		System.out.println("Eclipse id " +Thread.currentThread().getId());
	}
}
class chrome3 extends Thread
{
	public void run()
	{
		System.out.println("Chrome id " +Thread.currentThread().getId());
	}
	
}
class NotePad3 extends Thread
{
	public void run()
	{
		System.out.println("NotePad id " +Thread.currentThread().getId());
	}
	
}
public class ThreadPriority {

	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.setPriority(Thread.MAX_PRIORITY);//10
		obj.start();
		
		chrome3 obj1=new chrome3();
		obj.setPriority(Thread.NORM_PRIORITY);//5
		obj1.start();
		
		NotePad obj2=new NotePad();
		obj.setPriority(Thread.MIN_PRIORITY);//1
		obj2.start();

	}

}
