package journeyCalculator;
import java.util.*;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    double speed=sc.nextDouble(); 
    double time=sc.nextDouble();
   
    sc.close();
    JourneyCalculator j=new JourneyCalculator();
    System.out.printf("%.2f",j.calculateDistance(speed,time));
	}
	
}
