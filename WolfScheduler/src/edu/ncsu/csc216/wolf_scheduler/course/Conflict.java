/**
 * 
 */
package edu.ncsu.csc216.wolf_scheduler.course;

/**Interface to ensure Conflict methods are implemented
 * @author NBoar
 *
 */
public interface Conflict {

	/**Method header for checkConflict() for Activity classes
	 * @param possibleConflictingActivity
	 * @throws ConflictException
	 */
	void checkConflict(Activity possibleConflictingActivity) throws ConflictException;

}
