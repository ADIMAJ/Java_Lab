package Java_Lab;

import java.util.Scanner;

public class password {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	String name;
	String pw=new String();
	long ph;int rno,rem,sum=0;
	System.out.println("Enter the name : ");
	name=s.next();
	System.out.println("Enter the room no : ");
	rno=s.nextInt();
	int rno1=rno;
	System.out.println("Enter the phone number : ");
	ph=s.nextLong();
	char []sym={')','!','@','#','$','%','^','&','*','('};
	do
	{
	while(rno!=0)
	{
	rem=rno%10;
	sum=sum+rem;
	rno=rno/10;
	}
	if(sum>=10)
	{
	rno=sum;
	sum=0;
	}
	}while(rno!=0);

	int c=rno1/100;
	int len=name.length();
	int pos=0;
	for(int i=0;i<len;i++)
	{
	if(c==i)
	{
	pos=i;
	System.out.println("Password is : ");
	}
	}
	pw=""+name.charAt(0)+(ph%10)+sum+sym[c]+name.charAt(len-1);
	System.out.println(pw);
	}
}
