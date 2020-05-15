// E6, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM-4:15PM

import java.util.Scanner;

public class Scores {
	public static void main(String[] args) {
		
		// Initializes instance of Scanner class for later user input. 
		Scanner scanner = new Scanner(System.in);
		
		// Declares arrays to store later user input efficiently.
		int[] scores;
		String[] names;
		// Two variables initialized to ensure better formatting later
		// in the program.
		String columnOne = "Names";
		String columnTwo = "Score";
		
		// Allocates 5 elements to the arrays, allowing
		// for 5 values to be stored and linked later.
		names = new String[5];
		scores = new int[5];
		
		// Welcomes the user to the program.
		System.out.println("\t\t\tStudent Grade System\n");
		System.out.println("This program will store student grades "
				+ "and look them up for you\n");
		
		// Prompts the user to enter one name per line.
		System.out.println("**************************");
		System.out.println("Enter names. One per line.");
		System.out.println("**************************\n");
		
		// Prompts the user to actually start entering one name
		// per line. Each iteration of the loop serves to store
		// one name in one element of the array. 
		for (int i = 0; i < names.length; i++) {
			System.out.print("Enter name: ");
			names[i] = scanner.nextLine();
		}
		
		System.out.println();
		System.out.println();
		
		// Prompts the user to enter one score per line.
		System.out.println("***************************");
		System.out.println("Enter scores. One per line.");
		System.out.println("***************************\n");
		
		// Prompts the user to actually start entering one
		// score per person. Each iteration of the loop serves
		// to store one score in one element of the scores array.
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("Enter score for %s: ", names[i]);
			scores[i] = Integer.parseInt(scanner.nextLine());
		}
		
		System.out.println();
		System.out.println();
		
		// We construct a parallel array through outputting 
		// both students' names and scores. 
		// Due to how we correspond each element of the 
		// names array and scores array, we end up creating
		// a well formatted table which has meaning.
		System.out.println("You entered the following data:\n");
		System.out.printf("%-15s %5s\n", columnOne, columnTwo);
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%-15s %5d", names[i], scores[i]);
			System.out.println();
		}
		
		scanner.close();
	}
}
