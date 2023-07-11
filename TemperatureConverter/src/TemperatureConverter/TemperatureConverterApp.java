package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double fahrenheit=sc.nextDouble();
		sc.close();
		TemperatureConverter tc=new TemperatureConverter();
		System.out.printf("%.2f",tc.convertFahrenheitToCelsius(fahrenheit));
	}

}
