package org.tnsif.capgemini.c2tc.arrayDemo;

public class JaggedArray {

	public static void main(String[] args) {
		//syntax for jagged array
	int [][]studentInGrads=new int[3][];
	//we have create a sub array here
	studentInGrads[0]=new int[2];
    studentInGrads[1]=new int[3];
	studentInGrads[2]=new int[1];
	//now we have to instilize the values
	studentInGrads[0][0]=10;//grade 1 student 1
	studentInGrads[0][1]=20;//grade 1 student 2
	
	studentInGrads[1][0]=30;//grade 2 student 1
	studentInGrads[1][1]=40;//grade 2 student 2
	studentInGrads[1][2]=50;//grade 2 student 3
	
	studentInGrads[2][0]=60;//grade 3 student 1
	
	for(int i=0;i<studentInGrads.length;i++) {
		for(int j=0;j<studentInGrads[i].length;j++) {
			System.out.println("Grade "+ (i+1)+"sudent "+ (j+1) +":"+studentInGrads[i][j]);
		}
	}


	
	
			

	}

}
