/**
 * 
 */
package com.day2dayjava.tutorials.java.interfaces;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 ************************************************************************
 * Test class for CarPoolLaneEligibilityChecker.						*
 *																		*
 * @author D2DJ															*
 ************************************************************************
 **/
@ExtendWith(MockitoExtension.class)
class TestCarPoolLaneEligibilityChecker {

	@Mock
	HondaCar hondaCar;
	@Mock
	TeslaCar teslaCar;

	/**
	 * Test method for {@link com.day2dayjava.tutorials.java.interfaces.CarPoolLaneEligibilityChecker#isEligible(com.day2dayjava.tutorials.java.interfaces.Vehicle)}.
	 */
	@Test
	final void testIsEligible() {
		assertFalse(CarPoolLaneEligibilityChecker.isEligible(hondaCar));
		assertTrue(CarPoolLaneEligibilityChecker.isEligible(teslaCar));
	}

}
