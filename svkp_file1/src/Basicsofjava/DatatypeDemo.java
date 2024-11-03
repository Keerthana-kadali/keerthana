package Basicsofjava;

public class DatatypeDemo {

	public static void main(String[] args) {
	//byte - 1 byte
	byte byteMax = 100;
	byte byteMin = -100;
	System.out.println("Min range of byte is " +byteMin +" Max range of byte is " + byteMax);
	
	//short - 2 bytes
	short shortMax=12345;
	short shortMin=-12345;
	System.out.println("Min range of short is " +shortMin +" Max range of short is "+ shortMax);
	
	//int - 4bytes
	int intMax=1234567;
	int intMin=-1234567;
	System.out.println("Min range of integer is " +intMin +" Max range of integer is "+ intMax);
	
	//long - 8bytes
	long longMax=1234567890123456L;
	long longMin=-1234567890123456L;
    System.out.println("Min range of long is " +longMin +" Max range of long is " + longMax);
    
    //float - 4bytes
    float f=123.45678f;
    double d=123.4567890123456d;
    System.out.println("float value " +f +" double value "+d);
    
    //boolean - true or false
    boolean status=false;
    System.out.println("boolean value is "+ status);
    
    //char
    char c='K';
    System.out.println("char value " + c);
	
	}

}