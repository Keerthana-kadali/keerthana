package org.tnsif.capgemini.c2tc.arrayDemo;

public class single2Darray {

	public static void main(String[] args) {
		int array[][]= {{2,3},{4,5}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
