/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

/**
 ************************************************************************
 * This interface represents a vehicle wash facility and exposes the    *
 * basic wash operation.												*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
public interface VehicleWash<T extends Vehicle> {
	void wash(T vehicle);
}
