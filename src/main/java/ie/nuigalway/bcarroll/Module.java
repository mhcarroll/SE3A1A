
package ie.nuigalway.bcarroll;

import java.util.ArrayList;
import java.util.List;


// Module class.

// Student Id:   12367146
// Student Name: Brian Carroll
// CT417 - Software Engineering III, Assignment 1, Module Data Object
//
// September, 2016
//

public class Module {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

    private String moduleName;  // Module name
    private String mid;			// Student Id
    private List<Student> students;		// List of Students taking this Module


    // constructor for class Module
    public Module(String moduleName, String mid) {
    	this.moduleName = moduleName;
    	this.mid = mid;
    	this.students = new ArrayList<Student>();
    }

    // Getter methods
	public String getName(){
		return moduleName;
	}

	public String getMid(){
		return mid;
	}

	public void addStudent(Student sid) {
		students.add(sid);
	}


    // get String representation of Student, comma delimited
    public String toString() {
    	return "Module: "+moduleName+"|"+mid+"|"+students.size()+" students";
    }

} // end class Module
