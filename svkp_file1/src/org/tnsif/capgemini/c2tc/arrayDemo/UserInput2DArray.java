package org.tnsif.capgemini.c2tc.arrayDemo;

import java.util.Scanner;

public class UserInput2DArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of rows: ");
		int row=scan.nextInt();
		System.out.println("enter no of columns: ");
		int col=scan.nextInt();
		int multidimentionalarray[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				multidimentionalarray[i][j]=((i+1)*(j+1));
			}
		}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++) {
					System.out.print(multidimentionalarray[i][j] + " ");
					
				}
			System.out.println();
		}
		scan.close();

	}

}
