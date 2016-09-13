package edu.ncsu.csc216.wolf_scheduler.course;

public class ConflictException extends Exception {

	/** ID used for serialization. */
	private static final long serialVersionUID = 1L;

	ConflictException (String s) {
		super(s);
	}
	
	ConflictException() {
		super("Schedule conflict.");
	}
}
