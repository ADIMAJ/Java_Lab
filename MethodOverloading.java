package java_lab;
import java.util.*;
public class Methodoverloading {
	
	public int overload(int[] array,int size,int sum)
	{
		for(int iter=0;iter<size;iter++)
		{
			sum+=array[iter];
		}
		return sum;
	}
	
	public void overload(int[] array,int size)
	{
		System.out.println("\nThe array is printed without the elements repeating:");
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if (array[i] == array[j])
                {
                    array[j]=array[size-1];
                    size--;
                    j--;
                }
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+"\t");
		}
	}

	public static void main(String[] args) {
		int size,res,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size=scan.nextInt();
		
		int array[]=new int[size];
		System.out.println("Enter the elements of the array:");
		for(int iter=0;iter<size;iter++)
		{
			array[iter]=scan.nextInt();
		}
		
		Methodoverloading obj=new Methodoverloading();
		
		res=obj.overload(array, size,sum);                            //Calling method overload to find sum of array elements
		System.out.println("\nThe sum of array elements is "+res);
		
		obj.overload(array, size);                              //Calling method overload to delete duplicate elements

	}

}
