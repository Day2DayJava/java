package com.day2dayjava.tutorials.java.interfaces;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ TestHondaCar.class, TestHondaMotorcycle.class, TestVehicleDepreciationCalculator.class,
		TestGenericVehicleWash.class, TestCarWash.class, TestMotorcycleWash.class, TestTeslaCar.class,
		TestCarPoolLaneEligibilityChecker.class, TestLatestMakeVehicleSelector.class, TestDefaultMethods.class,
		TestCarWashWithLambda.class })
public class AllJavaInterfacesTests {

}
