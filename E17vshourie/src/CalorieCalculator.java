import java.util.Scanner;

public class CalorieCalculator {
	
	// Scanner object must be static to access static methods. 
	static Scanner scanner = new Scanner(System.in);
	
	// Two constants to be used consistently in the conversion process.
	static final double CALORIE_COEFFICIENT = 0.167;
	static final double POUNDKG_COEFFICIENT = 0.453592;
	
	public static double poundsToKilos(double pounds) {
		// A pound equals 0.453592 kilos.
		return pounds * POUNDKG_COEFFICIENT;
		
	}
	
	public static double caloriesSpentRunning(double kilograms, double minutes) {
		// The calories a person burns is equal to their weight in kg multiplied by the time in min they ran,
		// which is then multiplied by 0.167.
		return kilograms * minutes * CALORIE_COEFFICIENT;
		
	}
	
	// Reads an integer from the user with extensive input validation.
	public static int readInteger(String displayString) {
		int numberOfErrors = 0;
		int number = 0;
		
		boolean repeatInput = false;
		
		// Keeps track of the number of times the user makes an error in input.
		do {
			try {
				System.out.print(displayString);
				number = Integer.parseInt(scanner.nextLine());
				
				// Set false only in case the user input is valid. 
				repeatInput = false;
			}
			catch(NumberFormatException e) {
				if(numberOfErrors == 2) {
					System.out.println("User has made too many errors in entering data. Please enter a key to exit.");
					scanner.nextLine();
					
					System.exit(0);
				}
				else {
					System.out.println("\nInput must be a valid integer. Try again.\n");
					
					// Set to true to suggest the user has made a mistake and should try again.
					repeatInput = true;
					numberOfErrors++;
				}
			}
		} while (repeatInput);
		
		return number;
	}
	
	
	public static void main(String[] args) {
		// Variables meant to store user input. 
		double weight = 0;
		int minutes = 0;
		int seconds = 0;
		double totalTime = 0.0;
		double kilos = 0.0;
		
		System.out.println("\t\t\tRunning Calorie Calculator\n\n");
		System.out.println("This application can calculate calories based on running mileage.\n");
		
		weight = readInteger("Enter runner weight (lbs): ");
		minutes = readInteger("Enter minutes run: ");
		seconds = readInteger("Enter seconds run: ");
		
		// Total number of minutes is equal to the number of discrete minutes plus the number of seconds 
		// divided by 60.
		totalTime = minutes + ((double) seconds / 60);
		
		kilos = poundsToKilos(weight);
		
		System.out.printf("\nIf you run %d minutes and %d seconds at 6mph, the calories burned are "
				+ "approximately %.2f", minutes, seconds, caloriesSpentRunning(kilos, totalTime));
	}
}
