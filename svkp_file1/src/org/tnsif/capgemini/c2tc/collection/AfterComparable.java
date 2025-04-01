package org.tnsif.capgemini.c2tc.collection;

import java.util.ArrayList;
import java.util.Collections;

class person1 implements Comparable<person1>
{
	String name;
	int age;
	public person1(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	
	 void displayinfo()
	{
		System.out.println("Name: "+ name + " Age:"+age);
	}

	@Override
	public int compareTo(person1 others) {
		return this.age-others.age;
	}
	
}
public class AfterComparable {

	public static void main(String[] args) {
		ArrayList<person1> persons=new ArrayList<>();
        persons.add(new person1("keerthana",21));
        persons.add(new person1("veda vani",22));
        persons.add(new person1("drakshayani",15));
       Collections.sort(persons);
       for(person1 people:persons) {
    	   people.displayinfo(); 
       }
  
      
		 

	}

}
