package org.tnsif.capgemini.c2tc.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> pd=new PriorityQueue<>();
		pd.add(10);
		pd.add(30);
		pd.add(2);
		pd.add(7);
		pd.add(90);
		
		System.out.println(pd);
		System.out.println(pd.poll());
		System.out.println(pd);
		System.out.println(pd.poll());
		System.out.println(pd);
		System.out.println(pd.poll());
		System.out.println(pd);
		System.out.println(pd.poll());


		

	}

}
