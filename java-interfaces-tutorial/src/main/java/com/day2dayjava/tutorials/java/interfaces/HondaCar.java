/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import java.math.BigDecimal;

/**
 ************************************************************************
 * Class representing cars built by Honda.								*
 *																		*
 * @author D2DJ                                                      	*
 ************************************************************************
 **/
public class HondaCar extends GroundVehicle implements Car {

	private CarStyle carStyle = null;

	/**
	 * @param make the make/brand name of the vehicle manufacturer.
	 * @param makeYear the make year of the vehicle.
	 * @param model Vehicle Model
	 * @param basePrice Vehicle base price.
	 * @param carStyle the style of the Car
	 */
	protected HondaCar(String make, Integer makeYear, String model, BigDecimal basePrice, CarStyle carStyle) {
		super(make, makeYear, model, basePrice);
		this.carStyle = carStyle;
	}

	@Override
	public CarStyle getCarStyle() {
		return this.carStyle;
	}

	@Override
	public String getConfiguration() {
		return String.format("HondaCar [carStyle=%s, make=%s, makeYear=%s, model=%s]", getCarStyle(), getMake(),
				getMakeYear(), getModel());
	}

	@Override
	public void turnOnEconomyMode() {
		System.out.print("Economy mode is on now.");
	}

}
