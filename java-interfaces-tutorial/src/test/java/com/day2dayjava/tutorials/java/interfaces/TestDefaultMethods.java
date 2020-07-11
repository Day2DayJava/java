/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 ************************************************************************
 * Tests the default method feature provided by Java interfaces.		*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class TestDefaultMethods {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Mock
	private HondaCar hondaCar;

	@Mock
	private TeslaCar teslaCar;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.Vehicle#turnOnEconomyMode()}.
	 */
	@Test
	final void testDefaultMethods() {

		//Honda Car would run it's overridden method and would not throw the exception thrown by the default implementation.
		doCallRealMethod().when(hondaCar).turnOnEconomyMode();
		hondaCar.turnOnEconomyMode();
		verify(hondaCar).turnOnEconomyMode();
		assertEquals("Economy mode is on now.", outContent.toString());

		doCallRealMethod().when(teslaCar).turnOnEconomyMode();

		//Tesla Car would throw the exception thrown by the default implementation as it doesn't override the default behavior.
		UnsupportedOperationException unsupportedOperationException = assertThrows(UnsupportedOperationException.class,
				teslaCar::turnOnEconomyMode,
				"Tesla car is not supposed to have a economy mode and should have thrown UnsupportedOperationException.");
		assertEquals("Eco mode is not available for your vehicle.", unsupportedOperationException.getMessage());
	}

}
