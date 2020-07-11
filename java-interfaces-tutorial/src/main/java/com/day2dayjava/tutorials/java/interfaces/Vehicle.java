/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import java.math.BigDecimal;

/**
 ************************************************************************
 * An interface to represent Vehicles. This interface has just methods. *
 * 																		*	
 * @author D2DJ 														*
 ************************************************************************
 **/
public interface Vehicle {
	//Returns the make/brand name of the vehicle manufacturer.
	String getMake();

	// Returns the make year of the vehicle.
	Integer getMakeYear();

	// Returns the Vehicle Model
	String getModel();

	//Returns the detailed specification of the Vehicle.
	String getConfiguration();

	//Returns the base price of the vehicle that goes out of the box 
	//without any customizations.
	BigDecimal getBasePrice();

	//Default method that provides each vehicle a capability to run in economy mode.
	//saving fuel and increasing mileage.
	default void turnOnEconomyMode() {
		throw new UnsupportedOperationException("Eco mode is not available for your vehicle.");
	}

}
