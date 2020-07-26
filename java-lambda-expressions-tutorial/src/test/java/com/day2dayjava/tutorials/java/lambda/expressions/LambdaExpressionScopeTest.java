/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 ************************************************************************
 * Tests for understanding Lambda expression's access to the enclosing 	*
 * scope.																*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class LambdaExpressionScopeTest {

	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	private final PrintStream originalOutputStream = System.out;

	/**
	 * By default System.out writes to the console, set the output stream to our own output stream. 
	 * This will enables us to read it if needed for validating the output written by the System.out.
	 */
	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outputContent));
	}

	/**
	 * After the test is complete set output stream for System.out back to the default stream.
	 */
	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOutputStream);
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.lambda.expressions.OneToTenTablePrinter#printTable()}.
	 */
	@Test
	final void testPrintTable() {
		int inputNumber = 2;
		//inputNumber = 6;
		OneToTenTablePrinter tablePrinter = () -> {
			//int inputNumber = 8;
			for (int i = 1; i <= 10; i++) {
				System.out.print((inputNumber * i) + " ");
			}
		};
		tablePrinter.printTable();
		assertEquals("2 4 6 8 10 12 14 16 18 20 ", outputContent.toString());
	}

}
