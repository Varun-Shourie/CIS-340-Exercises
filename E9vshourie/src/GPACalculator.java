//Name

//Imports
import java.util.Scanner;

class GPACalculator
    {
    
        public static void main(String[] args)
        {
	    // variables to store grade and credit for a class
	    String grade = "";
	    int credits = 0.0;
	
	    // allows the user to specify more grades need to be entered
	    String enterMore = "n";
	
	    // keeps track of total credits attempted by student
	    int attemptedCredits = 0;
	
	    // stores grade points per class
	    int gradePoints = 0;
	
	    // stores total grade points for all classes
	    double totalGradePoints = 0.0;
	
	    double gpa = 0.0;
		
            System.out.println("\t\t\tGPA Calculator\n\n\n");

            System.out.println("This program will calculate GPAs based on course grades");


            Scanner scanner = new Scanner(System.in);

            do {

				      System.out.print("Enter grade: ");
            grade = scanner.nextLine();
            System.out.print("Enter number of credits for grade: ");

            credits = (double)Integer.parseInt(scanner.nextLine());

            // calculate how many grade points are to be given for one class
            // grade points depend on what grade the student gets in a class
            switch (grade)
            {
                case 'A':
                    gradePoints = 4;
                    break;
                case 'B':
                    gradePoints = 3;
                    break;
                case 'C':
                    gradePoints = 2;
                    break;
                case 'D':
                    gradePoints = 1;
                    break;
                default:
                    gradePoints = 1;

            }

            ;

            // maintain a running total of grade points
            // gradepoints per class needs to be multipleby number of credits to get total grade points
            totalGradePoints = totalGradePoints + credits * gradePoints;

            // maintain a running total of all credits
            attemptedCredits = +credits;

                System.out.print("Enter more grades? ");
                enterMore = scanner.nextLine();
                enterMore = enterMore.toUpperCase();

                System.out.println();

            } while (enterMore = "y")


            }// GPA is calculate as an average of gradepoints
            // divide total grade points by total number of attempted credits
            gpa = totalGradePoints / attemptedCredits;

            // tell the user what the gpa is
            System.out.println("The GPA is %.2f\n.", gpa);

            // test if the gpa is in Dean's List or Probation range
            // give feedback 
            if (gpa >= 3.5)
                System.out.print(" Dean's List. Great job!");
            else
                if (gpa < 2.0)
                System.out.println("Probation");
                System.out.println("Do better next time");


                System.out.nextLine();
                scanner.close();

    
}
