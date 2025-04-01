package org.tnsif.capgemini.c2tc.collection;

import java.util.List;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) throws InterruptedException {
		//Thread-1
	
		List<Integer> numbers=new Vector<>();
		
		Thread thread1=new Thread( ()->{ 
		for(int i=1;i<5;i++)
		{
			numbers.add(i);
			System.out.println(i);
		}
		});
//Thread-2
		Thread thread2=new Thread( ()->{ 
		for(int i=1;i<5;i++)
		{
			if(!numbers.isEmpty())
			{
				System.out.println("Thread-2 removed :"+numbers.remove(0));
			}
		}
	});
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread1.join();
	System.out.println("the numbers lefted in the vector:"+numbers);

}
}