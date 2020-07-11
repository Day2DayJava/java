/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.day2dayjava.tutorials.java.interfaces.Motorcycle.MotorCycleStyle;

/**
 ************************************************************************
 * Tests for class MotorcycleWash										*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class TestMotorcycleWash {

	@Mock
	private HondaMotorcycle hondaMotorcycle;

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.MotorcycleWash#wash(com.day2dayjava.tutorials.java.interfaces.Motorcycle)}.
	 */
	@Test
	final void testWash() {
		//Setup the mocks.
		when(hondaMotorcycle.getMake()).thenReturn("Honda");
		when(hondaMotorcycle.getMakeYear()).thenReturn(2020);
		when(hondaMotorcycle.getModel()).thenReturn("Pulsor");
		when(hondaMotorcycle.getMotorCycleStyle()).thenReturn(MotorCycleStyle.STANDARD);
		when(hondaMotorcycle.getConfiguration()).thenCallRealMethod();

		VehicleWash<Motorcycle> motorcycleWashStation = new MotorcycleWash();
		motorcycleWashStation.wash(hondaMotorcycle);
		verify(hondaMotorcycle).getConfiguration();
	}
}
