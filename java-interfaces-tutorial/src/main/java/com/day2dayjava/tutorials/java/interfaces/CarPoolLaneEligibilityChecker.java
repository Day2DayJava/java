/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

/**
 ************************************************************************
 * Utility class that checks whether a vehicle is eligible to be driven *
 * in a car pool lane.													*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public abstract class CarPoolLaneEligibilityChecker {

	/**
	 * Verifies the eligibility of a vehicle to be driven in a car pool lane.
	 * 
	 * @param vehicle vehicle to verify.
	 * @return whether it is eligible or not.
	 */
	public static boolean isEligible(Vehicle vehicle) {
		if (vehicle instanceof ZeroEmissionVehicle) {
			return true;
		}
		return false;
	}
}
