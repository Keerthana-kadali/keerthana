package org.tnsif.capgimini.c2tc.lambdaexpression;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SPCLambdaExpression {

	public static void main(String[] args) {
		//Supplier no input but prints value
		Supplier<String> supplier=()->"hii how are you";
		String suppliervalue=supplier.get();
		System.out.println(suppliervalue);
		
		//predicate it takes one input and returns boolean value
         Predicate<Integer> isEven=(number)->number%2==0;
         int testnumber=10;
         if(isEven.test(testnumber)) {
        	 System.out.println(testnumber + " is even");
         }
         else
         {
        	 System.out.println(testnumber + " is not even");
         }
         
         //consumer it takes one input and returns nothing
         Consumer<String> consumer=(message)->System.out.println("consumer recieved:"+message);
        consumer.accept("this message is recievsd");
       
			
		}

	}


