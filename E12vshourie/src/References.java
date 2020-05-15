// E12, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM-4:15PM.

import java.util.Scanner;
import java.util.ArrayList;

public class References {
	
	// Instantiates a static object of Scanner for taking in user input. 
	static Scanner scanner = new Scanner(System.in);
	
	// Populates an array of Strings with names inputted by the user.
	private static void readStudentNames(String[] stringArray) {
		System.out.println("readStudentNames Method: Putting values "
				+ "inside stringArray parameter");
		
		// Loops through the length of the array, prompts and stores
		// names from the user in the array. 
		for(int i = 0; i < stringArray.length; i++) {
			System.out.printf("Enter name %d: ", (i+1));
			stringArray[i] = scanner.nextLine();
		}
	}
	
	// Populates an ArrayList of Strings with names inputted by the user.
	private static void readStudentNames(ArrayList<String> stringList) {
		System.out.println("readStudentNames Method: Putting values "
				+ "inside stringList parameter");
		
		// Loops through the ArrayList five times, prompts and stores names from the user
		// in the ArrayList.
		for(int i = 0; i < 5; i++) {
			System.out.printf("Enter name %d: ", (i+1));
			stringList.add(scanner.nextLine());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("\t\t**** Passing References - Reading 5 Names ****");
		System.out.println("\n");
		
		// Declares and initializes an array of strings meant to hold names
		String[] nameArray;
		nameArray = new String[5];
		
		// Declares and initializes an ArrayList of strings meant to hold names
		ArrayList<String> nameArrayList;
		nameArrayList = new ArrayList<>();
		
		System.out.println("Main Method: Passing an Array, nameArray, by-value ");
		// Populates all elements of nameArray with user input.
		readStudentNames(nameArray);
		
		System.out.println();
		
		System.out.println("Main Method: The contents of nameArray are: ");
		// Loops through and prints all the names in nameArray. 
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
		
		System.out.println();
		
		System.out.println("Main Method: Passing an ArrayList, nameArrayList, by-value ");
		// Populates all elements of nameArrayList with user input.
		readStudentNames(nameArrayList);
		
		System.out.println();
		
		System.out.println("Main Method: The contents of nameArrayList are: ");
		// Loops through and prints all the names in nameArrayList.
		for(String names : nameArrayList) {
			System.out.println(names);
		}
		
		System.out.println();
	}
}
