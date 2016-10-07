
package ie.nuigalway.bcarroll;

// Course class.

// Student Id:   12367146
// Student Name: Brian Carroll
// CT417 - Software Engineering III, Assignment 1, Module Data Object
//
// September, 2016
//

import java.util.*;
import java.time.*;

public class Course {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

    private String courseName;  // Module name
    private String cid;			// Course Id
    private LocalDate start;	// Course start date
    private LocalDate end;		// Course end date
    private List<Module> modules;		// List of modules on this Course

    // constructor for class Module
    public Course(String courseName, String cid, LocalDate start, LocalDate end) {
    	this.courseName = courseName;
    	this.cid = cid;
    	this.start = start;
    	this.end = end;
    	this.modules = new ArrayList<Module>();
    }

    // Getter methods
	public String getName(){
		return courseName;
	}

	public String getCid(){
		return cid;
	}

	public LocalDate getStart(){
		return start;
	}

	public LocalDate getEnd(){
		return end;
	}

	public void addModule(Module mid) {
		modules.add(mid);
	}


    // get String representation of Course, | delimited
    public String toString() {
    	return "Course: "+courseName+"|"+cid+"|"+start+"|"+end+"|"+modules.size()+" modules";
    }

} // end class Course
