package org.tnsif.capgemini.c2tc.oops;

public class KIA_Motors {
      int  carNum;
      String carModel;
      String carEngine;
      int carSpeed;
	
      void display()
      {
    	  System.out.println("This is KIA Motors , Welcome to our show room");
    	  
      }
	 void welcome()
	 {
		 System.out.println("Welcome");
	 }
	public static void main(String[] args) {
		KIA_Motors obj=new KIA_Motors();
		obj.display();
		obj.welcome();
		obj.carNum=12348;
		obj.carModel="KIA";
		obj.carEngine="Petrol stream";
		obj.carSpeed=70;
		System.out.println(obj.carNum);
		System.out.println(obj.carModel);
		System.out.println(obj.carEngine);
		System.out.println(obj.carSpeed);
		

	}

}