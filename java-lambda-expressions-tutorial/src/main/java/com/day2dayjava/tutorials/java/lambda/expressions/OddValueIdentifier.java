/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

/**
 ************************************************************************
 * Example interface to explain the lambda expressions accepting one	* 
 * argument and returning a value.										*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public interface OddValueIdentifier {

	/**
	 * Tells whether it is a odd number or not.
	 * 
	 * @param number to check for whether it is an odd number or even.
	 * @return true/false
	 */
	boolean isOddInteger(Integer number);

}
