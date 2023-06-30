package Java_Lab;

import java.util.*;
public class Employee 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int empID[]= {1001,1002,1003,1004,1005};
		String[] empname= {"Mahesh","Pavan","Varun","Suyog","Vineeth"};
		String[] date= {"01/01/2003","11/02/2004","19/03/2003","20/5/2003","07/07/2003"};
		char empcode[]= {'m','c','e','r','k'};
		String dept[]= {"Engg","PM","R&d","Front desk","acct"};
		double basic[]= {50000,30000,20000,12000,10000};
		double[] HRA= {20000,12000,8000,6000,8000};
		double[] IT= {20000,9000,3000,2000,1000};
		
		char[] desigcode= {'e','c','m','r','k'};
		String[] designation= {"Engineer","Consultant","Manager","Receptionist","Clerk"};
		double[] DA={20000,32000,40000,15000,12000};
		
		System.out.println("Enter the employee ID:");
		int id=sc.nextInt();
		int flag=0;
		double salary=0;
		for(int i=0;i<empID.length;i++)
		{
			if(id==empID[i])
			{
				flag=1;
				System.out.println("Emp ID:" + empID[i]);
				System.out.println("Emp name:" + empname[i]);
				System.out.println("Department:" + dept[i]);
				switch(empcode[i])
				{
					case 'e':System.out.println("Designation: Engineer");
						System.out.println("DA :20000");
						salary=20000+HRA[i]+basic[i]-IT[i];
						System.out.println("Salary:"+ salary);
						break;
					case 'c':System.out.println("Designation: Consultant");
						System.out.println("DA :32000");
						salary=32000+HRA[i]+basic[i]-IT[i];
						System.out.println("Salary:"+ salary);
						break;
					case 'm':System.out.println("Designation: Manager");
						System.out.println("DA :40000");
						salary=40000+HRA[i]+basic[i]-IT[i];
						System.out.println("Salary:"+ salary);
						break;
					case 'r':System.out.println("Designation: Receptionist");
						System.out.println("DA :15000");
						salary=15000+HRA[i]+basic[i]-IT[i];
						System.out.println("Salary:"+ salary);
						break;
					case 'k':System.out.println("Designation: Clerk");
						System.out.println("DA :12000");
						salary=12000+HRA[i]+basic[i]-IT[i];
						System.out.println("Salary:"+ salary);
						break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("Employee details not found!!!!!");
		}
	}
}
