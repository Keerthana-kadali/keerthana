package org.tnsif.capgemini.c2tc.multithreading;
class Eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse id " +Thread.currentThread().getId());
	}
}
class chrome extends Thread
{
	public void run()
	{
		System.out.println("Chrome id " +Thread.currentThread().getId());
	}
	
}
class NotePad extends Thread
{
	public void run()
	{
		System.out.println("NotePad id " +Thread.currentThread().getId());
	}
	
}
public class ExtendingThread {

	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
	obj.start();
	//chrome obj1=new chrome();
	//obj1.start();
	//NotePad obj2=new NotePad();
	//obj2.start();
	for(int i=0;i<5;i++) {
	System.out.println("main method thread id is "+Thread.currentThread().getId());

	}

}
}