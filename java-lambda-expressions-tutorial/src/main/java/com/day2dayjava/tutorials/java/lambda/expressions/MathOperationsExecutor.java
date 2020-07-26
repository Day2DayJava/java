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
public class MathOperationsExecutor {
	/**
	 * Interface that performs integer subtraction.
	 */
	IntegerSubtractor integerSubtractor = null;
	/**
	 * Interface that performs long subtraction.
	 */
	LongSubtractor longSubtractor = null;

	/**
	 * Default constructor that takes a <code>IntegerSubtractor</code> and <code>LongSubtractor</code>
	 * as arguments.
	 * 
	 * @param integerSubtractor the instance of a class(or a lambda implementation) 
	 * that performs the long subtraction.
	 * @param longSubtractor the instance of a class(or a lambda implementation) 
	 * that performs the long subtraction.
	 */
	public MathOperationsExecutor(IntegerSubtractor integerSubtractor, LongSubtractor longSubtractor) {
		this.integerSubtractor = integerSubtractor;
		this.longSubtractor = longSubtractor;
	}

	/**
	 * Performs integer subtraction.
	 * @param subtractFrom subtract from this number.
	 * @param subtractThis subtract this number.
	 * @return the remaining value post subtraction.
	 */
	public int executeSubtraction(int subtractFrom, int subtractThis) {
		return integerSubtractor.subtract(subtractFrom, subtractThis);
	}

	/**
	 * Performs long subtraction.
	 * @param subtractFrom subtract from this number.
	 * @param subtractThis subtract this number.
	 * @return the remaining value post subtraction.
	 */
	public long executeSubtraction(long subtractFrom, long subtractThis) {
		return longSubtractor.subtract(subtractFrom, subtractThis);
	}
}
