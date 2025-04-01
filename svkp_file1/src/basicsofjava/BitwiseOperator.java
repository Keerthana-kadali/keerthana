package basicsofjava;

public class BitwiseOperator {

	public static void main(String[] args) {
        int a = 6; 
        int b = 4;  

        // Bitwise AND
        System.out.println("a & b: " + (a & b));  

        // Bitwise OR
        System.out.println("a | b: " + (a | b)); 

        // Bitwise XOR 
        System.out.println("a ^ b: " + (a ^ b)); 

        // Bitwise NOT
        System.out.println("~a: " + (~a)); 

        // Left shift
        System.out.println("a << 2: " + (a << 2));  
    
        // Right shift
        System.out.println("a >> 2: " + (a >> 2));  
        
    }

	}


