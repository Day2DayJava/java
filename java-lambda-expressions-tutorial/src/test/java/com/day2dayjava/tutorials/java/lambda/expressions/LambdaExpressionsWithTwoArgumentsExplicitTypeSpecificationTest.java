/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 ************************************************************************
 * Tests for understanding a use case where we might want to explicitly *
 * specify the argument type											*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class LambdaExpressionsWithTwoArgumentsExplicitTypeSpecificationTest {

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.lambda.expressions.MathOperationsExecutor#MathOperationsExecutor(com.day2dayjava.tutorials.java.lambda.expressions.IntegerSubtractor, com.day2dayjava.tutorials.java.lambda.expressions.LongSubtractor)}.
	 */
	@Test
	final void testMathOperationsExecutor() {
		//@formatter:off
		MathOperationsExecutor mathOperationsExecutor = new MathOperationsExecutor(
				(int subtractFrom, int subtractThis) -> {return subtractFrom - subtractThis;},
				(long subtractFrom, long subtractThis) -> {return subtractFrom - subtractThis;}
				);
		//@formatter:on
		assertEquals(5, mathOperationsExecutor.executeSubtraction(10, 5));
		assertEquals(5l, mathOperationsExecutor.executeSubtraction(10l, 5l));
	}

}
