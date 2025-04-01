package org.tnsif.capgemini.c2tc.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		//adding numbers to the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("after pushing elements in a stack:"+stack);
		
		//removing numbers to the stack
		System.out.println("removing elements from the stack :"+ stack.pop());
		
		//view the top of the element
		System.out.println("viewing the top most element from the stack :"+ stack.peek());
		
		
		//checking whether the stack is empty or not
		System.out.println("it is empty or not :"+stack.isEmpty());
		
		//searching the elements postion
		int position=stack.search(30);
		if (position!=-1)
		{
			System.out.println("element position :"+position);
		}
		else
		{
			System.out.println("element position is not found");
		}
				

	}

}
