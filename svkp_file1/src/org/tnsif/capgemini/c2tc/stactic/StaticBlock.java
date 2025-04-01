package org.tnsif.capgemini.c2tc.stactic;

public class StaticBlock {
     void display()
     {
    	 System.out.println("instance Block-1");
     }
static
{
	System.out.println("static Block-1");
}
static 
{
	System.out.println("static Block-2");
}

     
     public static void main(String[] args) {
    	 StaticBlock obj=new StaticBlock ();
    	 obj.display();

	}

}
