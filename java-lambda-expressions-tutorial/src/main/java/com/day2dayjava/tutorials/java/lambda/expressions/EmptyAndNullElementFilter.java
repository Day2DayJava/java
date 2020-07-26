/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

import java.util.Collection;

/**
 ************************************************************************
 * Example interface to explain the lambda expressions with one			* 
 * argument.															*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public interface EmptyAndNullElementFilter {

	/**
	 * This method is going to remove all the null and empty elements if present in the passed collection.
	 * 
	 * @param collection that may have null or empty string values.
	 */
	void removeEmptyAndNullElements(Collection<String> collection);

}
