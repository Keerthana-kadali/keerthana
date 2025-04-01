package org.tnsif.capgemini.c2tc.generics;
class GenerateData<T>
{
	T data;
	GenerateData(T data)
	{
		this.data=data;
	}
	public T getdata()
	{
		return data;
	}
	public void display()
	{
		System.out.println("Data Type :"+data.getClass().getSimpleName());
		System.out.println("Data :"+data);
	}
}
public class GenericClassDemo {

	public static void main(String[] args) {
		GenerateData<String> obj1=new GenerateData<String>("keerthana");
		obj1.display();

		GenerateData<Integer> obj2=new GenerateData<Integer>(1000);
		obj2.display();
		
		GenerateData<String> obj3=new GenerateData<String>("veda vani");
		obj3.display();
		
		GenerateData<Integer> obj4=new GenerateData<Integer>(500000);
		obj4.display();
	}

}
