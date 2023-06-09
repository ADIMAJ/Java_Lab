package Java_Lab;

import java.util.*;
public class Pattern {

	public static void main(String[] args) {
			    int rows, k = 0, count = 0, count1 = 0;

			    Scanner ob=new Scanner(System.in);
			    System.out.println("Enter the number of rows:");
			    rows=ob.nextInt();
			    
			    for (int i = 1; i <= rows; i++) 
			    {
			      for (int space = 1; space <= rows - i; space++) 
			      {
			        System.out.print("  ");
			        ++count;
			      }

			      while (k != 2 * i - 1) 
			      {
			        if (count <= rows - 1) 
			        {
			          System.out.print((i + k) + " ");
			          ++count;
			        } 
			        else 
			        {
			          ++count1;
			          System.out.print((i + k - 2 * count1) + " ");
			        }

			        k++;
			      }
			      count1 = count = k = 0;

			      System.out.println();
			    }

	}

}
