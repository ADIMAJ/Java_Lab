package Java_Lab;

import java.util.Scanner;



public class Lexi{
	
	public void lexi(String Arr[])
	{
		for(int i = 0; i < 5; ++i) 
		{
			for (int j = i + 1; j < 5; ++j) 
			{
				if (Arr[i].compareTo(Arr[j]) > 0) 
				{
					String temp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
				}
			}
		}
		System.out.println("The 5 elements are ");
		for(int i=0;i<5;i++)
		{
			System.out.print(" "+ Arr[i]+" ");
		}
	}

	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		String Arr[]=new String[5];
		System.out.println("Enter 5 element");
		for(int i=0;i<5;i++)
		{
			Arr[i]=sc.next();
		}
	
		Lexi obj=new Lexi();

		obj.lexi(Arr);
		sc.close();
	}

}
