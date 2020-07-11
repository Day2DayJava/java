/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import java.math.BigDecimal;

/**
 ************************************************************************
 * Class representing cars built by Tesla.								*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public class TeslaCar extends GroundVehicle implements Car, ZeroEmissionVehicle {

	private CarStyle carStyle = null;

	/**
	 * @param make the make/brand name of the vehicle manufacturer.
	 * @param makeYear the make year of the vehicle.
	 * @param model Vehicle Model
	 * @param basePrice Vehicle base price.
	 * @param carStyle the style of the Car
	 */
	protected TeslaCar(String make, Integer makeYear, String model, BigDecimal basePrice, CarStyle carStyle) {
		super(make, makeYear, model, basePrice);
		this.carStyle = carStyle;
	}

	@Override
	public CarStyle getCarStyle() {
		return this.carStyle;
	}

	@Override
	public String getConfiguration() {
		return String.format("TeslaCar [carStyle=%s, make=%s, makeYear=%s, model=%s]", getCarStyle(), getMake(),
				getMakeYear(), getModel());
	}

}
