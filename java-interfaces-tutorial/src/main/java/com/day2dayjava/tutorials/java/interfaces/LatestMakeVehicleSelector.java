/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 ************************************************************************
 * This interface provides a utility method to select the latest		*
 * vehicle out of the given two vehicles.								*
 * @author D2DJ															*
 ************************************************************************
 **/
public interface LatestMakeVehicleSelector {

	static List<Vehicle> getLatestMakeVehicles(List<Vehicle> vehicles) {
		if (vehicles != null) {
			return vehicles.stream()
					.collect(Collectors.groupingBy(Vehicle::getMakeYear, TreeMap::new, Collectors.toList())).lastEntry()
					.getValue();
		}
		return Collections.emptyList();
	}
}
