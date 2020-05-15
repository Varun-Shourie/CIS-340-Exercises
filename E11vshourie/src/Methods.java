// E11, Varun Shourie, CIS340, Tuesday-Thursday, 3:00PM-4:15PM.

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
	
	// Returns the product of two integers.
	private static int product(int number1, int number2) {
		// Stores the product of two numbers.
		int result = 0;
		// A product is created by multiplying two numbers together.
		result = number1 * number2;
		// The product is returned to another part of the program.
		return result;
	}
	
	// Returns the product of three integers.
	private static int product(int number1, int number2, int number3) {
		// The product is returned by multiplying three integers together
		// and then sending it to another part of the program. 
		return number1 * number2 * number3;
	}
	
	// Calculates the average of the first n numbers. 
	private static double calculateAverage(int n) {
		// Maintains a running total of all numbers.
		int total = 0;
		
		// Loops through every number from 1 to n, adding
		// each number up.
		for(int i = 1; i <= n; i++) {
			total += i;
		}
		
		// To calculate the average, we divide the total of all numbers
		// by the amount of numbers we use. 
		return (double) total / n;
	}
	
	// Calculates the average of all numbers in an ArrayList.
	private static double calculateAverage(ArrayList<Integer> numbers) {
		// Maintains a running total of all numbers.
		int total = 0;
		
		// If the ArrayList was never initialized, we assume the average is zero.
		if(numbers == null) {
			return 0;
		}
		// If not null, we loop through all elements of the ArrayList and maintain
		// a running total of all elements.
		else {
			for(int n : numbers) {
				total += n;
			}
			
			// Calculates and returns the average of all numbers, which is the total of all numbers
			// divided by the count of numbers in the ArrayList.
			return (total / numbers.size());
		}
	}
	
	public static void main(String[] args) {
		// Instantiates a new object of Scanner for user input. 
		Scanner scanner = new Scanner(System.in);
		
		// Stores the result of invoked methods and is printed to the console.
		int result = 0;
		// Stores the number to be used in the calculation of averages of
		// the numbers from 1 to n.
		int n = 0;
		// Declares and initializes an ArrayList of integers.
		ArrayList<Integer> values;
		values = new ArrayList<>();
		
		// Adds the following values to the ArrayList.
		values.add(10);
		values.add(15);
		values.add(20);
		values.add(25);
		values.add(30);
		
		// Calculates and displays the product of 5 and 2. 
		System.out.println("*** Testing Product method using 2 arguments, 5 and 2 ***");
		result = product(5,2);
		System.out.printf("The product of 5 and 2 is %d.\n", result);
		System.out.println();
		
		// Calculates and displays the product of 2, 3, and 5. 
		System.out.println("*** Testing Product method using 3 arguments, 2, 3, and 5 ***");
		result = product(2,3,5);
		System.out.printf("The product of 2, 3, and 5 is %d.\n", result);
		System.out.println();
		
		// Prompts the user to enter a number n for the calculation of the
		// average from 1 to n.
		System.out.println("*** Testing Average Method with Integer Argument***");
		System.out.println("This program will calculate the average of all numbers "
				+ "from 1 to n.");
		System.out.print("Please enter a number: ");
		n = Integer.parseInt(scanner.nextLine());
		
		// Prints out the average of the numbers from 1 to n (the user inputted
		// number). 
		System.out.printf("The average of all numbers from 1 to %d is %.2f\n", 
				n, calculateAverage(n));
		
		System.out.println();
		System.out.println("The average printed without printf is: " + calculateAverage(n));
		
		// Informs the user on the ArrayList average functionality of the program.
		System.out.println("*** Testing Average Method with ArrayList Argument***");
		System.out.println("This program will calculate the average of the numbers"
				+ " in the ArrayList.");
		
		// Informs the user of all the values inside the ArrayList.
		System.out.println("Here are a list of all values inside the ArrayList: ");
		for(int number: values) {
			System.out.println(number);
		}
		
		// Prints out the average of the numbers inside the ArrayList. 
		System.out.printf("The average of all numbers in the ArrayList is %.2f", calculateAverage(values));
		
		scanner.close();
	}
	
}
