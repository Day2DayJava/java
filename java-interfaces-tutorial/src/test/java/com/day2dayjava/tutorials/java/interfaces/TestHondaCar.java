/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.day2dayjava.tutorials.java.interfaces.Car.CarStyle;

/**
 ************************************************************************
 * Unit tests for class HondaCar.										*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
public class TestHondaCar {

	@Mock
	private HondaCar hondaCar;

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaCar#getConfiguration()}.
	 */
	@Test
	public final void testGetConfiguration() {
		when(hondaCar.getMake()).thenReturn("Honda");
		when(hondaCar.getMakeYear()).thenReturn(2020);
		when(hondaCar.getModel()).thenReturn("CRV EXL");
		when(hondaCar.getCarStyle()).thenReturn(CarStyle.SUV);
		when(hondaCar.getConfiguration()).thenCallRealMethod();
		assertEquals("HondaCar [carStyle=SUV, make=Honda, makeYear=2020, model=CRV EXL]", hondaCar.getConfiguration());
		verify(hondaCar).getConfiguration();
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaCar#getCarStyle()}.
	 */
	@Test
	public final void testGetCarStyle() {
		when(hondaCar.getCarStyle()).thenReturn(CarStyle.SUV);
		assertEquals(CarStyle.SUV, hondaCar.getCarStyle());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaCar#getMake()}.
	 */
	@Test
	public final void testGetMake() {
		when(hondaCar.getMake()).thenReturn("Honda");
		assertEquals("Honda", hondaCar.getMake());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaCar#getMakeYear()}.
	 */
	@Test
	public final void testGetMakeYear() {
		when(hondaCar.getMakeYear()).thenReturn(2020);
		assertEquals(2020, hondaCar.getMakeYear().intValue());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaCar#getModel()}.
	 */
	@Test
	public final void testGetModel() {
		when(hondaCar.getModel()).thenReturn("CRV EXL");
		assertEquals("CRV EXL", hondaCar.getModel());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaCar#getBasePrice()}.
	 */
	@Test
	public final void testGetBasePrice() {
		when(hondaCar.getBasePrice()).thenReturn(BigDecimal.valueOf(30000));
		assertEquals(BigDecimal.valueOf(30000), hondaCar.getBasePrice());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaCar#turnOnEconomyMode()}.
	 */
	@Test
	public final void testturnOnEconomyMode() {
		hondaCar.turnOnEconomyMode();
		verify(hondaCar).turnOnEconomyMode();
	}

}
