package org.tnsif.capgemini.c2tc.multithreading;
class Sleep extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++) {
		System.out.println("sleep id is " +Thread.currentThread().getId());
	try
	{
		sleep(1000);
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
}
}
public class SleepThread {

	public static void main(String[] args) {
		Sleep obj=new Sleep();
		obj.start();

	}

}
