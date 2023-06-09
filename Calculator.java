package Java_Lab;

import java.util.*;
import java.lang.*;

public class Calculator
{
  Scanner sc= new Scanner(System.in);
  public void add()
  {
	  System.out.println("Enter two numbers\n");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  System.out.println("The sum of "+a +" and " +b +" is "+(a+b));
  }
  
  public void subtract()
  {
	  System.out.println("Enter two numbers\n");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  System.out.println("The difference between " +a +" and " +b +" is "+(a-b));
  }
  
  public void divide()
  {
	  System.out.println("Enter two numbers\n");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  System.out.println(+a +" divided by " +b +" is "+(a/b));
  }
  
  public void multiply()
  {
	  System.out.println("Enter two numbers\n");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  System.out.println("The product of "+a +" and " +b +" is "+(a*b));
  }
  
  public void power()
  {
	  System.out.println("Enter two numbers\n");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  System.out.println(+a +" to the power of " +b +" is "+pow(a,b));
  }
  
  public static void main(String[] args)
  {
	  
	  System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
	  Calculator c=new Calculator();
	  while(true)
	  {
		  Scanner s= new Scanner(System.in);
		  System.out.println("Enter your choice");
		  int ch=s.nextInt();  
		  switch(ch)
		  {
		  case  1:c.add();
		          break;
		          
		  case  2:c.subtract();
                  break;
          
		  case  3:c.multiply();
                  break;
          
		  case  4:c.divide();
                  break;
          
		  case  5:System.out.println("Exit from the program");
		          System.exit(1); 
          break;
 
          default:System.out.println("Wrong Choice.Try Again");
          break;
		  }
	  }
  }  
 }
