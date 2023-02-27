import java.util.Scanner;

public class Lommeregner {
	
	public enum calculatorMode{
		
		ADD("+"),
		SUBTRACT("-"),
		MULTIPLY("*"),
		DIVISION("/");
		
		private final String symbol;
		 calculatorMode(String symbol){
			
			this.symbol = symbol;
		}
		
		@Override
		public String toString(){
			 
			 return symbol;
		}
	}
	public static double calculator(double a, double b, calculatorMode mode){
		
		return switch (mode){
			
			case ADD -> a + b;
			
			case SUBTRACT -> a - b;
			
			case MULTIPLY -> a*b;
			
			case DIVISION -> a/b;
			
			
		};
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("tal 1");
		double a = scanner.nextDouble();
		
		System.out.println("tal 2");
		double b = scanner.nextDouble();
		
		System.out.println("vælg en tilstand");
		System.out.println("1: +");
		System.out.println("2: -");
		System.out.println("3: *");
		System.out.println("4: /");
		int index = scanner.nextInt();
		calculatorMode mode = calculatorMode.values()[index -1];
		
		double calculation = calculator(a, b, mode);
		System.out.printf("%.2f %s %.2f = %.2f \n", a, mode.toString(), b, calculation );
		
		
		
		
		
		
		
	}
}

