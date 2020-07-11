/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import static com.day2dayjava.tutorials.java.interfaces.VehicleMetricsCalculationHelper.getAvailableDrivingDistanceInKiloMeters;
import static com.day2dayjava.tutorials.java.interfaces.VehicleMetricsCalculationHelper.getAvailableDrivingDistanceInMiles;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 ************************************************************************
 * Test	class for VehicleMetricsCalculationHelper						*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
class TestVehicleMetricsCalculatorHelper {

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.VehicleMetricsCalculationHelper#getAvailableDrivingDistanceInMiles(java.math.BigDecimal,java.math.BigDecimal)}.
	 */
	@Test
	final void testGetAvailableDrivingDistanceInMiles() {
		BigDecimal vehiclesMilesPerGallon = BigDecimal.valueOf(25);
		BigDecimal remainingFuelInGallons = BigDecimal.valueOf(2.5);
		BigDecimal availableDrivingDistanceInMiles = getAvailableDrivingDistanceInMiles(vehiclesMilesPerGallon,
				remainingFuelInGallons);
		assertEquals(BigDecimal.valueOf(62.5), availableDrivingDistanceInMiles);
	}

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.VehicleMetricsCalculationHelper#getAvailableDrivingDistanceInKiloMeters(java.math.BigDecimal,java.math.BigDecimal)}.
	 */
	@Test
	final void testGetAvailableDrivingDistanceInKiloMeters() {
		BigDecimal vehiclesKiloMetersPerLitre = BigDecimal.valueOf(25);
		BigDecimal remainingFuelInLitres = BigDecimal.valueOf(2.5);
		BigDecimal availableDrivingDistanceInKiloMeters = getAvailableDrivingDistanceInKiloMeters(
				vehiclesKiloMetersPerLitre, remainingFuelInLitres);
		assertEquals(BigDecimal.valueOf(62.5), availableDrivingDistanceInKiloMeters);
	}
}
