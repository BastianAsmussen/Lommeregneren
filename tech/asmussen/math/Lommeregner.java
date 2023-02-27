package tech.asmussen.math;

import java.util.Scanner;

public class Lommeregner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			// Læs det første tal fra brugeren.
			System.out.print("Skriv det først tal: ");
			double a = scanner.nextDouble();
			
			// Læs det andet tal fra brugeren.
			System.out.print("Skriv det andet tal: ");
			double b = scanner.nextDouble();
			
			// Læs den ønskede operation fra brugeren.
			CalculationMethod[] modes = CalculationMethod.values();
			for (int i = 0; i < modes.length; i++) {
				
				System.out.printf("%d: %s\n", i + 1, modes[i]);
			}
			System.out.print("Vælg en regnemetode: ");
			int rawModeIndex = scanner.nextInt() - 1;
			int modeIndex = rawModeIndex % modes.length;
			
			CalculationMethod mode = modes[modeIndex];
			
			// Beregn resultatet.
			System.out.printf("%.2f %s %.2f = %.2f\n", a, mode.toString(), b, calculate(a, b, mode));
			
		} catch (Exception e) {
			
			System.err.println("Der skete en fejl, prøv igen!");
		}
		
		scanner.close();
	}
	
	public static double calculate(double a, double b, CalculationMethod mode) {
		
		return switch (mode) {
			
			case ADD -> a + b;
			case SUBTRACT -> a - b;
			case MULTIPLY -> a * b;
			case DIVIDE -> a / b;
		};
	}
	
	public enum CalculationMethod {
		ADD("+"),
		SUBTRACT("-"),
		MULTIPLY("*"),
		DIVIDE("/");
		
		private final String symbol;
		
		CalculationMethod(String symbol) {
			
			this.symbol = symbol;
		}
		
		@Override
		public String toString() {
			
			return symbol;
		}
	}
}
