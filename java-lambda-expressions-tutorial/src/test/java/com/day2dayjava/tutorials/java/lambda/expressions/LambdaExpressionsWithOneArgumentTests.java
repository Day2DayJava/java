/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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
 * Tests for understanding Lambda Expressions with one argument.		*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LambdaExpressionsWithOneArgumentTests {

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
	 * Test method for {@link com.day2dayjava.tutorials.java.lambda.expressions.EmptyAndNullElementFilter#removeEmptyAndNullElements(java.util.Collection)}.
	 */
	@Test
	@Order(1)
	final void testLambdaAcceptingOneArgument() {
		List<String> unFilteredData = new ArrayList<>(Arrays.asList("One", null, "Two", "Three", "Four", null, "Five"));

		assertEquals(7, unFilteredData.size());

		EmptyAndNullElementFilter emptyAndNullElementFilter = (collection) -> {
			if (collection != null && !collection.isEmpty()) {
				Iterator<String> iterator = collection.iterator();
				while (iterator.hasNext()) {
					String element = iterator.next();
					if (element == null || element.trim().isEmpty()) {
						iterator.remove();
					}
				}
			}
		};

		emptyAndNullElementFilter.removeEmptyAndNullElements(unFilteredData);

		assertEquals(5, unFilteredData.size());
	}

	/**
	 * Shows the use of a lambda expression accepting one argument with the Java API.
	 */
	@Test
	@Order(2)
	final void testLambdaAcceptingOneArgumentJavaAPI() {
		List<Integer> numbersUptoFive = List.of(1, 2, 3, 4, 5);

		numbersUptoFive.forEach(number -> System.out.print(number));

		assertEquals("12345", outputContent.toString());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.lambda.expressions.OddValueIdentifier#isOddInteger(Integer)}.
	 */
	@Test
	@Order(3)
	final void testLambdaAcceptingOneArgumentReturningValue() {
		OddValueIdentifier oddValueIdentifier = valueToValidate -> valueToValidate % 2 == 1;

		assertTrue(oddValueIdentifier.isOddInteger(7));
		assertFalse(oddValueIdentifier.isOddInteger(6));
	}

	/**
	 * Shows the use of a lambda expression accepting one argument and returning a value with the Java API.
	 */
	@Test
	@Order(4)
	final void testLambdaAcceptingOneArgumentReturningValueJavaAPI() {
		List<String> unFilteredData = new ArrayList<>(Arrays.asList("One", null, "Two", "Three", "Four", null, "Five"));

		assertEquals(7, unFilteredData.size());

		unFilteredData = unFilteredData.stream().filter(element -> element != null && !element.trim().isEmpty())
				.collect(Collectors.toList());

		assertEquals(5, unFilteredData.size());
	}

}
