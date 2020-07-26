/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

/**
 ************************************************************************
 * Example interface to explain the lambda expressions taking two 	 	* 
 * arguments and returning a value.										*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public interface FullUserNameProducer {

	/**
	 * This method should concatenate the first and last name.
	 * @param firstName first name of the user.
	 * @param lastName last name of the user.
	 * @return combined full name of the user.
	 */
	String getFullUserName(String firstName, String lastName);

}
