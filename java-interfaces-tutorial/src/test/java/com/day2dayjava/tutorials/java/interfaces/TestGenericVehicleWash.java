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
import com.day2dayjava.tutorials.java.interfaces.Motorcycle.MotorCycleStyle;

/**
 ************************************************************************
 * Tests for GenericVehicleWash.										*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class TestGenericVehicleWash {

	@Mock
	private HondaCar hondaCar;
	@Mock
	private HondaMotorcycle hondaMotorcycle;

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.GenericVehicleWash#wash(com.day2dayjava.tutorials.java.interfaces.Vehicle)}.
	 */
	@Test
	final void testWash() {
		//Setup the mocks.
		when(hondaCar.getMake()).thenReturn("Honda");
		when(hondaCar.getMakeYear()).thenReturn(2020);
		when(hondaCar.getModel()).thenReturn("CRV EXL");
		when(hondaCar.getCarStyle()).thenReturn(CarStyle.SUV);
		when(hondaCar.getConfiguration()).thenCallRealMethod();

		when(hondaMotorcycle.getMake()).thenReturn("Honda");
		when(hondaMotorcycle.getMakeYear()).thenReturn(2020);
		when(hondaMotorcycle.getModel()).thenReturn("Pulsor");
		when(hondaMotorcycle.getMotorCycleStyle()).thenReturn(MotorCycleStyle.STANDARD);
		when(hondaMotorcycle.getConfiguration()).thenCallRealMethod();

		VehicleWash<HondaCar> vehicleCarWashStation = new GenericVehicleWash<>();
		vehicleCarWashStation.wash(hondaCar);
		verify(hondaCar).getConfiguration();

		VehicleWash<HondaMotorcycle> vehicleMotorcycleWashStation = new GenericVehicleWash<>();
		vehicleMotorcycleWashStation.wash(hondaMotorcycle);
		verify(hondaMotorcycle).getConfiguration();
	}
}
