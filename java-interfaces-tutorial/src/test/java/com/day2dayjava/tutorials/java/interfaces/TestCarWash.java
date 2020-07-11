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

import com.day2dayjava.tutorials.java.interfaces.Car.CarStyle;

/**
 ************************************************************************
 * Tests for class CarWash												*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class TestCarWash {

	@Mock
	private HondaCar hondaCar;

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.CarWash#wash(com.day2dayjava.tutorials.java.interfaces.Car)}.
	 */
	@Test
	final void testWash() {
		//Setup the mocks.
		when(hondaCar.getMake()).thenReturn("Honda");
		when(hondaCar.getMakeYear()).thenReturn(2020);
		when(hondaCar.getModel()).thenReturn("CRV EXL");
		when(hondaCar.getCarStyle()).thenReturn(CarStyle.SUV);
		when(hondaCar.getConfiguration()).thenCallRealMethod();

		VehicleWash<Car> carWashStation = new CarWash();
		carWashStation.wash(hondaCar);
		verify(hondaCar).getConfiguration();
	}

}
