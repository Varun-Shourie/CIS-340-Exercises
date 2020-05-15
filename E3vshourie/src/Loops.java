// E3, Varun Shourie, CIS340, Tuesday/Thursday 3:00PM-4:15PM

import java.util.Scanner;

public class Loops {
	
	public static void main(String[] args) {
		
		// This variable was made to keep track of 
		// how many asterisks the user wishes to see. 
		int asteriskCount = 0;
		// This variable was made as a counter variable 
		// to track the number of iterations in 
		// a while loop. 
		int counter = 0;
		
		System.out.println("I can create a line of asterisks!\n");
		
		// In order to be able to print out a line of asterisks, we must
		// first determine how much asterisks the user wishes to see. 
		// This scanner class instance was created to in-take user input
		// regarding how many asterisks they wish to see.
		System.out.println("How many asterisks would you like to see?");
		Scanner scanner = new Scanner(System.in);
		asteriskCount = Integer.parseInt(scanner.nextLine());
		
		System.out.println();
		
		// This while loop allows the program to keep on printing asterisks
		// until the requested number of asterisks are printed. 
		// Through the use of a counter variable, we can control the number
		// of asterisks printed by the program by limiting it to the
		// amount inputted by the user in the asteriskCount variable. 
		System.out.println("I will print a line of asterisks using a while loop.");
		while (counter < asteriskCount) 
		{
			System.out.print("*");
			counter++;
		} // end while
		
		System.out.println();
		System.out.println();
		
		// In striking similarity to the while loop above, the for loop
		// will print asterisks until the counter variable equals
		// the asteriskCount, or the quantity of asterisks the user inputted.
		System.out.println("I will print a line of asterisks using a for loop.");
		for (int i = 0; i < asteriskCount; i++) 
		{
			System.out.print("*");
		} // end for
		
		System.out.println();
		System.out.println();
		
		// The for loop provided here intends to print numbers,
		// starting from 1 to the quantity inputted by the user in 
		// the asteriskCount variable. Until the counter variable reaches
		// the asteriskCount quantity, the for loop iterations will print
		// the number in sequential order (i.e. 1, 2, 3, 4, 5, etc.)
		System.out.println("I will print a line of numbers from 1 to " + asteriskCount + " using a for loop.");
		for (int i = 0; i < asteriskCount; i++) 
		{
			System.out.printf("%d ", i+1);
		} // end for 
		
		System.out.println();
		System.out.println();
		
		// In contrast to utilizing user input, the for loop provided below
		// intends to print all multiples of the number 5 from 1 to 50. 
		// Since one divides into five evenly but is not a multiple,
		// any number below five is excluded as a potential multiple. 
		// With every iteration of the loop, one multiple of 5 will
		// be printed since the counter variable is incremented by 5.
		System.out.println("I will print all the multiples of the number 5 from 1 to 50.");
		for(int i = 0; i <= 50; i += 5) 
		{
			if (i >= 5) 
			{
				System.out.printf("%d ", i);
			} // end if
		} // end for 
		
		System.out.println();
		System.out.println();
		
		// Using a for loop, the program will print out the
		// multiplication tables for 2 up to 12.
		// When the counter variable is incremented, the
		// amount which 2 is multiplied by increases by 1.
		// The output has been formatted for easy viewing.
		System.out.println("I will write the multiplication table for 2 using a for loop.");
		for(int i = 1; i <= 12; i++) 
		{
			System.out.printf("2 * %2d = %3d\n", i, (2*i));
		} // end for
		scanner.close();
		
	}

}
