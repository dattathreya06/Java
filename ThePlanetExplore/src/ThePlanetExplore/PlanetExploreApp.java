package ThePlanetExplore;
import java.util.Scanner;
public class PlanetExploreApp {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double radius=sc.nextDouble();
			sc.close();
			PlanetExplore pe=new PlanetExplore();
			System.out.printf("%.2f",pe.calculateSurfaceArea(radius));
	}

}
