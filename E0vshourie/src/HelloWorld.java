// E0, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM-4:15PM

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		String userName = "";
		
		System.out.println("Hello World");
		System.out.print("What's your name? ");
		
		// New instance of Scanner class called scanner
		// created to receive user input.
		Scanner scanner = new Scanner(System.in);
		// The user's inputted name is stored into the userName variable. 
		userName = scanner.nextLine();
		System.out.println("Hi " + userName + ". See you around!");
		
		scanner.close();		
	}

}
