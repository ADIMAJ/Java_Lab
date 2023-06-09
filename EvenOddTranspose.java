package java_lab;

import java.util.*;

class Transpose
{
	public void override()
	{
		System.out.println("To find transpose of a matrix");                //Transpose
		int row,column,i,j;
		Scanner scan=new Scanner(System.in);
		System.out.print("\nEnter the rows of the matrix:");
		row=scan.nextInt();
		System.out.print("\nEnter the columns of the matrix:");
		column=scan.nextInt();
		
		int matrix[][]=new int[row][column];
		
		System.out.println("Enter the matrix elements:");
		for(int iter1=0;iter1<row;iter1++)
		{
			for(int iter2=0;iter2<column;iter2++)
			{
				matrix[iter1][iter2]=scan.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("The transpose of the matrix is:");
		for(i=0;i<column;i++)
		{
			for(j=0;j<row;j++)
			{
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.print("\n");
		}
	}
}

public class Evenodd_matrix extends Transpose
{
	
	public void override()
	{
		super.override();
		int size;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\nTo separate even and odd elements");               //Even and odd elements array
		System.out.print("Enter the size of the array:");
		size=scan.nextInt();
		
		int array[]=new int[size];
		System.out.println("Enter the "+size+" elements:");
		for(int iter=0;iter<size;iter++)
		{
			array[iter]=scan.nextInt();
		}
		
		int even[]=new int[size];
		int odd[]=new int[size];
		int iter,iter1=-1,iter2=-1,l=0,m=0;
		
		for(iter=0;iter<size;iter++)                      //For separating odd and even elements
		{
			if(array[iter]%2==0)
			{
				iter1=iter1+1;
				l=iter1+1;
				even[iter1]=array[iter];
			}
			else
			{
				iter2=iter2+1;
				m=iter2+1;
				odd[iter2]=array[iter];
			}
			
		}
		
		System.out.println("Even elements matrix is:");                //Printing Even elements matrix
		for(iter1=0;iter1<l;iter1++)
		{
			System.out.print(even[iter1]+"\t");
		}
		
		System.out.println("\nOdd elements matrix is:");                //Printing Odd elements matrix
		for(iter2=0;iter2<m;iter2++)
		{
			System.out.print(odd[iter2]+"\t");
		}
	}

	public static void main(String[] args) 
	{
		
		Evenodd_matrix obj=new Evenodd_matrix();
		obj.override();

	}

}
