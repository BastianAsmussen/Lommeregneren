import java.util.Scanner;

public class Lommeregner {
	
	public static void main(String[] args) {
		
		// scanner bruges til og læse input fra brugeren
		Scanner scanner = new Scanner(System.in);
		
		// spørg brugeren om det først tal
		System.out.println("tal 1");
		double a = scanner.nextDouble();
		
		// spørg brugeren om det andet tal
		System.out.println("tal 2");
		double b = scanner.nextDouble();
		
		// spørg brugeren om tilstand
		System.out.println("vælg en tilstand");
		System.out.println("1: +");
		System.out.println("2: -");
		System.out.println("3: *");
		System.out.println("4: /");
		int index = scanner.nextInt();
		CalculatorMode mode = CalculatorMode.values()[index - 1];
		
		// bruges til at formater resultat til 2 decimaler
		double calculation = calculate(a, b, mode);
		System.out.printf("%.2f %s %.2f = %.2f \n", a, mode, b, calculation);
	}
	
	/**
	 * Udregner resultatet af a og b med udvalgt regningsmetode.
	 *
	 * @param a    Først tal.
	 * @param b    Andet tal.
	 * @param mode regnemetoden
	 * @return resultatet af a og b med udvalgt regningsmetode
	 */
	public static double calculate(double a, double b, CalculatorMode mode) {
		
		return switch (mode) {
			
			case ADD -> a + b;
			case SUBTRACT -> a - b;
			case MULTIPLY -> a * b;
			case DIVISION -> a / b;
		};
	}
	
	/**
	 * Regne metoden som bruges til udregninger.
	 *
	 * @see #calculate(double, double, CalculatorMode)
	 */
	public enum CalculatorMode {
		
		ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVISION("/");
		
		private final String symbol;
		
		CalculatorMode(String symbol) {
			
			this.symbol = symbol;
		}
		
		@Override
		public String toString() {
			
			return symbol;
		}
	}
}

