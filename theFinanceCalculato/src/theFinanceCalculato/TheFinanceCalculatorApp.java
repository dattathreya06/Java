package theFinanceCalculato;
import java.util.Scanner;
public class TheFinanceCalculatorApp {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		double principal=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		sc.close();
		FinanceCalculato fc=new FinanceCalculato();
		System.out.printf("%.2f",fc.calculateSimpleInterest(principal, rate, time));

	}

}
