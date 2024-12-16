package org.tnsif.capgemini.c2tc.Interface;

public class MarkerDemo {

	public static void main(String[] args) {
		Registrable s=new Student(123,"keerthana",50000,"MCA");
		Registrable s1=new Student(124,"vani",30000,"MBA");
		Object obj=new Object();
		if(obj instanceof Registrable)
			System.out.println("student is registered for course");
		else
			System.out.println("student is not registered for course");
			
			
		

	}

}
