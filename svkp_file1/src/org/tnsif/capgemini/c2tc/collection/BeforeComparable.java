package org.tnsif.capgemini.c2tc.collection;
class person
{
	String name;
	int age;
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void display()
	{
		System.out.println("Name: "+ name + " Age:"+age);
	}
}
public class BeforeComparable {

	public static void main(String[] args) {
		person obj1=new person("keerthana",21);
		person obj2=new person("vani veda",22);
		person obj3=new person("drakshayani",15);
		
		obj1.display();
		obj2.display();
		obj3.display();
		

	}

}
