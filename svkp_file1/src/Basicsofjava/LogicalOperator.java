package Basicsofjava;

public class LogicalOperator {

	public static void main(String[] args) {
     int a=15 ,b=5,c=30;
		
		//Logical AND
		System.out.println("(a>b) && (b<c)" + ((a>b) && (b<c))); //true
		
		//Logical OR
		System.out.println("(a>b) || (b>c)" + ((a>b) || (b>c) ));//true
		
		//Logical NOT
		System.out.println("!(a>b) " + !(a>b));//false

	}

}

	


