
package ie.nuigalway.bcarroll;

// Student class.

// Student Id:   12367146
// Student Name: Brian Carroll
// CT417 - Software Engineering III, Assignment 1, Student Data Object
//
// September, 2016
//

import java.time.*;

public class Student {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

    private String surname;    	// Student Surname
    private String firstName;	// Student Firstname
    private String sid;			// Student Id
    private LocalDate dob;		// Student course
    private int age;

    // constructor for class Student
    public Student(String surname, String firstName, String sid, LocalDate dob) {
    	this.surname = surname;
    	this.firstName = firstName;
    	this.sid = sid;
    	this.dob = dob;

    	// Calculate age
    	LocalDate today = LocalDate.now();
    	Period p = Period.between(dob, today);

    	this.age = p.getYears();
    }

    // Getter methods
	public String getName(){
		return firstName + " " + surname;
	}

	public String getId(){
		return sid;
	}

	public int getAge(){
		return age;
	}

	public LocalDate getDOB(){
		return dob;
	}

	public String getUsername() {
		String finitial = ""+firstName.charAt(0);
		String uname = surname + finitial + age;
		return uname.toLowerCase();

	}

    // get String representation of Student, comma delimited
    public String toString() {
    	return "Student: "+surname+"|"+firstName+"|"+sid+"|"+dob+"|"+age+"|"+getUsername();
    }

} // end class Student
