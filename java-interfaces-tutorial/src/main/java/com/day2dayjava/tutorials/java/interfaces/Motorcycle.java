/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

/**
 ************************************************************************
 * An interface extending another interface. This interface represents  *
 * all Vehicles that represent the Vehicle Category Motorcycle.  		*
 *																		* 
 * @author D2DJ 														*
 ************************************************************************
 **/
public interface Motorcycle extends Vehicle {
	enum MotorCycleStyle {
		STANDARD, CRUISER, SPORT_BIKE, SCOOTER, OFF_ROAD, TOURING
	}

	//Returns the body style of the car. For example one of Standard, Cruiser, 
	//Sport Bike, Scooter, Off-road, Touring etc.
	MotorCycleStyle getMotorCycleStyle();
}
