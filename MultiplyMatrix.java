import java.util.Scanner;

public class matrixmulti {
	
	public static void main(String[] args) {
		//MATRIX MULTIPLICATION
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size (1)");
		int r1 = sc.nextInt();
		System.out.println("enter column size (1)");
		int c1 = sc.nextInt();
		int m1[][]= new int[r1][c1];
		int i,j;
		int k;
		System.out.println("enter the elements (1)");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter row size (2)");
		int r2 = sc.nextInt();
		System.out.println("enter column size (2)");
		int c2 = sc.nextInt();
		int m2[][]= new int[r2][c2];
		System.out.println("enter the elements (2)");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		
	if(c1==r2)
	{
		int s[][] = new int[r1][c2];
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				s[i][j]=0;
				for(k=0;k<c1;k++)
				{
					s[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		System.out.println("Answer = \n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(s[i][j]+ " ");
			}			
			System.out.println();
		}
		
	}
	else
	{
		System.out.println("Cannot multiply");
	}

}
}
