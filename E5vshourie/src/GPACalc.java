// E5, Varun Shourie, CIS340, 3:00PM-4:15PM

import java.util.Scanner;

public class GPACalc {
	public static void main(String[] args) {
		
		// The two variables below are used to take user input. 
		// The user will input the grade they received in the class
		// and the amount of credits the class is worth.
		String classGrade = "";
		int creditsAttempted = 0;
		// Based on user input, the values below are derived.
		// Grade points are derived from the user's class grade.
		// Business rules for calculating grade points
		// and grade points per class are described below. 
		int gradePoints = 0;
		int gradePointsPerClass = 0;
		// These variables are used to keep running totals of
		// the grade points per class and credits attempted. 
		int totalGradePoints = 0;
		int totalCreditsAttempted = 0;
		double gpa = 0;
		
		// Instantiates scanner class to take in user input.
		Scanner scanner = new Scanner(System.in);
		
		// Introduces user to the program and lets them know the purpose of the program.
		System.out.println("\t\t\t\tGPA Calculator\n\n\n");
		System.out.println("This program will calculate GPAs based on course grades");
		
		// Prompts the user to enter their grade for four classes and 
		// how many credits each class is worth. 
		for(int i = 0; i < 4; i++) {
			System.out.print("Enter grade: ");
			classGrade = scanner.nextLine();
			System.out.print("Enter number of credits for grade: ");
			creditsAttempted = Integer.parseInt(scanner.nextLine());
			System.out.println();
			
			// Switches user input for class grade to upper case since switch
			// comparisons below are case-sensitive
			classGrade = classGrade.toUpperCase();
			
			// Based on the grade they received, they will receive 4 grade points
			// for an A, 3 grade points for a B, 2 grade points for a C, 1 grade point
			// for a D, and no grade points for another grade. 
			switch (classGrade) {
			case "A":
				gradePoints = 4;
				break;
			case "B":
				gradePoints = 3;
				break;
			case "C":
				gradePoints = 2;
				break;
			case "D":
				gradePoints = 1;
				break;
			default:
				gradePoints = 0;
				break;
			}
			
			// The total grade points per class can be 
			// calculated by multiplying grade points assigned to the user
			// based on letter grade by the number of credits the class 
			// is worth. 
			gradePointsPerClass = gradePoints * creditsAttempted;
			// A running total of the grade points per class and
			// total credits attempted is kept to calculate GPA.
			totalGradePoints += gradePointsPerClass;
			totalCreditsAttempted += creditsAttempted;
		} // end for 
		
		// The GPA can be calculated by taking the sum of all grade points
		// per class and dividing them by the sum of credits attempted 
		// per class. 
		gpa = (double) totalGradePoints / totalCreditsAttempted;
		
		// Outputs the user's calculated GPA
		System.out.printf("The GPA is %.2f", gpa);
		scanner.close();
	}
}
