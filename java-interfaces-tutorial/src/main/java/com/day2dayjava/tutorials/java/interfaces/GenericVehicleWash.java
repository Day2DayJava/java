/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

/**
 ************************************************************************
 * Generic implementation of VehicleWash that can wash any kind of		* 
 * Vehicles.															*
 * 																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public class GenericVehicleWash<T extends Vehicle> implements VehicleWash<T> {

	@Override
	public void wash(T vehicle) {
		System.out.println(String.format("Your \"%s\" is clean now.", vehicle.getConfiguration()));
	}

}
