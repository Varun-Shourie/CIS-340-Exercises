// E7, Varun Shourie, CIS340, Tuesday/Thursday 3:00PM-4:15PM

import java.util.Scanner;

public class JaggedArrays {
	
	public static void main(String[] args) {
		
		// Instance of Scanner class is instantiated for user input.
		Scanner scanner = new Scanner(System.in);
		
		// Two-dimensional array instantiated to store user input.
		int[][] scores;
		// Variables used to calculate the average of varying amount of test
		// scores for all people in a class.
		int scoreTotal = 0;
		double average = 0.0;
		int numberOfScoresPerStudent = 0;
		int totalNumberOfScores = 0;
		
		// Allocates 3 elements to the outer array, because we need to leave
		// the inner array open for user input to create a jagged array. 
		scores = new int[3][];
		
		System.out.println("\t\t\tTest Average Calculator\n");
		
		// Outer for loop determines the number of the student. 
		for (int i = 0; i < scores.length; i++) {
			
			// Prompts and takes in user input regarding how many scores
			// you want to input for each student.
			System.out.print("How many scores for student " + (i+1) + "? ");
			numberOfScoresPerStudent = Integer.parseInt(scanner.nextLine());
			// allocates a different number of scores for each element of student
			// in the outer array. 
			scores[i] = new int[numberOfScoresPerStudent];
			
			System.out.println();
			
			// Prompts the user to enter scores for a specific student
			// and prompts the user with the number of the score.
			System.out.print("Enter scores for Student " + (i+1) + ":\n");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("Score %d: ", (j+1));
				scores[i][j] = Integer.parseInt(scanner.nextLine());
			}
			
			System.out.println();
		}
		
		// Traverses the array to seek out each and every student's score
		// and calculate the sum of all scores and total number of scores.
		// Outer for loop loops through the student.
		// Inner for loop loops through the scores for each student.
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scoreTotal += scores[i][j]; 
				totalNumberOfScores++;
			}
		}
		
		// Restates how many scores were entered totally into the program.
		System.out.printf("There were %d scores.\n", totalNumberOfScores);
		
		// Calculates the average, which can be calculated by taking the
		// sum of all scores and dividing by the total number of scores. 
		average = (double) scoreTotal / totalNumberOfScores;
		System.out.printf("The class average for all tests is %.2f.", average);
		
	}
}
