// Varun Shourie, CIS340, 3:00PM-4:15PM, E1

import java.util.Scanner;

public class Grades {
	
	public static void main(String[] args) {
		
		// The first two variables will be used to store user input of the user's name and score in their class.
		// The last variable will be derived from score to assign a grade to the user.
		String studentName = "";
		int score = 0;
		char grade = 'O';
		
		// This instance of the Scanner class was created to take in user input for studentName and score.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\t\t\tLetter Grade Calculator");
		
		// In the following two lines, I intake the user's name using the instance of the Scanner class.
		System.out.println("What's your name?");
		studentName = scanner.nextLine();
		
		// In the following two lines, I intake the user's score they received in the class.
		System.out.printf("Enter score for %s: ", studentName);
		score = Integer.parseInt(scanner.nextLine());
		
		// Based on what the user received as a score in the class, the user is assigned a score. 
		// Here is the grading scale for scores in this university:
		// If the score is 90% or above, the user receives an A.
		// If the score is 80% or above AND below 90%, the user receives a B.
		// If the score is 70% or above AND below 80%, the user receives a C.
		// If the score is 60% or above AND below 70%, the user receives a D.
		// If the user's score is below 60%, the user receives a F.
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80 && score < 90) {
			grade = 'B';
		}
		else if(score >= 70 && score < 80) {
			grade = 'C';
		}
		else if(score >= 60 && score < 70) {
			grade = 'D';
		}
		else if (score < 60) {
			grade = 'F';
		}
		
		System.out.printf("Your grade for the class is %c. ", grade);
		
		// Based on what the user's grade is, I provided feedback of varying praise.
		// An A receives praise of "Awesome!", a B receives "Beautiful!", a C receives
		// "Completed!", a D receives "Done!", and a F receives "You need to study more!"
		if (grade == 'A') {
			System.out.println("Awesome!");
		} 
		else if (grade == 'B') {
			System.out.println("Beautiful!");
		}
		else if (grade == 'C') {
			System.out.println("Completed!");
		}
		else if (grade == 'D') {
			System.out.println("Done!");
		}
		else {
			System.out.println("Forget it happened!");
		}
		
		// This section of code determines whether if the user
		// passed their class or not. If the user received a F,
		// they did not pass their class. If they didn't, 
		// they did pass their class.
		if (grade != 'F') {
			System.out.println("You passed the class!");
		}
		else {
			System.out.println("You failed the class!");
		}
		
		// This section of code provides further 
		// feedback to the user regarding study habits.
		// If a user received a grade of A or B, they were
		// told to keep doing whatever they're doing.
		// If a user received a grade of C or D, they were 
		// told to study better next semester.
		if (grade == 'A' || grade == 'B') {
			System.out.println("Keep doing what you're doing. ");
		} 
		else if (grade == 'C' || grade == 'D') {
			System.out.println("Do better next semester. ");
		}
			
		scanner.close();
	}
}
