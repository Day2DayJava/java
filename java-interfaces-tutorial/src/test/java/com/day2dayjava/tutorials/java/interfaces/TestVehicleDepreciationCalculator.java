/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 ************************************************************************
 * Test class for VehicleDepreciationCalculator.						*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class TestVehicleDepreciationCalculator {

	@Mock
	private HondaCar hondaCar;
	@Mock
	private HondaMotorcycle hondaMotorcycle;

	/**
	 * Test method for 
	 * {@link com.day2dayjava.tutorials.java.interfaces.VehicleDepreciationCalculator#getCurrentVehicleValue(
	 * com.day2dayjava.tutorials.java.interfaces.Vehicle)}.
	 */
	@Test
	void testGetCurrentVehicleValue() {
		//Setup Honda car Mock
		when(hondaCar.getMakeYear()).thenReturn(2020);
		when(hondaCar.getBasePrice()).thenReturn(BigDecimal.valueOf(30000));

		//Setup Honda Motorcycle Mock
		when(hondaMotorcycle.getMakeYear()).thenReturn(2020);
		when(hondaMotorcycle.getBasePrice()).thenReturn(BigDecimal.valueOf(5000));

		assertEquals(BigDecimal.valueOf(30000), VehicleDepreciationCalculator.getCurrentVehicleValue(hondaCar));
		assertEquals(BigDecimal.valueOf(5000), VehicleDepreciationCalculator.getCurrentVehicleValue(hondaMotorcycle));

		//Let's change the make to 5 years back and test.
		when(hondaCar.getMakeYear()).thenReturn(2015);
		when(hondaMotorcycle.getMakeYear()).thenReturn(2015);

		assertEquals(BigDecimal.valueOf(27500), VehicleDepreciationCalculator.getCurrentVehicleValue(hondaCar));
		assertEquals(BigDecimal.valueOf(2500), VehicleDepreciationCalculator.getCurrentVehicleValue(hondaMotorcycle));

	}
}
