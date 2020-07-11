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
 * Unit tests for TeslaCar.																		*
 *																		*
 * @author D2DJ														*                                                              *
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class TestTeslaCar {

	@Mock
	TeslaCar teslaCar;

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.TeslaCar#getConfiguration()}.
	 */
	@Test
	final void testGetConfiguration() {
		when(teslaCar.getMake()).thenReturn("Tesla");
		when(teslaCar.getMakeYear()).thenReturn(2020);
		when(teslaCar.getModel()).thenReturn("S");
		when(teslaCar.getCarStyle()).thenReturn(CarStyle.SUV);
		when(teslaCar.getConfiguration()).thenCallRealMethod();
		assertEquals("TeslaCar [carStyle=SUV, make=Tesla, makeYear=2020, model=S]", teslaCar.getConfiguration());
		verify(teslaCar).getConfiguration();
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.TeslaCar#getCarStyle()}.
	 */
	@Test
	final void testGetCarStyle() {
		when(teslaCar.getCarStyle()).thenReturn(CarStyle.SUV);
		assertEquals(CarStyle.SUV, teslaCar.getCarStyle());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.TeslaCar#getMake()}.
	 */
	@Test
	final void testGetMake() {
		when(teslaCar.getMake()).thenReturn("Tesla");
		assertEquals("Tesla", teslaCar.getMake());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.TeslaCar#getMakeYear()}.
	 */
	@Test
	final void testGetMakeYear() {
		when(teslaCar.getMakeYear()).thenReturn(2020);
		assertEquals(2020, teslaCar.getMakeYear().intValue());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.TeslaCar#getModel()}.
	 */
	@Test
	final void testGetModel() {
		when(teslaCar.getModel()).thenReturn("S");
		assertEquals("S", teslaCar.getModel());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.TeslaCar#getBasePrice()}.
	 */
	@Test
	final void testGetBasePrice() {
		when(teslaCar.getBasePrice()).thenReturn(BigDecimal.valueOf(30000));
		assertEquals(BigDecimal.valueOf(30000), teslaCar.getBasePrice());
	}

}
