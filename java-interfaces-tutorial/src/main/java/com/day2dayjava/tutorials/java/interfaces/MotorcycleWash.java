/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

/**
 ************************************************************************
 * Specific implementation of VehicleWash that washes only motorcycles.	*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public class MotorcycleWash implements VehicleWash<Motorcycle> {

	@Override
	public void wash(Motorcycle motorcycle) {
		System.out.println(String.format("Your motorcycle \"%s\" is clean now.", motorcycle.getConfiguration()));
	}

}
