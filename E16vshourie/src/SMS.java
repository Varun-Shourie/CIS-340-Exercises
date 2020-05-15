// E16, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM - 4:15PM
import java.util.Scanner;

public class SMS {
	
	static Scanner scanner = new Scanner(System.in);
	
	// Stores all the information for one course. 
	Course my340Course;
	
	// Allows the user to add a student to the course roster.
	public void addNewStudent() {
		// Variables created to store temporary input by the user.
		String name = "";
		String id = "";
		
		System.out.print("Name: ");
		name = scanner.nextLine();
		
		System.out.print("ID: ");
		id = scanner.nextLine();
		
		Student tmpStudent = new Student(name, id);
		my340Course.add(tmpStudent);
	}
	
	// Allows the menu function to run and prompt the user for information about students.
	public void showMenu() {
		int userInput = 0;
		
		do {
			System.out.print("\t\t\tStudent Management System\n\n\n\n");
			System.out.print("1. Add Student\n");
			System.out.print("2. Print Roster\n");
			System.out.print("3. Exit\n\n\n");
			
			System.out.print("Enter choice: ");
			userInput = Integer.parseInt(scanner.nextLine());
			
			switch(userInput) {
			case 1:
				addNewStudent();
				System.out.print("\n\n\n\n\n");
				break;
			case 2:
				System.out.print("The students in the roster are: \n\n");
				my340Course.printRoster();
				
				scanner.nextLine();
				System.out.print("\n\n\n\n");
				break;
			}
			
		} while (userInput != 3);
	}

	// Adds a student to the roster and alters their information. 
	private void loadSMS() {
//		// Declares and instantiates a Course object. 
//		Course my340Class = new Course();
//		
//		// Adds a student to the roster and updates their name to John Smith in the ArrayList.
//		Student tmpStudent = my340Class.add();
//		tmpStudent.setName("John Smith");
//		
//		// Changes the details of an existing student.
//		my340Class.getStudentRoster().get(0).setName("Jonathan Smith");
//		
//		// Prints out the name of an existing student. 
//		System.out.printf("The first student in "
//				+ "the roster is %s.", my340Class.getStudentRoster().get(0).getName());
		
		my340Course = new Course();
		showMenu();
	}
	
	public static void main(String[] args) {
		// Declares and instantiates an SMS object.
		SMS myStudentSystem = new SMS();
		
		// Executes the program
		myStudentSystem.loadSMS();
		
		scanner.close();
	}
}
