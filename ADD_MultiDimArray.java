package java_lab;

import java.util.*;
public class Add_multidim_array 
{
	public void sum(int[][] array1,int[][] array2,int m,int n)
	{
		int res[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				res[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		System.out.println("Matrix after addition is:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(res[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) 
	{
		int rows,columns;
		Scanner object=new Scanner(System.in);
		
		System.out.print("\nEnter the rows of the matrix:");
		rows=object.nextInt();
		System.out.print("\nEnter the columns of the matrix:");
		columns=object.nextInt();
		
		int array1[][]=new int[rows][columns];
		int array2[][]=new int[rows][columns];
		
		System.out.println("Enter the array1 elements:");
		for(int iter1=0;iter1<rows;iter1++)
		{
			for(int iter2=0;iter2<columns;iter2++)
			{
				array1[iter1][iter2]=object.nextInt();
			}
		}
		
		System.out.println("Enter the array2 elements:");
		for(int iter1=0;iter1<rows;iter1++)
		{
			for(int iter2=0;iter2<columns;iter2++)
			{
				array2[iter1][iter2]=object.nextInt();
			}
		}
		
		Add_multidim_array add=new Add_multidim_array();
		add.sum(array1,array2,rows,columns);

	}

}
