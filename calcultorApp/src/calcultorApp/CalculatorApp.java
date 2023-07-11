package calcultorApp;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
		
		while(true) {
		System.out.println("Hello welcome to Kodnest Calcuator");
		System.out.println(" +---->Addition\n - ---->Subtraction\n * ----->multiplication \n / ------>Division\n %------->Remainder\n ^----->findSquare\n !----->Stop");
		System.out.println("Enter your choice");
		char ch=sc.next().charAt(0);
		
		switch(ch) 
			{
			case '+':c.additon();
			       	break;
			case '-':
			       c.subtracton();
			       break;
			case '*':
			       c.multiplication();
			       break;
			case '/' :
				   c.division();
				   break;
			case '%' :
				   c.remainder();
				   break;
			case '^' :
				   c.findSquare();
				   break;
			case '!':
				System.out.println("Tata tata bye bye");
					return;
			default:
				System.out.println("please enter valid operator");
			
			}
		
		}
		
	}		


}
