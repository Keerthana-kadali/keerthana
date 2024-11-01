package Basicsofjava;

public class VariablesDemo {
	int id=2351024;
	void print()
	{
		String msg="Hii";
		System.out.println(msg);
	}
	static String message="I AM KEERTHANA";

	public static void main(String[] args) {
		VariablesDemo obj=new VariablesDemo();
		System.out.println(obj.id);
		obj.print();
		System.out.println(message);

	}

}
