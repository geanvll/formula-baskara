package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner t = new Scanner(System.in);
		
		double a = t.nextDouble();
		double b = t.nextDouble();
		double c = t.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(a == 0 || delta < 0) {
			System.out.println("Impossível calcular!");
		} else {
			double r1 = (-b + Math.sqrt(delta)) / (2 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
			
		}

	}

}
