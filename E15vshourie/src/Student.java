// E15, Varun Shourie, CIS340, Tuesday/Thursday, 3:00PM-4:15PM

public class Student {
	
	// Class fields which describe the characteristics of each and every student. 
	private String name;
	private String id;
	
	// Initializes a set of fields for the Student class based on user input. 
	public Student() {
		System.out.println("A new student has been created.");
	}
	
	// Initializes a set of fields for the Student class based on user input.
	public Student(String name) {
		setName(name);
		System.out.printf("A new student, %s, has been created.\n");
	}
	
	// Initializes a set of fields for the Student class based on user input.
	public Student(String name, String id) {
		setName(name);
		setId(id);
		System.out.printf("A new student, %s, with ID#%s has been created.\n", name, id);
	}
	
	// Retrieves the name for the user for an object.
	public String getName() {
		return name;
	}
	
	// Sets the value of the name for an object.
	public void setName(String name) {
		this.name = name;
	}
	
	// Retrieves the value of the ID for an object.
	public String getId() {
		return id;
	}
	
	// Sets the value of the ID for an object.
	public void setId(String id) {
		this.id = id;
	}

}


