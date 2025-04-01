package basicsofjava;

public class Increment_Decrement_Demo {

	public static void main(String[] args) {
     int a=20;
		
		//post increment
		System.out.println("a++  " + a++);//print first then increment 
		System.out.println("after post-increment a   "+ a); //21
		
		//pre increment
		System.out.println("++a  " + ++a);//increment first ,then prints 22
		
		//post decrement
		System.out.println("a--  " + a--);//prints first then decrement 
		System.out.println("after post decrement a   " + a); //21
		
		//pre decrement
		System.out.println("--a "+ --a);//decrement first,then prints 20
	}
}



	


