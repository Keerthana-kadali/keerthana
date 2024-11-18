package org.tnsif.capgemini.c2tc.oops;
class Human1
{
	private int age;
	private String name;
	
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void setName(String b) {
		name = b;
	}

	public String getName() {
		return name;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Human1 obj=new Human1();
		obj.setAge(21);
		obj.setName("keerthana");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		obj.setAge(22);
		obj.setName("drakshyani");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	
	}

}