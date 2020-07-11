/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import java.math.BigDecimal;

/**
 ************************************************************************
 * An abstract class providing a default behavior for the common method.*
 * 																		*	
 * @author D2DJ 														*
 ************************************************************************
 **/
public abstract class GroundVehicle implements Vehicle {
	protected String make;
	protected Integer makeYear;
	protected String model;
	protected BigDecimal basePrice;

	/**
	 * @param make the make/brand name of the vehicle manufacturer.
	 * @param makeYear the make year of the vehicle.
	 * @param model Vehicle Model.
	 * @param basePrice Vehicle base price.
	 */
	protected GroundVehicle(String make, Integer makeYear, String model, BigDecimal basePrice) {
		super();
		this.make = make;
		this.makeYear = makeYear;
		this.model = model;
		this.basePrice = basePrice;
	}

	// Returns the make/brand name of the vehicle manufacturer.
	@Override
	public String getMake() {
		return this.make;
	}

	// Returns the make year of the vehicle.
	@Override
	public Integer getMakeYear() {
		return this.makeYear;
	}

	// Returns the Vehicle Model
	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public BigDecimal getBasePrice() {
		return this.basePrice;
	}

	// Prints the detailed specification of the Vehicle.
	@Override
	public String getConfiguration() {
		return String.format("GroundVehicle [make=%s, makeYear=%s, model=%s]", getMake(), getMakeYear(), getModel());
	}
}
