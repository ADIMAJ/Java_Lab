package Java_Lab;

import java.util.Scanner;

public class sum_matrices{

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value N");
		n = s.nextInt();
		if(n<=0)
		{
			System.out.print("Invalid Input");
		}
		else
		{
			int sum = 0;
			int i = 1;
			while(n>0)
			{
				sum += n*n;
				int temp = n*n;
				System.out.print("Number of matrix for "+ i+ '*' +i);
				System.out.println(" Matrix are " + n*n);
				n--;
				i++;
			}
			System.out.println("The number of total matrix are " + sum);
		}
	}

}
