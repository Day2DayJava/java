/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 ************************************************************************
 * Utility class to calculate a vehicle's current value based on its age*
 * considering that a vehicle's value decreases due to depreciation.	*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public abstract class VehicleDepreciationCalculator {

	private static final int DEPRECIATION_EVERY_YEAR = 500;

	/**
	 * Returns the current vehicle value based upon it's age.
	 * 
	 * @param vehicle the vehicle.
	 * @return current vehicle value.
	 */
	public static final BigDecimal getCurrentVehicleValue(Vehicle vehicle) {
		BigDecimal vehicleAge = getVehicleAge(vehicle);
		BigDecimal depreciationEveryYear = new BigDecimal(DEPRECIATION_EVERY_YEAR);
		BigDecimal vehicleBasePrice = vehicle.getBasePrice();
		BigDecimal currentVehicleValue = vehicleBasePrice.subtract(vehicleAge.multiply(depreciationEveryYear));
		BigDecimal zeroValue = BigDecimal.valueOf(0);
		return currentVehicleValue.compareTo(zeroValue) > 0 ? currentVehicleValue : zeroValue;
	}

	/**
	 * @param vehicle The vehicle for which we want to determine the age.
	 * @return the age of the vehicle in number of years.
	 */
	private static BigDecimal getVehicleAge(Vehicle vehicle) {
		BigDecimal vehicleAge = BigDecimal.valueOf(LocalDate.now().getYear() - vehicle.getMakeYear());
		return vehicleAge;
	}
}
