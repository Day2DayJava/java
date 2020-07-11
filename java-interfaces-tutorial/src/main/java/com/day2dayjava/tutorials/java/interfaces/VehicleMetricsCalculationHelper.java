/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import java.math.BigDecimal;

/**
 ************************************************************************
 * Utility interface to keep the helper calculation methods for various *
 * vehicle matrices.													*
 * 																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public interface VehicleMetricsCalculationHelper {

	/**
	 * Returns the remaining distance Miles to which a vehicle could drive given the remaining fuel.
	 * 
	 * @param vehiclesMilesPerGallon vehicle average MPG
	 * @param remainingFuelInGallons remaining fuel in vehicle.
	 * @return how many miles the vehicle can go with the given remaining fuel.
	 */
	public static BigDecimal getAvailableDrivingDistanceInMiles(BigDecimal vehiclesMilesPerGallon,
			BigDecimal remainingFuelInGallons) {
		return getAvailableDrivingDistance(vehiclesMilesPerGallon, remainingFuelInGallons);
	}

	/**
	 * Returns the remaining distance in KiloMeters to which a vehicle could drive given the remaining fuel.
	 * 
	 * @param vehiclesKiloMetersPerLitre vehicle average KMPL
	 * @param remainingFuelInLitres remaining fuel in vehicle.
	 * @return how many Kilo Meters the vehicle can go with the given remaining fuel.
	 */
	public static BigDecimal getAvailableDrivingDistanceInKiloMeters(BigDecimal vehiclesKiloMetersPerLitre,
			BigDecimal remainingFuelInLitres) {
		return getAvailableDrivingDistance(vehiclesKiloMetersPerLitre, remainingFuelInLitres);
	}

	/**
	 * Returns the remaining distance to which a vehicle could drive given the remaining fuel.
	 * 
	 * @param vehicesFuelAverage vehicle average.
	 * @param remainingFuel remaining fuel in vehicle.
	 * @return how far the vehicle can go with the given remaining fuel.
	 */
	private static BigDecimal getAvailableDrivingDistance(BigDecimal vehicesFuelAverage, BigDecimal remainingFuel) {
		return remainingFuel.multiply(vehicesFuelAverage);
	}
}
