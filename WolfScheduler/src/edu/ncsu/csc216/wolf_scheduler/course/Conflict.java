/**
 * 
 */
package edu.ncsu.csc216.wolf_scheduler.course;

/**
 * @author NBoar
 *
 */
public interface Conflict {

	void checkConflict(Activity possibleConflictingActivity) throws ConflictException;

}
