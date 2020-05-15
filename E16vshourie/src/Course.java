// E16, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM-4:15PM.

import java.util.ArrayList;

public class Course {
	
	// Variables declared to store important attributes of a course.
	private int studentCount = 0;
	private String coursePrefix;
	private int courseNumber;
	private static String collegeName;
	private double classAverage = 0.0;
	
	// Declares an arrayList of Students for the course. 
	ArrayList<Student> studentRoster;
	
	// Instantiates fields/allocates memory for fields for the course objects.
	public Course() {
		studentRoster = new ArrayList<Student>();
	}
	
	// Retrieves the student count for an object.
	public int getStudentCount() {
		return studentCount;
	}
	
	// Retrieves access of the arrayList of students for the user. 
	public ArrayList<Student> getStudentRoster() {
		return this.studentRoster;
	}
	
	// Retrieves the coursePrefix value for the user. 
	public String getCoursePrefix() {
		return coursePrefix.toUpperCase();
	}
	
	// Sets a Course object's course prefix value for the user. 
	public void setCoursePrefix(String coursePrefix) {
		this.coursePrefix = coursePrefix;
	}
	
	// Retrieves the courseNumber for the user.
	public int getCourseNumber() {
		return courseNumber;
	}
	
	// Sets the course number of a course object for the user. 
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	// Retrieves the college name for the user.
	public static String getCollegeName() {
		return collegeName;
	}
	
	// Sets the college's name for all objects.
	public static void setCollegeName(String collegeName) {
		Course.collegeName = collegeName;
	}
	
	// Retrieves a Course object's class average for the user.
	public double getClassAverage() {
		return classAverage;
	}
	
	// METHODS TO MANAGE BEHAVIOR
	
	// Prints out a one line message to the Console.
	public void displayMessage() {
		System.out.println("Welcome to " + getCoursePrefix() + " " + getCourseNumber() + "!");
	}
	
	// Adds a student to the roster and returns the student to another part of the program. 
	public Student add() {
		Student tmpStudent = new Student();
		
		studentRoster.add(tmpStudent);
		studentCount++;
		
		return tmpStudent;
	}
	
	// Also adds a student to the roster and returns the student to another part of the program.
	public void add(Student tmpStudent) {
		studentRoster.add(tmpStudent);
		
		studentCount++;
	}
	
	// Provides a chance for the user to print all students' information simultaneously.
	public void printRoster() {
		for(Student s : studentRoster) {
			s.printInformation();
		}
	}
	
}
