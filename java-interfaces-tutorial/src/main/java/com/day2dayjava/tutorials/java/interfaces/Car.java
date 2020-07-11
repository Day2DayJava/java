/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

/**
 ************************************************************************
 * Example for an interface extending another interface. This interface *
 * represents all Vehicles that represent the Vehicle Category Car.     *
 *                                                                      *
 * @author D2DJ                                                         *
 ************************************************************************
 **/
public interface Car extends Vehicle {
	enum CarStyle {
		COUPE, CONVERTIBLE, SEDAN, WAGON, HATCHBACK, SUV
	}

	/**
	 * Member attributes, that are a constant.
	 **/
	int MIN_DOORS = 1;
	int MAX_DOORS = 5;

	//Returns the body style of the car. For example one of Coupe, Convertible,
	//Sedan, Wagon, Hatchback, SUV etc.
	CarStyle getCarStyle();
}
