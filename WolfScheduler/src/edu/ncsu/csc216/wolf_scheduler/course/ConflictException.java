package edu.ncsu.csc216.wolf_scheduler.course;

public class ConflictException extends Exception {

	/** ID used for serialization. */
	private static final long serialVersionUID = 1L;

	public ConflictException (String s) {
		super(s);
	}
	
	public ConflictException() {
		super("Schedule conflict.");
	}
}
