/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

/**
 ************************************************************************
 * Example interface to explain the lambda expressions using a variable	* 
 * from it's enclosing scope.											*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public interface OneToTenTablePrinter {

	/**
	 * Prints the mathematical table for a given number(picks it up from the enclosing scope).
	 */
	void printTable();
}
