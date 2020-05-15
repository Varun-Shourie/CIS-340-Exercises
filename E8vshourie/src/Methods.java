// E8, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM-4:15PM

public class Methods {
	
	static int[] listOfNumbers = {1, 2, 3, 4, 5};
	
	public static void main(String[] args) {
		// These variables are declared to aid in the
		// testing of whether if the written methods below
		// function correctly.
		int returnVariable = 0;
		boolean numberFound = false;
		double quotient = 0.0;
		
		// Prints "Hello" to the console only. 
		printGreeting();
		
		System.out.println();
		
		// Shows the user what the product of 5 and 2 is. 
		returnVariable = product(5,2);
		System.out.printf("The product of 5 and 2 is %d", returnVariable);
		
		System.out.println();
		System.out.println();
		
		// Tests the concatenate method by concatenating "Hello" and "World" 
		// together. Also uses nested method call to efficiently call the
		// method while de-cluttering the program.
		System.out.printf("The return value is \"%s\"", concatenate("Hello", "World"));
		
		System.out.println();
		System.out.println();
		
		// Tests whether if the number 4 is an the array or not using the arrayContains
		// method to automate it better.
		System.out.println("I will test whether if the number 4 is in the array or not.");
		numberFound = arrayContains(4);
		if(numberFound) {
			System.out.println("The number 4 was found.");
		} 
		else 
			System.out.println("The number 4 was not found.");
		
		// Repeats the process above with the number of 50. 
		numberFound = false;
		System.out.println("I will test whether if the number 50 is in the array or not.");
		numberFound = arrayContains(50);
		if(numberFound) {
			System.out.println("The number 50 was found.");
		} 
		else 
			System.out.println("The number 50 was not found.");
		
		System.out.println();
		
		// Tests the divide method to see whether if it correctly divides two
		// numbers and displays the rounded result with 4 decimal places. 
		quotient = divide(7,6);
		System.out.printf("The quotient is equal to %.4f", quotient);
	}
	
	// Prints hello to the console only.
	private static void printGreeting() {
		System.out.println("Hello");
	}
	
	// Multiplies the two inputted integers together to find a product
	// and returns the product to other methods.
	private static int product(int number1, int number2) {
		return (number1 * number2);
	}
	
	// Concatenates or joins two strings together to form a 
	// new, coherent string for the user to use in other methods. 
	private static String concatenate(String string1, String string2) {
		return (string1 + string2);
	}
	
	// Returns the quotient after dividing two numbers for the user
	// to use in other methods.
	private static double divide(int number1, int number2) {
		double quotient = 0.0;
		quotient = (double) number1 / number2;
		return quotient;
	}
	
	// Returns true or false depending on whether the provided
	// number is present in the static array at the top of 
	// the program. 
	private static boolean arrayContains(int number) {
		boolean found = false;
		// loops through all elements of the static array
		// and compares if any elements of the array
		// have a value equal to number.
		for(int i = 0; i < listOfNumbers.length; i++) {
			if(number == listOfNumbers[i]) {
				found = true;
				break;
			}
		}
		return found;
	}
	
}
