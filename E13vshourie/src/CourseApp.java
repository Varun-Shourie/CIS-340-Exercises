// E13, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM-4:15PM.

import java.util.Scanner;

public class CourseApp {
	public static void main(String[] args) {
		
		// Declares two objects of type Course.
		Course courseOne;
		Course courseTwo;
		
		// Instantiates two objects of type Course.
		courseOne = new Course();
		courseTwo = new Course();
		
		// Instantiates an object of type Scanner.
		Scanner scanner = new Scanner(System.in);
		
		// Sets the course prefix and course number for the first object.
		System.out.print("Please enter the first course prefix: ");
		courseOne.setCoursePrefix(scanner.nextLine());
		System.out.print("Please enter the course number: ");
		courseOne.setCourseNumber(Integer.parseInt(scanner.nextLine()));
		
		System.out.println();
		
		// Sets the college name to "ASU."
		Course.setCollegeName("ASU");
		
		// Displays a welcome message for the first course.
		System.out.printf("A new Course was created for %s %d at %s.",courseOne.getCoursePrefix(),
				courseOne.getCourseNumber(),Course.getCollegeName());
		System.out.println();
		courseOne.displayMessage();
		
		System.out.println();
		
		// Sets the course prefix and course number for the second object.
		System.out.print("Please enter the second course prefix: ");
		courseTwo.setCoursePrefix(scanner.nextLine());
		System.out.print("Please enter the course number: ");
		courseTwo.setCourseNumber(Integer.parseInt(scanner.nextLine()));
		
		System.out.println();
		
		// Displays a welcome message for the second course.
		System.out.printf("A new Course was created for %s %d at %s.",courseTwo.getCoursePrefix(),
				courseTwo.getCourseNumber(),Course.getCollegeName());
		System.out.println();
		courseTwo.displayMessage();
		
	}
}
