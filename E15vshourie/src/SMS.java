// E15, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM - 4:15PM

public class SMS {

	// Adds a student to the roster and alters their information. 
	private void loadSMS() {
		// Declares and instantiates a Course object. 
		Course my340Class = new Course();
		
		// Adds a student to the roster and updates their name to John Smith in the ArrayList.
		Student tmpStudent = my340Class.add();
		tmpStudent.setName("John Smith");
		
		// Changes the details of an existing student.
		my340Class.getStudentRoster().get(0).setName("Jonathan Smith");
		
		// Prints out the name of an existing student. 
		System.out.printf("The first student in "
				+ "the roster is %s.", my340Class.getStudentRoster().get(0).getName());
	}
	
	public static void main(String[] args) {
		// Declares and instantiates an SMS object.
		SMS myStudentSystem = new SMS();
		
		// Executes the program
		myStudentSystem.loadSMS();
	}
}
