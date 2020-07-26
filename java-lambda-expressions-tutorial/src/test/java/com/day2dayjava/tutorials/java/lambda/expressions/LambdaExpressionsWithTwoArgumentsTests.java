/**
 * 
 */
package com.day2dayjava.tutorials.java.lambda.expressions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
 * Tests for understanding Lambda Expressions with two arguments.		*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LambdaExpressionsWithTwoArgumentsTests {

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
	 * Test method for {@link com.day2dayjava.tutorials.java.lambda.expressions.TimeBasedUserGreetor#greetUser(String, java.time.ZonedDateTime)}.
	 */
	@Test
	@Order(1)
	final void testLambdaAcceptingTwoArguments() {
		TimeBasedUserGreetor timeBasedUserGreetor = (userName, dateAndTime) -> {
			Integer hourOfTheDay = -1;
			if (dateAndTime != null) {
				hourOfTheDay = dateAndTime.getHour();
			}
			if (userName == null || userName.trim().isEmpty()) {
				userName = "Guest";
			}
			if (hourOfTheDay < 12) {
				System.out.print(String.format("Good Morning %s", userName));
			} else if (hourOfTheDay < 16) {
				System.out.print(String.format("Good Afternoon %s", userName));
			} else if (hourOfTheDay < 23) {
				System.out.print(String.format("Good Evening %s", userName));
			} else {
				System.out.print(String.format("Welcome %s", userName));
			}
		};
		String userName = "John";
		LocalDateTime localDateTime = LocalDateTime.of(2020, Month.JULY, 25, 16, 30);
		ZonedDateTime californiaTimeOfTheDay = ZonedDateTime.of(localDateTime, ZoneId.of("America/Los_Angeles"));

		timeBasedUserGreetor.greetUser(userName, californiaTimeOfTheDay);

		assertEquals(String.format("Good Evening %s", userName), outputContent.toString());
	}

	/**
	 * Shows the use of a lambda expression accepting two arguments with the Java API.
	 */
	@Test
	@Order(2)
	final void testLambdaAcceptingTwoArgumentsJavaAPI() {

		Map<String, String> famousSportsPersons = new LinkedHashMap<>();
		famousSportsPersons.put("Muhammad", "Ali");
		famousSportsPersons.put("Roger", "Federer");
		famousSportsPersons.put("Michael", "Schumacher");
		famousSportsPersons.put("Lance", "Armstrong");
		famousSportsPersons.put("Usain", "Bolt");

		famousSportsPersons.forEach((k, v) -> System.out.print(k + " " + v + ", "));

		assertEquals("Muhammad Ali, Roger Federer, Michael Schumacher, Lance Armstrong, Usain Bolt, ",
				outputContent.toString());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.lambda.expressions.FullUserNameProducer#getFullUserName(String, String)}.
	 */
	@Test
	@Order(3)
	final void testLambdaAcceptingTwoArgumentsReturningValue() {
		FullUserNameProducer fullUserNameProducer = (firstName, lastName) -> String.format("%s %s", firstName,
				lastName);

		assertEquals("Michael Phelps", fullUserNameProducer.getFullUserName("Michael", "Phelps"));
	}

	/**
	 * Shows the use of a lambda expression accepting two arguments and returning a value with the Java API.
	 */
	@Test
	@Order(4)
	final void testLambdaAcceptingTwoArgumentsReturningValueJavaAPI() {
		List<Integer> unsortedData = new ArrayList<>(Arrays.asList(9, 7, 1, 5, 4, 3, 0));
		Collections.sort(unsortedData, (valueOne, valueTwo) -> valueOne.compareTo(valueTwo));

		//The unsortedData should be sorted now.
		assertEquals(0, unsortedData.get(0));
		assertEquals(1, unsortedData.get(1));
		assertEquals(3, unsortedData.get(2));
		assertEquals(4, unsortedData.get(3));
		assertEquals(5, unsortedData.get(4));
		assertEquals(7, unsortedData.get(5));
		assertEquals(9, unsortedData.get(6));
	}

}
