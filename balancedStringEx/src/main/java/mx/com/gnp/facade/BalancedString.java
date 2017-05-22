/**
 * @author Alex GJG
 *
 */
package mx.com.gnp.facade;

public interface BalancedString {

	/**
	 * Method to validate the balanced in a string using Stacks in this order "{([]}".
	 * 
	 * @param op String to be tested.
	 * @return true if its balanced, false if its not.
	 */
	public boolean isCorrect(String op);
}
