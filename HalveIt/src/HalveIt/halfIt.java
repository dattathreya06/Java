package HalveIt;
import java.util.Scanner;
public class halfIt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		System.out.printf("%.2f",halveTheNumber(num));
		sc.close();
	}
	public static double halveTheNumber(double num)
	{
		return num/2.0;
	}

}
