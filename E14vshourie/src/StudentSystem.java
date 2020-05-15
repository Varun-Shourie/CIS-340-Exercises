// E14, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM-4:15PM

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
	static Scanner scanner = new Scanner(System.in);
	
	// Declares an arrayList for storing student names and IDs.
	private static ArrayList<Student> studentRoster;
	
	public static void main(String[] args) {
		loadStudents();
	}
	
	// Takes in user input for student data. 
	private static void loadStudents() {
		// Initializes an ArrayList.
		studentRoster = new ArrayList<>();
		// Variables meant to be used in the constant loop of asking for student names and IDs.
		boolean continueLoop = false;
		String name = "";
		String id = "";
		Student tmpStudent;
		String userInput = "";
		
		// Loops through a prompt for student names and IDs. If the user wishes to enter more people,
		// the loop continues. 
		do {
			// Assumes the user does not want to enter more input.
			continueLoop = false;
			
			// Prompts for student names and IDs, takes in user input.
			System.out.print("Enter student name: ");
			name = scanner.nextLine();
			System.out.print("Enter student ID: ");
			id = scanner.nextLine();
			
			// Instantiates a new object every time and adds the object's data to the student roster ArrayList.
			tmpStudent = new Student(name,id);
			studentRoster.add(tmpStudent);
			
			System.out.println();
			
			// Prompts the user for if they want to enter more user input.
			System.out.println("Do you want to enter information for another student?");
			System.out.print("Enter 'Y' for Yes. Any other key for No. ");
			userInput = scanner.nextLine();
			
			System.out.println();
			
			// If the user presses "Y", then the loop continues. If not, the loop terminates.
			if(userInput.equalsIgnoreCase("Y")) {
				continueLoop = true;
			}
		} while (continueLoop);
		
		// When the loop terminates, all the object references are called and the values inside them are printed.
		// For every Student in the ArrayList, the name and ID will be printed. 
		System.out.printf("\nName\t\tID\n");
		for(Student s : studentRoster) {
			System.out.printf("%s\t\t%s\n", s.getName(), s.getId());
		}
	}
}
