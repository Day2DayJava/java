/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.day2dayjava.tutorials.java.interfaces.Car.CarStyle;

/**
 ************************************************************************
 *Tests for functional interface VehicleWash with a lambda expression.	*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class TestCarWashWithLambda {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Mock
	private HondaCar hondaCar;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.VehicleWash#wash(com.day2dayjava.tutorials.java.interfaces.Vehicle)}.
	 */
	@Test
	final void testVehicleWash() {
		when(hondaCar.getMake()).thenReturn("Honda");
		when(hondaCar.getMakeYear()).thenReturn(2020);
		when(hondaCar.getModel()).thenReturn("CRV EXL");
		when(hondaCar.getCarStyle()).thenReturn(CarStyle.SUV);
		when(hondaCar.getConfiguration()).thenCallRealMethod();

		VehicleWash<Vehicle> vehicleWashStation = (vehicle) -> {
			System.out.print(String.format("Your \"%s\" is clean now.", vehicle.getConfiguration()));
		};
		vehicleWashStation.wash(hondaCar);
		assertEquals("Your \"HondaCar [carStyle=SUV, make=Honda, makeYear=2020, model=CRV EXL]\" is clean now.",
				outContent.toString());
	}

}
