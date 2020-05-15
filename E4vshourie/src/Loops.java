// E4, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM-4:15PM

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		
		// these are the variables used to acquire user input
		// and calculate the average of the user inputted numbers,
		// represented by the average. 
		String input = "";
		int number = 0;
		int total = 0;
		double average = 0.0;
		// I used this non-traditional counter variable name 
		// because naming the counter as "i" is not descriptive
		// for do-while or while loops. 
		int numberCount = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		// Part 1
		// This is sentinel controlled repetition WITH A DO LOOP.
		// When the user enters a number, the input
		// is added onto the total and the counter
		// variable is incremented. 
		// The user is prompted to keep on entering
		// numbers until they press "X" or "x" to break
		// out of the do loop.
		// Next, the total is divided by the counter
		// variable to produce the average. 
		System.out.println("Calculating the average of user inputted numbers"
				+ " with a do loop\n");
		
		do {
			System.out.print("Enter a number: ");
			input = scanner.nextLine();
			
			if(input.equalsIgnoreCase("x")) {
				break;
			}
			else {
				number = Integer.parseInt(input);
				total += number; 
				numberCount++;
				average = (double) total / numberCount;
			}
			
		} while (!input.equalsIgnoreCase("x"));
		
		System.out.printf("Average of all the numbers entered: %.2f\n\n", average);
		
		// Part 2
		// This is sentinel controlled repetition WITH A WHILE LOOP.
		// When the user enters a number, the input
		// is added onto the total and the counter
		// variable is incremented. 
		// The user is prompted to keep on entering
		// numbers until they press "X" or "x" to break
		// out of the while loop.
		// Next, the total is divided by the counter
		// variable to produce the average. 
		System.out.println("Calculating the average of user inputted numbers"
				+ " with a while loop\n");
		
		input = "";
		number = 0;
		total = 0;
		average = 0.0;
		numberCount = 0;
		
		while (!input.equalsIgnoreCase("x")) {
			System.out.print("Enter a number: ");
			input = scanner.nextLine();
			
			if(!input.equalsIgnoreCase("X")) {
				number = Integer.parseInt(input);
				total += number;
				numberCount++;
				average = (double) total / numberCount;
			}
			else break;
		}
		
		System.out.printf("Average of all the numbers entered: %.2f\n\n", average);
		
		// Part 3
		// In this pattern, we notice that there are 10 lines.
		// The amount of stars on each line also correspond to the line
		// number. Therefore, it is best to use one outer for loop for
		// the number of rows, and one inner for loop to print the number
		// of columns. 
		System.out.println("Printing a triangle pattern using"
				+ " nested for loops");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// Part 4
		// Similar to the triangle pattern above,  we use similar rules.
		// The outer for loop prints 10 rows.
		// The first inner for loop prints the number of spaces
		// The number of spaces corresponds to the line number.
		// The line number starts with zero. 
		// The second inner for loop prints the number of stars.
		// The number of stars corresponds to (10 - spaces).
		System.out.println("Printing a reversed triangle pattern using"
				+ " nested for loops");
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (10-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
