package edu.ncsu.csc216.wolf_scheduler.course;

/**Custom exception class for conflicting activities
 * @author NBoar
 *
 */
public class ConflictException extends Exception {

	/** ID used for serialization. */
	private static final long serialVersionUID = 1L;

	/**ConFlictException is a custom exception for when two activities occur at conflicting times
	 * @param s Custom exception message to pass to the call
	 */
	public ConflictException (String s) {
		super(s);
	}
	
	/**ConFlictException is a custom exception for when two activities occur at conflicting times
	 * 
	 */
	public ConflictException() {
		super("Schedule conflict.");
	}
}
