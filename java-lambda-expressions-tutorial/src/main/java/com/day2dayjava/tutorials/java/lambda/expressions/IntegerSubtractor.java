/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

/**
 ************************************************************************
 * Example interface to explain the lambda expressions accepting two	*
 * argument and also specifying explicit argument type.					*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public interface IntegerSubtractor {
	/**
	 * Does the integer subtraction.
	 * @param subtractFrom subtract from this number.
	 * @param subtractThis subtract this number.
	 * @return the remaining value post subtraction.
	 */
	int subtract(int subtractFrom, int subtractThis);
}
