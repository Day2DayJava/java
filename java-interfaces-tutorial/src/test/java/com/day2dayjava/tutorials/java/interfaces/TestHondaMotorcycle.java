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

import com.day2dayjava.tutorials.java.interfaces.Motorcycle.MotorCycleStyle;

/**
 ************************************************************************
 * Unit tests for class HondaMotorcycle.								*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class TestHondaMotorcycle {

	@Mock
	private HondaMotorcycle hondaMotorcycle;

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaMotorcycle#getConfiguration()}.
	 */
	@Test
	public final void testGetConfiguration() {
		when(hondaMotorcycle.getMake()).thenReturn("Honda");
		when(hondaMotorcycle.getMakeYear()).thenReturn(2020);
		when(hondaMotorcycle.getModel()).thenReturn("Pulsor");
		when(hondaMotorcycle.getMotorCycleStyle()).thenReturn(MotorCycleStyle.STANDARD);
		when(hondaMotorcycle.getConfiguration()).thenCallRealMethod();
		assertEquals("HondaMotorcycle [motorCycleStyle=STANDARD, make=Honda, makeYear=2020, model=Pulsor]",
				hondaMotorcycle.getConfiguration());
		verify(hondaMotorcycle).getConfiguration();
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaMotorcycle#getMotorCycleStyle()}.
	 */
	@Test
	final void testGetMotorCycleStyle() {
		when(hondaMotorcycle.getMotorCycleStyle()).thenReturn(MotorCycleStyle.STANDARD);
		assertEquals(MotorCycleStyle.STANDARD, hondaMotorcycle.getMotorCycleStyle());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaMotorcycle#getMake()}.
	 */
	@Test
	final void testGetMake() {
		when(hondaMotorcycle.getMake()).thenReturn("Honda");
		assertEquals("Honda", hondaMotorcycle.getMake());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaMotorcycle#getMakeYear()}.
	 */
	@Test
	final void testGetMakeYear() {
		when(hondaMotorcycle.getMakeYear()).thenReturn(2020);
		assertEquals(2020, hondaMotorcycle.getMakeYear().intValue());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaMotorcycle#getModel()}.
	 */
	@Test
	final void testGetModel() {
		when(hondaMotorcycle.getModel()).thenReturn("Pulsor");
		assertEquals("Pulsor", hondaMotorcycle.getModel());
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.HondaMotorcycle#getBasePrice()()}.
	 */
	@Test
	public final void testGetBasePrice() {
		when(hondaMotorcycle.getBasePrice()).thenReturn(BigDecimal.valueOf(5000));
		assertEquals(BigDecimal.valueOf(5000), hondaMotorcycle.getBasePrice());
	}
}
