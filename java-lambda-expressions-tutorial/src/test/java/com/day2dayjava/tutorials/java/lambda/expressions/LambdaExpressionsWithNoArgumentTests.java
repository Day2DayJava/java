/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 ************************************************************************
 * Tests for understanding Lambda Expressions with no arguments.		*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LambdaExpressionsWithNoArgumentTests {

	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	private final PrintStream originalOutputStream = System.out;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outputContent));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOutputStream);
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.lambda.expressions.RandomNumberPrinter#printRandomNumber()}.
	 */
	@Test
	@Order(1)
	final void testLambdaAcceptingNoArgument() {

		RandomNumberPrinter randomNumberPrinter = () -> System.out
				.print(String.format("Your random number is \"%s\".", Math.random()));

		randomNumberPrinter.printRandomNumber();

		assertFalse(outputContent.toString().isEmpty());
	}

	/**
	 * Test method for explaining the use of lambda expression with no argument with Java API.
	 */
	@Test
	@Order(2)
	final void testLambdaAcceptingNoArgumentJavaAPI() throws Exception {
		Thread executorThread = new Thread(() -> System.out.print("Runnable Method Called by the Executor Thread."));
		executorThread.start();
		executorThread.join();
		assertEquals(outputContent.toString(), "Runnable Method Called by the Executor Thread.");
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.lambda.expressions.UserGreeter#greetUser()}.
	 */
	@Test
	@Order(3)
	final void testLambdaAcceptingNoArgumentReturningValue() {

		UserGreeter userGreeter = () -> "Welcome to Day2DayJava.";

		assertEquals("Welcome to Day2DayJava.", userGreeter.greetUser());
	}

	/**
	 * Test method for explaining the use of lambda expression with no argument and returning a value with Java API.
	 */
	@Test
	@Order(4)
	final void testLambdaAcceptingNoArgumentReturningValueJavaAPI() throws Exception {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Future<String> resultFuture = executorService.submit(() -> "Callable Method called by the Executor Service.");

		assertEquals("Callable Method called by the Executor Service.", resultFuture.get());
	}

}
