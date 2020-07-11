/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import java.math.BigDecimal;

/**
 ************************************************************************
 * Class representing cars built by Honda.								*
 *																		*
 * @author D2DJ														    *
 ************************************************************************
 **/
public class HondaMotorcycle extends GroundVehicle implements Motorcycle {

	private MotorCycleStyle motorCycleStyle = null;

	/**
	 * @param make the make/brand name of the vehicle manufacturer.
	 * @param makeYear the make year of the vehicle.
	 * @param model Vehicle Model
	 * @param basePrice Vehicle base price.
	 * @param motorCycleStyle the style of the Motorcycle.
	 */
	protected HondaMotorcycle(String make, Integer makeYear, String model, BigDecimal basePrice,
			MotorCycleStyle motorCycleStyle) {
		super(make, makeYear, model, basePrice);
		this.motorCycleStyle = motorCycleStyle;
	}

	@Override
	public MotorCycleStyle getMotorCycleStyle() {
		return this.motorCycleStyle;
	}

	@Override
	public String getConfiguration() {
		return String.format("HondaMotorcycle [motorCycleStyle=%s, make=%s, makeYear=%s, model=%s]",
				getMotorCycleStyle(), getMake(), getMakeYear(), getModel());
	}
}
