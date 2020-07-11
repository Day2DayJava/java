/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

/**
 ************************************************************************
 * Specific implementation of VehicleWash that washes only cars.		*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public class CarWash implements VehicleWash<Car> {

	@Override
	public void wash(Car car) {
		System.out.println(String.format("Your car \"%s\" is clean now.", car.getConfiguration()));
	}

}
