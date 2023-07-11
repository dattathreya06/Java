package calcultorApp;

import java.util.Scanner;

public class Calculator {
	Scanner sc=new Scanner(System.in);
	void  additon()
	{
		System.out.println("Enter 2 numbers for Additon ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
	void  subtracton()
	{
		System.out.println("Enter 2 numbers for subtracton ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
	}
	void  multiplication()
	{
		System.out.println("Enter 2 numbers for multiplication ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("multiplication  of "+a+" and "+b+" is "+(a*b));
	}
	void  division()
	{
		System.out.println("Enter 2 numbers for division ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("division of "+a+" and "+b+" is "+(a/b));
		
	}
	void  remainder()
	{
		System.out.println("Enter 2 numbers for remainder ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("remainder of "+a+" and "+b+" is "+(a%b));
		
	}
	void  findSquare()
	{
		
		int x=sc.nextInt();
		System.out.println("Square of a number is "+(x*x));
		
	}
	
	

}
