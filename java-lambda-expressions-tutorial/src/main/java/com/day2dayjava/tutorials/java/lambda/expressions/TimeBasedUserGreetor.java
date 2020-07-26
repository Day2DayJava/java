/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

import java.time.ZonedDateTime;

/**
 ************************************************************************
 * Example interface to explain the lambda expressions with two			* 
 * arguments.															*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public interface TimeBasedUserGreetor {

	/**
	 * Greets a user based on the time of the day.
	 * 
	 * @param userName user name to greet with.
	 * @param dateAndTime date and time to identify the time of the day.
	 */
	void greetUser(String userName, ZonedDateTime dateAndTime);
}
