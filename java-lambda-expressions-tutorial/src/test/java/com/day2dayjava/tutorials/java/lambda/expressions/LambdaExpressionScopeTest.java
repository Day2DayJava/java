/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
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

	@Mock
	private OneToTenTablePrinter oneToTenTablePrinter;

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
	 * Test method for {@link com.day2dayjava.tutorials.java.lambda.expressions.OneToTenTablePrinter#printTable(int)}.
	 */
	@Test
	final void testPrintTable() {
		doCallRealMethod().when(oneToTenTablePrinter).printTable(Mockito.anyInt());
		oneToTenTablePrinter.printTable(2);
		verify(oneToTenTablePrinter).printTable(2);
		assertEquals("2 4 6 8 10 12 14 16 18 20 ", originalOutputStream.toString());
	}

}
