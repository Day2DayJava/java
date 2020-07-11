/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 ************************************************************************
 * Test class for LatestMakeVehicleSelector.							*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class TestLatestMakeVehicleSelector {

	@Mock
	Vehicle vehicleOne, vehicleTwo, vehicleThree, vehicleFour, vehicleFive;

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.LatestMakeVehicleSelector#getLatestMakeVehicles(java.util.List)}.
	 */
	@Test
	final void testGetLatestMakeVehicles() {
		//Setup the Mock.
		when(vehicleOne.getMakeYear()).thenReturn(2020);
		when(vehicleTwo.getMakeYear()).thenReturn(2015);
		when(vehicleThree.getMakeYear()).thenReturn(2019);
		when(vehicleFour.getMakeYear()).thenReturn(2020);
		when(vehicleFive.getMakeYear()).thenReturn(2015);

		List<Vehicle> latestVehicles = LatestMakeVehicleSelector
				.getLatestMakeVehicles(Arrays.asList(vehicleOne, vehicleTwo, vehicleThree, vehicleFour, vehicleFive));

		assertEquals(vehicleOne, latestVehicles.get(0));
		assertEquals(vehicleFour, latestVehicles.get(1));
		assertEquals(vehicleOne.getMakeYear(), latestVehicles.get(0).getMakeYear());
		assertEquals(vehicleFour.getMakeYear(), latestVehicles.get(1).getMakeYear());
		assertEquals(latestVehicles.size(), 2);
	}

}
