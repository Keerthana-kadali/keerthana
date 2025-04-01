package org.tnsif.capgemini.c2tc.stactic;

public class StaticVariable {

	String name;
	double price;
	public static String catagory="smart phone";
 StaticVariable(String name,double price){
		this.name=name;
		this.price=price;
	}
	 public void display()
	{
		System.out.println("name "+name);
		System.out.println("price "+price);
		System.out.println("catagory "+catagory);
	}
	
	public static void main(String[] args) {
		StaticVariable obj=new StaticVariable ("realme",15000);
		StaticVariable obj1=new StaticVariable ("0pp0",35000);
System.out.println("mobile 1 information");
obj.display();
System.out.println("mobile 2 information");
obj1.display();
	}

}
