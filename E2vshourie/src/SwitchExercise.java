// E2, Varun Shourie, CIS340 T/Th 3:00PM-4:15PM

import java.util.Scanner;

public class SwitchExercise {

	public static void main(String[] args) {
		
		// These variables are created to intake user input. In this program, the student
		// will need to input their student ID, ZIP code, GPA (for undergraduate 
		// and certificate students), thesis title (for master's degree students)
		// and dissertation title (for doctoral degree students).
		// They will later input what type of student they are as well. 
		String studentID = "";
		String zip = "";
		double gpa = 0.0;
		String thesis = "";
		String dissertation = "";
		int studentType = 0;
		
		
		System.out.println("\t\t\tStudent Information System.\n");
		
		// This instance of the Scanner class was created to intake information
		// for the variables initialized above. 
		Scanner scanner = new Scanner(System.in);
		
		// This allows the student to input their user ID and the program
		// to store the inputted userID. 
		System.out.print("Please enter your student ID: ");
		studentID = scanner.nextLine();
		
		System.out.print("\n\n");
		 
		// This portion of the program lets the user know which
		// codes correspond to their status as a student.
		System.out.println("1. Undergraduate.");
		System.out.println("2. Graduate");
		System.out.println("3. PhD");
		System.out.println("4. Non-degree Certificate\n");
		
		// This portion of the program will intake the student type.
		// If a student is an undergraduate, they should enter 1.
		// If they are a graduate student, they should enter 2.
		// If they are a PhD student, they should enter 3.
		// If they are a certificate student, they should enter 4. 
		System.out.print("Enter option (1-4): ");
		studentType = Integer.parseInt(scanner.nextLine());
		System.out.print("\n");
		
		// This portion of the program is meant to intake the
		// user's zip code. 
		System.out.print("Enter your zip code: ");
		zip = scanner.nextLine();
		
		System.out.println("");
		
		// Based on the student type, the program will prompt the user
		// in different ways. 
		// If the student is an undergrad, they will be prompted to input
		// their GPA value.
		// If the student is a graduate student, they must be prompted to
		// input their thesis title.
		// If the student is a PhD student, they must be prompted to 
		// input their dissertation title.
		// If the student is a certificate student, they don't have
		// to be prompted to input anything.
		switch (studentType) {
		
		case 1:
			System.out.print("Please enter your GPA: ");
			gpa = Double.parseDouble(scanner.nextLine());
			break;
			
		case 2:
			System.out.print("Please enter your thesis title: ");
			thesis = scanner.nextLine();
			break;
			
		case 3:
			System.out.print("Please enter your dissertation title: ");
			dissertation = scanner.nextLine();
			break;
			
		case 4:
			break;
			
		default: 
			System.out.println("An invalid option was selected");
			break; 
		}
		
		System.out.print("\n");
		
		// Based on the student ID and ZIP code inputted by the student,
		// the system will output the user's ID and ZIP code.
		System.out.println("*********Student information***********");
		System.out.println("Student ID: " + studentID);
		System.out.println("ZIP code: " + zip);
		
		// If a student is an undergrad or non degree, 
		// the program should output their GPA.
		// If a student is a PhD student, the program should output their 
		// dissertation title.
		// If a student is a graduate student, the program should output
		// their master's thesis title. 
		switch (studentType) {
		
		case 1:
		case 4:
			System.out.printf("GPA: %.2f", gpa);
			break;	
		case 3:
			System.out.println("Dissertation title: " + dissertation);
			break;
		case 2:
			System.out.println("Thesis title: " + thesis);
			break;
		}
		
		scanner.close();
		
	}
	
}
